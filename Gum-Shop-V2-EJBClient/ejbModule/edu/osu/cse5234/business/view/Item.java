package edu.osu.cse5234.business.view;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="ITEM")
public class Item implements java.io.Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 7989384413792152904L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    
    @Column(name="ITEM_NUMBER") 
    private int itemNumber;
    
    @Column(name = "NAME")
    private String name;
    
    @Column(name="DESCRIPTION") 
    private String description;
    
    @Column(name="AVAILABLE_QUANTITY") 
    private int availableQuantity;
    
    @Column(name="UNIT_PRICE") 
    private double unitPrice;
    
    public Item() {
    	
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setItemNumber(int itemNumber) {
    	this.itemNumber = itemNumber;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    }
    
    public void setAvailableQuantity(int quantity) {
        this.availableQuantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getId() {
    	return this.id;
    }
    
    public int getItemNumber() {
    	return this.itemNumber;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }

    public int getAvailableQuantity() {
        return this.availableQuantity;
    }
    
    public double getUnitPrice() {
    	return this.unitPrice;
    }
}
