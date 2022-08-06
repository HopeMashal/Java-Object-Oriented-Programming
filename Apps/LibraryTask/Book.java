package Apps.LibraryTask;

public class Book {
  private int Book_ID;
  private String Book_Name;
  private double Book_Price;
  private static int Book_LastID=0;

  public Book(){
    
  }

  public Book(String name, double price) {
		Book_Name = name;
    if (price > 0) Book_Price = price;
    Book_ID = Book_LastID +1;
    setBook_LastID();
	}

  public void PrintInfo(){
    System.out.println("The book's ID number is "+Book_ID+". The name of the book is "+Book_Name+". The price of the book is "+Book_Price+"$.");
  }

  public int getBook_ID() {
    return Book_ID;
  }

  public String getBook_Name() {
    return Book_Name;
  }

  public void setBook_Name(String book_Name) {
    Book_Name = book_Name;
  }

  public double getBook_Price() {
    return Book_Price;
  }

  public void setBook_Price(double book_Price) {
    if (book_Price > 0) Book_Price = book_Price;
  }

  public static int getBook_LastID() {
    return Book_LastID;
  }

  private static void setBook_LastID() {
    Book_LastID +=1;
  }
}
