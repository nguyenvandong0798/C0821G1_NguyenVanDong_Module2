package s011_map.exercise;

import s011_map.exercise.model.Product;
import s011_map.exercise.service.IsProductService;
import s011_map.exercise.service.PriceComparator;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IsProductService {
    Scanner scanner = new Scanner(System.in);
    private static List<Product> listProduct = new ArrayList<>();

    @Override
    public void addAll() {
        System.out.println("nhập index");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = (scanner.nextLine());
        System.out.println("nhập code");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập nhà sản xuất");
        String origin = (scanner.nextLine());
        Product product = new Product(name, code,price, origin);
        listProduct.add(index, product);
    }

    @Override
    public void edit() {
        System.out.println("nhập index edit");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (index == i) ;
            System.out.println("nhập tên cần edit");
            String name = (scanner.nextLine());
            System.out.println("nhập code cần edit");
            int code = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập price cần edit");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập nơi sản xuất cần edit");
            String origin = (scanner.nextLine());
            listProduct.get(i).setName(name);
            listProduct.get(i).setCode(code);
            listProduct.get(i).setPrice(price);
            listProduct.get(i).setOrigin(origin);
        }
    }

    @Override
    public void reMove() {
        System.out.println("nhập index cần xoá");
        int index = Integer.parseInt(scanner.nextLine());
        listProduct.remove(index);

    }

    @Override
    public void display() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i).toString());
        }
    }

    @Override
    public void search() {
        boolean check = false;
        System.out.println("bạn cần tìm sản phẩm nào");
        String name = (scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++){
            if (listProduct.get(i).getName().equals(name)){
                System.out.println(name + " đã có trong hệ thống");
                check = true;
                break;
            }
        }if(check == false){
            System.out.println(name + " không có trong hệ thống");
        }
    }

    @Override
    public void rangeRaise() {
        Collections.sort(listProduct, Product::compareTo);
        for (int i = 0; i<listProduct.size(); i++){
            System.out.println(listProduct.get(i).toString());
        }
    }

    @Override
    public void rangeDown() {
        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(listProduct, priceComparator);
        for (int i = 0; i < listProduct.size(); i++){
            System.out.println(listProduct.get(i).toString());
        }
    }
}

