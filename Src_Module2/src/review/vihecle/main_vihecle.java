package review.vihecle;

public class main_vihecle {
    public static void main(String[] args) {
        Vehicle ware = new Vehicle("Ware alphal", "red and black", 100, 20000000);
        System.out.println(ware);

        Vehicle cbr = new Vehicle("CBR", "blue and black", 250, 95000000);
        System.out.println(cbr);

        Vehicle exciter = new Vehicle("exciter", "while and black", 150, 50000000);
        System.out.println(exciter);
    }
}
