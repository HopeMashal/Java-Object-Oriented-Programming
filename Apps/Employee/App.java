/*_______________________________*/
//! Employee App!! 

package Employee;

public class App {
  public static void main(String[] args) {
    Employee employee_1 = new Employee(12,"Hope",true);
    employee_1.PrintEmpData();
    System.out.println("\n------------------------------------------------------\n");

    Employee employee_2 = new Employee(15,"Yuki",1200.0,10.1,"Engineering",true);
    employee_2.PrintEmpData();
    System.out.println("\n------------------------------------------------------\n");
    System.out.println("Before Set Salary!!\n");
    employee_2.setSalary(5000, 200);
    employee_2.PrintEmpData();
  }
}

/*_______________________________*/