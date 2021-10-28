package s016_Stream2.exercise.model;

import java.io.Serializable;

public class Product implements Serializable {


    private int id;
    private String name;
    private String nation;
    private double price;
    private String Status;

    public Product() {
    }

    public Product(int id, String name, String nation, double price, String status) {
        this.id = id;
        this.name = name;
        this.nation = nation;
        this.price = price;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", price=" + price +
                ", Status='" + Status + '\'' +
                '}';
    }
}

