package CompareBetweenSetsArray;

public class Book implements Comparable<Book> {
  private String Name;
  private int NumOfPages;

  public Book(String name, int numOfPages) {
    Name = name;
    NumOfPages = numOfPages;
  }
  
  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public int getNumOfPages() {
    return NumOfPages;
  }

  public void setNumOfPages(int numOfPages) {
    NumOfPages = numOfPages;
  }

  @Override
  public String toString() {
    return "This Book named "+this.Name+" and has "+this.NumOfPages+" pages";
  }

  @Override
  public int compareTo(Book o) {
    if(this.NumOfPages > o.NumOfPages) return 1;
    else if(this.NumOfPages < o.NumOfPages) return -1;
    else return 0;
  }
  
}
