/*_______________________________*/
//! Comparing and Copying Objects!! 

package Notes.lesson_6;

public class lesson_6 {
  public static void main(String[] args) {
    Room r1= new Room(10, 50);
    Room r2= new Room(10, 50);
    if(r1.isEqual(r2)) System.out.println("The objects are equal");
    else System.out.println("The objects are different");
    Room r3 = r2; // r3 and r2 are the same object
    if(r2==r3) System.out.println("The objects are equal");
    else System.out.println("The objects are different");
    System.out.println(r2.getLength());
    r3.setLength(30);
    System.out.println(r2.getLength());
    Room r4 = new Room(r1);
    System.out.println(r4.getLength());
    System.out.println(r4.getWidth());
    r1.setLength(120);
    System.out.println(r4.getLength());
    System.out.println(r1.getLength());
  }
}

/*_______________________________*/

//! Methods that copy objects:

//? There are two ways to copy an object:

//? Reference only copy, this is simply copying the address of an object into another reference variable --> Ex Room r3=r2;

//? Deep Copy (Correct), this involves creating a new instance of the class and copying the values from one object into the new object

/*_______________________________*/