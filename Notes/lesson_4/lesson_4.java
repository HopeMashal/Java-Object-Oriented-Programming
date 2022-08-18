/*_______________________________*/
//! Static Methods and Fields!! 

package Notes.lesson_4;

public class lesson_4 {
  public static void main(String[] args) {
    Car car_1 = new Car("KIA", 2022);
    Car car_2 = new Car("KIA", 2021);
    Car car_3 = new Car("KIA", 2020);
    Car car_4 = new Car("KIA", 2023);
    System.out.println(Car.getNoOfObjects());
    int sum = Calculator.add(3, 2);
    int sub = Calculator.sub(3, 2);
    int mult = Calculator.mult(3, 2);
    System.out.println(sum);
    System.out.println(sub);
    System.out.println(mult);
    System.out.println(car_1.getCarMarker());
    System.out.println(car_2.getCarModel());
    System.out.println(car_3.getCarMarker());
    System.out.println(car_4.getCarModel());
  }
}

/*_______________________________*/

//! Static Method:

//? Static fields and static methods do not belong to a single instance of a class.
//? To invoke a static method or use a static field, the class name, rather than the instance name, is used.
//? Ex. double num = Math.sqrt(9.0);

/*_______________________________*/