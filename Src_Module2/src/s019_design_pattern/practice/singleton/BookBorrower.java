package s019_design_pattern.practice.singleton;

public class BookBorrower {
    private BookSingleton borrowBook;
    private boolean haveBook = false;

    public void borrowBook() {
        borrowBook = BookSingleton.borrowBook();
        if (borrowBook == null) {
            haveBook = false;
        }else {
            haveBook = true;

        }
    }
    public String getAuthorAndTitle(){
        if (haveBook){
            return borrowBook.getAuthorAndTitle();
        }
        return "I don't have book";
    }
    public void returnBook(){
        borrowBook.returnBook(borrowBook);
    }
}
