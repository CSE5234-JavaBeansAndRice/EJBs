package edu.osu.cse5234.business;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.osu.cse5234.business.view.Inventory;
import edu.osu.cse5234.business.view.InventoryService;
import edu.osu.cse5234.business.view.Item;

/**
 * Session Bean implementation class InventoryServiceBean
 */
@Stateless
@Remote(InventoryService.class)
public class InventoryServiceBean implements InventoryService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	String MY_QUERY = "Select i from Item i";

    /**
     * Default constructor.
     */
    public InventoryServiceBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Inventory getAvailableInventory() {
        Inventory inventory = new Inventory();
        List<Item> items = entityManager.createQuery(MY_QUERY, Item.class).getResultList();
        inventory.setItems(items);
        return inventory;
    }

    @Override
    public boolean validateQuantity(List<Item> items) {
    	boolean validate = true;
    	Inventory inventory = getAvailableInventory();
    	List<Item> actualItems = inventory.getItems();
    	for (int i =0; i < items.size(); i++) {
    		for (int j = 0; j < actualItems.size(); j++) {
    			if (items.get(i).getName().equalsIgnoreCase(actualItems.get(j).getName())) {
    		  		if (items.get(i).getAvailableQuantity() > actualItems.get(j).getAvailableQuantity()) {
    	    			validate = false;
    	    		}
    			}
    		}
 
    	}
        return validate;
    }

    @Override
    public boolean updateInventory(List<Item> items) {
    	if (validateQuantity(items)) {
    	      List<Item> actualItems = getAvailableInventory().getItems();
    	      for (int i =0; i < items.size(); i++) {
    	    		for (int j = 0; j < actualItems.size(); j++) {
    	    			if (items.get(i).getName().equalsIgnoreCase(actualItems.get(j).getName())) {
    	    		  		actualItems.get(j).setAvailableQuantity(actualItems.get(j).getAvailableQuantity() - items.get(i).getAvailableQuantity());
    	    			}
    	    		}
    	 
    	    	}
    	} else {
    		return false;
    	}
    	return true;
  
    }

}