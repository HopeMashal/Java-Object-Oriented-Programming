package Notes.lesson_2;

public class Rectangle {
  private double length;
  private double width;
  public Rectangle(double length,double width){
    this.width=width;
    this.length=length;
  }
  public void setLength(final double newLength){
    this.length=newLength;
  }
  public void setWidth(final double newWidth){
    this.width=newWidth;
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
