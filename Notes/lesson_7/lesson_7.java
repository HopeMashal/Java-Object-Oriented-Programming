/*_______________________________*/
//! Inheritance and Polymorphism!! 

package Notes.lesson_7;

public class lesson_7 {
  public static void main(String[] args) {
    Student std1 = new Student("Hope", 23, "Jerusalem", "Palestinian", 3, "Engineering", 3.2);
    std1.printInfo();
    System.out.println(std1.getName());
    Employee empl1= new Employee("Yuki", 26, "Yafo", "Palestinian", 2000, "team leader", "developer");
    empl1.printInfo();
    Employee empl2 = new SalariedEmployee("Akira", 22, "Tokyo", "Japanese", 4000, "leader", "Software", 200, 300);
    empl2.printInfo();
    System.out.println(empl2.getSalary());
  }
}

/*_______________________________*/

//! Inheritance and Constructors

//? Constructors are not inherited
//? When a subclass is instantiated, the superclass default constructor is executed first.
//? The super keyword refers to an object's superclass
//? The superclass constructor can be explicitly called from the subclass by using the super keyword

/*_______________________________*/