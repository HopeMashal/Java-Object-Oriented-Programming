package CompareBetweenSetsArray;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetArrays {
  public static void main(String[] args) {
    HashSet<Book> FirstSet = new HashSet<Book>();
    LinkedHashSet<Book> SecondSet = new LinkedHashSet<Book>();
    TreeSet<Book> ThirdSet = new TreeSet<Book>();

    Book b1= new Book("The secret", 310);
    Book b2= new Book("The space between the stars", 250);
    Book b3= new Book("The book of lost names", 310);
    Book b4= new Book("The book of names", 220);
    Book b5= new Book("The boy with one name", 170);

    FirstSet.add(b1);
    FirstSet.add(b2);
    FirstSet.add(b3);
    FirstSet.add(b4);
    FirstSet.add(b5);

    SecondSet.add(b1);
    SecondSet.add(b2);
    SecondSet.add(b3);
    SecondSet.add(b4);
    SecondSet.add(b5);

    ThirdSet.add(b1);
    ThirdSet.add(b2);
    ThirdSet.add(b3);
    ThirdSet.add(b4);
    ThirdSet.add(b5);

    System.out.println("\n--------------------First Set (HashSet)--------------------\n");
    for(Book myBook:FirstSet){
      System.out.println(myBook.toString());
    }

    System.out.println("\n--------------------Second Set (LinkedHashSet)--------------------\n");
    for(Book myBook:SecondSet){
      System.out.println(myBook.toString());
    }

    System.out.println("\n--------------------Third Set (TreeSet)--------------------\n");
    for(Book myBook:ThirdSet){
      System.out.println(myBook.toString());
    }
  }
}
