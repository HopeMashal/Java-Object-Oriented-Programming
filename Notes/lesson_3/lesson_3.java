/*_______________________________*/
//! Constructors and Constructor Overloading!! 

package Notes.lesson_3;

public class lesson_3 {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    System.out.println(r1.getLength());
    System.out.println(r1.getWidth());
    r1.setLength(20);
    r1.setWidth(13);
    System.out.println(r1.getLength());
    System.out.println(r1.getWidth());
  }
}

/*_______________________________*/

//! Constructors:

//? Classes can have special methods called constructors
//? A constructor is a method that is automatically called when an object is created.
//? Constructors are used to perform operations at the time an object is created.
//? Constructors typically initialize instance fields and perform other object initialization tasks.

/*
  * Constructors have the same name as the class
  * Constructors have no return type (not even void)
  * Constructors may not return any values
  * Constructors are typically public
*/

/*_______________________________*/