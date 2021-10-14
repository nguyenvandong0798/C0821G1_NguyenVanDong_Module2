package s09_araylist_and_linkedlist.practice.list_simple;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(0);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        System.out.println("element 3: " + listInteger.get(3));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));


        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}
