package s011_map.exercise.model;

public class Product implements Comparable<Product> {
    private String name;
    private int code;
    private int price;
    private String origin;

    public Product (String name, int code,int price, String origin) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.origin = origin;
    }
    public Product(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getOrigin() {
        return origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.getPrice() - product.getPrice();
    }
}
