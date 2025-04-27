class Book {
    String tittle = "OOP in Java";
    String author = "Hasnat";
    String isbn = "9876553210";

    public void get_details() {
        System.out.println(" Tittle is:" +tittle );
        System.out.println("Author name is:" +author);
        System.out.println("ISBN number is:" +isbn);
    }
}
class BorrowedBook extends Book {
    String borrower_name = "Jihad";
    String due_date ="25-08-2025";
    public void get_borrow_details(){
        get_details();
        System.out.println("Borrower name: " +borrower_name);
        System.out.println("Due Date: " +due_date);
    }    
}

class OOP_lab_2 {
    public static void main(String[] args) {
        BorrowedBook BB = new BorrowedBook();
        BB.get_borrow_details();
    }  
}