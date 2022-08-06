/*_______________________________*/
//! Comparing and Copying Objects!! 

package Notes.lesson_6;

public class lesson_6 {
  public static void main(String[] args) {
    Room r1= new Room(10, 50);
    Room r2= new Room(10, 50);
    if(r1.isEqual(r2)) System.out.println("The objects are equal");
    else System.out.println("The objects are different");
  }
}

/*_______________________________*/