package review.vihecle;

public class Vehicle {
    private String name;
    private String color;
    private int capacity;
    private int price;

    public Vehicle(){

    }
    public Vehicle(String name, String color, int capacity, int price){
        this.name =  name;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String info = "";
        if (capacity == 100){
            info = "Vehicle 1: " +
                    "\n" +"name = " + name +
                    "\n" +"color=" + color +
                    "\n" + "capacity = " + capacity +
                    "\n" +"price = " + price +
                    "\n" + "bạn cần đóng thuế 1% cho xe " +
                    "và lệ phí trước bạ của bạn cần thanh toán là :" + price * 0.01 +"\n";
        }
        else if (capacity > 200){
            info = "Vehicle 2: " +
                    "\n" + "name = " + name +
                    "\n" + "color =" + color +
                    "\n" + "capacity = " + capacity +
                    "\n" + "price = " + price +
                    "\n" + "bạn cần đóng thuế 5% cho xe " +
                    "và lệ phí trước bạ của bạn cần thanh toán là :" + price * 0.05 +"\n";
        }
        else{
            info = "Vehicle 3: " +
                    "\n" + "name = " + name +
                    "\n" + "color = " + color +
                    "\n" + "capacity = " + capacity +
                    "\n" + "price " + price +
                    "\n" + "bạn cần đóng thuế 3% cho xe " +
                    "và lệ phí trước bạ của bạn cần thanh toán là :" + price * 0.03 +"\n";
        }
        return info;
    }

}
