package osu.edu.cse5234.business.view;

public class Item implements java.io.Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 7989384413792152904L;
    private String name;
    private Double price;
    private Integer quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}
