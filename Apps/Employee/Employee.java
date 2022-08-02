package Apps.Employee;

public class Employee {
  int Emp_id;
  String Ename, Depart;
  double Salary, Bonus;
  boolean Resident;

  public Employee(int id,String name){
    Emp_id=id;
    Ename=name;
  }

  public Employee(int id,String name, boolean r){
    this (id,name);
    Resident=r;
  }

  public void PrintEmpData(){
    System.out.println("Employee's ID is : "+Emp_id);
    System.out.println("Employee's Name is : "+Ename);
    System.out.println("Employee's Department is : "+Depart);
    System.out.println("Employee's Salary is : "+Salary);
    System.out.println("Employee's Bonus is : "+Bonus);
    System.out.println("Employees's Resident is : "+Resident);
  }
}
