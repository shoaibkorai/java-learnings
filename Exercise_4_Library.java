import javax.sound.midi.Soundbank;

class Library{
    String []availableBooks;
    String []issuedBooks ;
    int noOfBooks;
    String [] books ;
    Library(){
        this.books = new String[100];
        this.noOfBooks = 0;

    }
    void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks ++ ;
    }
    void issueBook(String book){
        for (int i = 0 ; i < this.books.length; i ++){
            if(this.books[i].equals(book));
            {
                System.out.println("The book has been issued " + book);
                this.books[i] = null ;
                return;
            }
        }
        System.out.println("The book has been issued "+book);
        }


     void returnBook(String book){
        addBook(book);

    }
void showAvailableBooks(){
    System.out.println("Available Books In Library !");
   for (int i = 0 ; i < noOfBooks; i ++){
       if (books[i]== null)
           continue;

       System.out.println(books[i]);
   }

}
}

public class Exercise_4_Library {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library cl = new Library();
        cl.addBook("Living Dead ");
        cl.addBook("man of words");
        cl.addBook("think and grow rich ");
        cl.issueBook("Living Dead");
        cl.showAvailableBooks();

    }
}
