/*_______________________________*/
//! Rectangle Class!! 

package Notes.lesson_5;

public class Rectangle {
  private double length;
  private double width;
  public Rectangle(double length,double width){
    if(width>0 && length>0){
      this.width=width;
      this.length=length;
    } else {
      System.out.println("Width and Length must be positive number!!");
    }
  }
  public Rectangle(){
    length=10;
    width=15;
    System.out.println("A new room created with 10m length and 15m width");
  }
  public void modifyObject(Rectangle r){
    r.length=67;
    r.width=98;
  }
  public Rectangle add(Rectangle room){
    Rectangle result = new Rectangle();
    result.length= this.length+ room.length;
    result.width = this.width+ room.width;
    return result;
  }
  public void setLength(final double newLength){
    if(newLength>0) this.length=newLength;
    else System.out.println("Length must be positive number!!");
  }
  public void setWidth(final double newWidth){
    if(newWidth>0) this.width=newWidth;
    else System.out.println("Width must be positive number!!");
  }
  public double getLength(){
    return this.length;
  }
  public double getWidth(){
    return this.width;
  }
  public double getArea(){
    return this.width*this.length;
  }
}

/*_______________________________*/