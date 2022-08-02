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

  public Employee(int id,String name, double salary, double bonus, String depart, boolean r){
    this (id,name,r);
    Salary=salary;
    Bonus = bonus;
    Depart=depart;
  }

  public void PrintEmpData(){
    System.out.println("Employee's ID is : "+Emp_id);
    System.out.println("Employee's Name is : "+Ename);
    System.out.println("Employee's Department is : "+Depart);
    System.out.println("Employee's Salary is : "+Salary);
    System.out.println("Employee's Bonus is : "+Bonus);
    System.out.println("Employees's Resident is : "+Resident);
  }

  public int getEmp_id() {
    return Emp_id;
  }

  public void setEmp_id(int emp_id) {
    Emp_id = emp_id;
  }

  public String getEname() {
    return Ename;
  }

  public void setEname(String ename) {
    Ename = ename;
  }

  public String getDepart() {
    return Depart;
  }

  public void setDepart(String depart) {
    Depart = depart;
  }

  public double getSalary() {
    return Salary;
  }

  public void setSalary(double salary) {
    Salary = salary;
  }

  public void setSalary(double salary, double bonus) {
    this.setSalary(salary);
    Bonus = bonus;
  }

  public double getBonus() {
    return Bonus;
  }

  public void setBonus(double bonus) {
    Bonus = bonus;
  }

  public boolean isResident() {
    return Resident;
  }

  public void setResident(boolean resident) {
    Resident = resident;
  }
  
}
