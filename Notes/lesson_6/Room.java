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
  public boolean isEqual(Room r){
    if(this.Length == r.Length && this.Width == r.Width) return true;
    else return false;
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
