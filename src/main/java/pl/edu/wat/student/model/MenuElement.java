package pl.edu.wat.student.model;

/**
 * Created by Witold on 2015-12-24.
 */
public class MenuElement {
    private String name;
    private String type;
    private String description;
    private String size;
    private double price;

    public MenuElement(String name, String type, String description, String size, double price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
