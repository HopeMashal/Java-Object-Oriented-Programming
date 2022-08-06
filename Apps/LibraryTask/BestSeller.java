package Apps.LibraryTask;

public class BestSeller extends Book {
  private String Book_Summary;
  private int Book_WorldCopies;

  public BestSeller(String name, double price, String summary, int worldCopies) {
		super(name, price);
    Book_Summary = summary;
    Book_WorldCopies = worldCopies;
	}

  public void PrintInfo(){
		super.PrintInfo();
    String name =super.getBook_Name();
    System.out.println(name+" summary is "+Book_Summary+". The number of copies in the world is "+Book_WorldCopies+".");
  }

  public String getInfo(){
    String name = super.getBook_Name();
    double price = super.getBook_Price();
    String info = "Best Seller: "+name+" - "+price+"$. Summary: "+Book_Summary+" , "+Book_WorldCopies+" Copies Sold!";
    return info;
  }

  public String getBook_Summary() {
    return Book_Summary;
  }

  public void setBook_Summary(String book_Summary) {
    Book_Summary = book_Summary;
  }

  public int getBook_WorldCopies() {
    return Book_WorldCopies;
  }

  public void setBook_WorldCopies(int book_WorldCopies) {
    Book_WorldCopies = book_WorldCopies;
  }
}
