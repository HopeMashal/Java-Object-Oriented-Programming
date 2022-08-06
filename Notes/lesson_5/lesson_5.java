/*_______________________________*/
//! Passing an object to a method!! 

package Notes.lesson_5;

public class lesson_5 {
  public static void main(String[] args) {
    Rectangle room = new Rectangle(32,33);
    double roomLength = 50;
    room.setLength(roomLength);
    System.out.println(room.getLength());
    room.modifyObject(room);
    System.out.println(room.getLength());
    Rectangle room1 = new Rectangle(32,54);
    Rectangle r3 = new Rectangle();
    Rectangle r4 = r3.add(room1);
    System.out.println(r4.getLength());
    System.out.println(r4.getWidth());
  }
}

/*_______________________________*/

//! Passing objects as arguments:

//? Objects can be passed to methods as arguments
//? Java passes all arguments by value
//? When an object is passed as an argument, the value of the reference variable is passed
//? The value of the reference variable is an address or reference to the object in memory
//? A copy of the object is not passed, just a pointer to the object
//? When a method receives a reference variable as an argument, it is possible for the method to modify the contents of the object referenced by the variable

/*_______________________________*/