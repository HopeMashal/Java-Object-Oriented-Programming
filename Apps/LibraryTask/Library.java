/*_______________________________*/
//! Library Class!! 

package Apps.LibraryTask;

public class Library {
  public static void main(String[] args) {
    Storage myStock = new Storage();

    Book book_1 = new Book("The secret", 120.5);
    Book book_2 = new Book("The little prince", 159);
    Book book_3 = new Book("They both die at the end", 132);
    Book book_4 = new Book("Shadow Scale", 132);

    BestSeller best_1=new BestSeller("The book of lost Names", 110, "Eva Traube Abrams, a semi-retired librarian in Florida, is shelving books one morning when her eyes lock on a photograph in a magazine lying open nearby. She freezes; it's an image of a book she hasn't seen in sixty-five years-a book she recognizes as The Book of Lost Names", 200);
    BestSeller best_2=new BestSeller("The names they gave us", 210, "Everything is going right for Lucy Hansson, until her mom's cancer reappears. Just like that, Lucy breaks with all the constants in her life: her do-good boyfriend, her steady faith, even her longtime summer church camp job", 300);
    BestSeller best_3=new BestSeller("The book of Names", 180, "Within each generation, there are thirty-six righteous souls. Their lives hold the key to the fate of the world. Now someone wants them dead", 500);

    myStock.addBook(book_1, 5);
    myStock.addBook(book_2, 6);
    myStock.addBook(book_3, 1);
    myStock.addBook(best_1, 2);
    myStock.addBook(best_2, 3);
    myStock.addBook(best_3, 4);
    myStock.addBook(best_2, 3);

    best_1.PrintInfo();
    best_2.PrintInfo();
    best_3.PrintInfo();
    System.out.println("******************");
    System.out.println(best_1.getInfo());
    System.out.println(best_2.getInfo());
    System.out.println(best_3.getInfo());
    System.out.println("******************");

    myStock.printStock();
    System.out.println("******************");

    System.out.println(myStock.rentBook(book_1));
    System.out.println(myStock.rentBook(best_1));
    System.out.println(myStock.rentBook(best_1));
    System.out.println(myStock.rentBook(best_1));
    System.out.println(myStock.rentBook(book_4));
    System.out.println("******************");

    System.out.println(book_1.getBook_Name()+", the number of copies available now is "+ myStock.getInStock(book_1));
    System.out.println(best_1.getBook_Name()+", the number of copies available now is "+ myStock.getInStock(best_1));
    System.out.println(best_2.getBook_Name()+", the number of copies available now is "+ myStock.getInStock(best_2));
    System.out.println("******************");

    myStock.printStock();
    System.out.println("******************");

    myStock.returnBook(book_1);

    myStock.printStock();
    System.out.println("******************");

  }
}

/*_______________________________*/