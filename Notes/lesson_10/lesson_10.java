/*_______________________________*/
//! Abstract Class and Abstract Method!! 

package Notes.lesson_10;

public class lesson_10 {
  public static void main(String[] args) {
    
  }
}

/*_______________________________*/

//! Abstract

//? An abstract class can't be instantiated, but other classes are derived from it.
//? An abstract class serves as a superclass for other classes
//? The abstract class represent the generic or abstract from of all the classes that are derived from it
//? A class becomes abstract when you place the abstract key word in the class definition

//? public abstract class ClassName

/*_______________________________*/

//! Abstract Methods

//? An abstract method is a method that appears in a superclass, but expects to be overridden in a subclass
//? An abstract method has no body and must be overridden in a subclass
//? AccessSpecifier abstract ReturnType MethodName(PArameterList);
//? Ex: public abstract void GetSalary();

//? Any class that contains an abstract method is automatically abstract
//? Abstract methods are used to ensure that a subclass implements the method
//? If a subclass fails to override an abstract method, a compiler error will result

/*_______________________________*/