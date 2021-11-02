package s019_design_pattern.practice.singleton;

public class Test {
    public static void main(String[] args) {
        BookBorrower bookBorrower = new BookBorrower();
        BookBorrower bookBorrower1 = new BookBorrower();

        bookBorrower.borrowBook();
        System.out.println("bookBorrower asked to borrow the book");
        System.out.println("bookBorrower Author and Title");
        System.out.println(bookBorrower.getAuthorAndTitle());

        bookBorrower1.borrowBook();
        System.out.println("bookBorrower1 asked to borrow the book");
        System.out.println("bookBorrower1 Author and Title");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower.getAuthorAndTitle());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}
