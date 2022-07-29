package Notes.lesson_2;

public class lesson_2 {
  public static void main(String[] args) {
    Rectangle rectangle_1 = new Rectangle(4, 5);
    System.out.println(rectangle_1.getWidth());
    System.out.println(rectangle_1.getLength());
    System.out.println(rectangle_1.getArea());
    rectangle_1.setLength(6);
    rectangle_1.setWidth(7);
    System.out.println(rectangle_1.getWidth());
    System.out.println(rectangle_1.getLength());
    System.out.println(rectangle_1.getArea());
  }
}
