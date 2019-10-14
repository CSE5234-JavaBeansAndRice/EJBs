package osu.edu.cse5234.business.view;

import java.util.List;

public class Inventory implements java.io.Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 7006614891731115360L;
    private List<Item> items;

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
