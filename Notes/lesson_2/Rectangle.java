/*_______________________________*/
//! Rectangle Class!! 

package Notes.lesson_2;

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