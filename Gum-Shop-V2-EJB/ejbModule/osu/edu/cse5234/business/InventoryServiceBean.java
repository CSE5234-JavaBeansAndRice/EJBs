package osu.edu.cse5234.business;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import osu.edu.cse5234.business.view.InventoryService;

/**
 * Session Bean implementation class InventoryServiceBean
 */
@Stateless
@Remote(InventoryService.class)
public class InventoryServiceBean implements InventoryService {

    /**
     * Default constructor. 
     */
    public InventoryServiceBean() {
        // TODO Auto-generated constructor stub
    }

}
