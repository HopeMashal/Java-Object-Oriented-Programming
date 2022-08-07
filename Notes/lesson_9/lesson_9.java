/*_______________________________*/
//! Final Methods and Protected Members!! 

package Notes.lesson_9;

public class lesson_9 {
  public static void main(String[] args) {
    Student st1 = new Student("Yuki", "1213212", "Engineering");
    System.out.println(st1.getName());
    st1.setName("Hope");
    System.out.println(st1.getName());
    st1.printInfo();
  }
}

/*_______________________________*/

//! Preventing a method from Being Overridden

//? The final modifier will prevent the overriding of a superclass method in a subclass
//? public final void message()
//? If a subclass attempts to override a final method, the compiler generates an error
//? This ensures that a particular superclass method is used by subclasses rather than a modified version of it

//? final is a constant value you can't change it

/*_______________________________*/

//! Protected Members

//? Using protected instead of private makes some tasks easier
//? Any class that is derived from the class, or is in the same package, has unrestricted access to the protected member
//? It is always better to make all fields private and then provide public methods for accessing those fields
//? If no access specifier for a class member is provided, the class member is given package access by default
//? Any method in the same package may access the member

/*_______________________________*/