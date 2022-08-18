/*_______________________________*/
//! Storage Class!! 

package Apps.LibraryTask;

public class Storage {
  private static Book[] books;
  private static int[] inStock;
  private static int Storage_ID=0;

  public Storage(){
    int size=10;
    books = new Book[size];
    inStock = new int[size];
  }

  public void printStock(){
    for(int i=0;i<Storage_ID;i++){
      System.out.println("\n"+books[i].getBook_Name()+", the number of copies available is "+inStock[i]+".");
    }
  }

  public void addBook(Book newBook, int amount){
    try {
        int index = search(books, newBook);
        if (index==-1){
          books[Storage_ID] = newBook;
          inStock[Storage_ID]  = amount;
          Storage_ID +=1;
        } else {
          inStock[index] +=amount;
        }
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println("\nStorage is already FULL!!!!!!");
    }
  }

  public String rentBook(Book book){
    int index = search(books, book);
    String Msg;
    if(index != -1){
      if(inStock[index] == 0) Msg= "\nERROR!! There are no copies of this book!! "+book.getBook_Name()+"!!!!!!!!!";
      else {
        inStock[index] -=1;
        Msg = "\n"+book.getBook_Name()+", the number of copies available now is "+inStock[index]+".";
      }
    } else Msg = "\nERROR!! The book name entered is invalid!! "+book.getBook_Name()+"!!!!!!!!!";
    return Msg;
  }

  public void returnBook(Book book){
    int index = search(books, book);
    if(index != -1){ 
      inStock[index] +=1;
      System.out.println("\n"+book.getBook_Name()+", the number of copies available now is "+inStock[index]+".");
    } 
    else System.out.println("\nERROR!! The book name entered is invalid!! "+book.getBook_Name()+"!!!!!!!!!");
  }

  public int getInStock(Book book){
    int index = search(books, book);
    if(index != -1){ 
      System.out.println("\n"+book.getBook_Name()+", the number of copies available now is "+inStock[index]+".");
      return inStock[index];
    }
    else { 
      System.out.println("\nERROR!! The book name entered is invalid!! "+book.getBook_Name()+"!!!!!!!!!");
      return -1;
    }
  }

  public static int search (Book[] list, Book target){
    for(int i =0;i<list.length;i++){
      if(list[i]==target) return i;
    }
    return -1;
  }
}

/*_______________________________*/