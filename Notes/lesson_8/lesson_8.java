/*_______________________________*/
//! Inheritance and Method Overriding!! 

//? I used lesson_7 classes

package Notes.lesson_8;

import Notes.lesson_7.SalariedEmployee;

public class lesson_8 {
  public static void main(String[] args) { 
    SalariedEmployee se1 = new SalariedEmployee("Moshi", 27, "Jerusalem", "Palestinian", 3000, "Manager", "Engineer", 400, 50);
    System.out.println(se1.getSalary());
    se1.printInfo(); 
  }
}

/*_______________________________*/

//! Overriding SuperClass Methods:

//? A subclass may have a method with the same signature as a superclass method.
//? The subclass method overrides the superclass method.
//? This is known as method overriding
//? A subclass method that overrides a superclass method must have the same signature as the superclass method
//? An object of the subclass invokes the subclass's version of the method, not the superclass's
//? The @Override annotation should be used just before the subclass method

/*_______________________________*/