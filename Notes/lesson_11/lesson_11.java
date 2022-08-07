/*_______________________________*/
//! Interfaces!! 

package Notes.lesson_11;

public class lesson_11 {
  public static void main(String[] args) {
    compactDisc obj1= new compactDisc();
    obj1.getRetailPrice();
    RetailItem r1 = new compactDisc();
    r1.getRetailPrice();
  }
}

/*_______________________________*/

//! Interface

//? An interface is similar to an abstract class that has all abstract methods (It can't be instantiated, and all of the methods listed in an interface must be written eleswhere)
//? The purpose of an interface is to specify behavior for other classes
//? It is often said that an interface is like a "contract", and when a class implements an interface it must adhere to the contract
//? The general format of an interface definition:
/* 
 * public interface InterfaceName{
 * (Method headers)
 * }
 */

//? A class can implement one or more interfaces
//? If a class implements an interface, it uses the implements keyword in the class header
/* 
 * public interface RetailItem{
 * (Method headers)
 * }
 * public class CD implements RetailItem
 * public class Book implements RetailItem
 */

/*_______________________________*/

//! Implementing Multiple Interfaces

//? A class can be derived from only one superclass
//? Java allows a class to implement multiple interfaces
//? When a class implement multiple interfaces, it must provide the methods specified by all of them
//? To specify multiple interfaces in a class definition, simply list the names of the interfaces, separated by commas, after the implements keywords
/* 
 * public class MyClass implements Interface1, Interface2, Interface3
 */

/*_______________________________*/