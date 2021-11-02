package s019_design_pattern.practice.singleton;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanOut;

    private BookSingleton() {
        author = "Bob, Tom, Herry";
        title = "Design Pattern";
        book = null;
        isLoanOut = false;
    }

//    method borrow book
    public static BookSingleton borrowBook() {
        if (!isLoanOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanOut = true;
            return book;
        }
        return null;
    }

//    method return book
    public void returnBook(BookSingleton bookReturned){
        isLoanOut = false;
    }

//    method get return book
    public String getAuthor(){
        return author;

    }
    public String getTitle(){
        return title;

    }
    public String getAuthorAndTitle(){
        return getAuthor() + "by" + getTitle();
     }
}

