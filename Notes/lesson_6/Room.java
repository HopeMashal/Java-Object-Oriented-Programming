/*_______________________________*/
//! Room Class!! 

package Notes.lesson_6;

public class Room {
  private int Width,Length;
  public Room(int width,int length){
    Width=width;
    Length=length;
  }
  public Room(){
    Width=10;
    Length=15;
  }
  // isEqual Method
  public boolean isEqual(Room r){
    if(this.Length == r.Length && this.Width == r.Width) return true;
    else return false;
  }
  // Copy Constructors
  //? A copy constructor accepts an existing object of the same class and clones it
  public Room(Room r){
    Width = r.Width;
    Length = r.Length;
  }
  public int getWidth() {
    return Width;
  }
  public void setWidth(int width) {
    Width = width;
  }
  public int getLength() {
    return Length;
  }
  public void setLength(int length) {
    Length = length;
  }
  
}

/*_______________________________*/