package osu.edu.cse5234.business.view;

import java.util.List;

public interface InventoryService {
    public Inventory getAvailableInventory();

    public boolean validateQuantity(List<Item> items);

    public boolean updateInventory(List<Item> items);
}
