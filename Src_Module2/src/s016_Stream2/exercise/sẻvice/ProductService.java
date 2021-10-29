package s016_Stream2.exercise.sẻvice;


import s016_Stream2.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductService {

    private static List<Product> listProduct = new ArrayList<>();
    List<Product> productWriteFile;

    {
        productWriteFile = writeToFile("D:\\3.sourcecode_moule_2\\Src_Module2\\src\\s016_Stream2\\exercise\\model\\product.txt", listProduct);
    }

    List<Product> productReadFile = ReadToFile("D:\\3.sourcecode_moule_2\\Src_Module2\\src\\s016_Stream2\\exercise\\model\\product.txt");

    public static void addAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập index ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập id ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập tên ");
        String name = (scanner.nextLine());
        System.out.print("nhập nhà sản xuất ");
        String origin = (scanner.nextLine());
        System.out.print("nhập price ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập status ");
        String status = (scanner.nextLine());
        Product product = new Product(id, name, origin, price, status);
        listProduct.add(index, product);
    }

    public static void display() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i).toString());
        }
    }

    public static void Search() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        System.out.println("bạn cần tìm sản phẩm nào");
        String name = (scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(name)) {
                System.out.println(name + " đã có trong hệ thống");
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println(name + " không có trong hệ thống");
        }
    }

    public static List<Product> writeToFile(String path, List<Product> listProduct) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listProduct);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    public static List<Product> ReadToFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }
}
