/*_______________________________*/
//! Salaried Employee Class!!

package EmployeeClass;

public class SalariedEmployee extends Employee implements Displayable {
  private double Salary,Bonus,Deductions;

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, String address, int sSN, GENDER gender, double salary, double bonus,
      double deductions) {
    super(name, address, sSN, gender);
    Salary = salary;
    Bonus = bonus;
    Deductions = deductions;
  }

  public double getSalary() {
    return Salary;
  }

  public void setSalary(double salary) {
    Salary = salary;
  }

  public double getBonus() {
    return Bonus;
  }

  public void setBonus(double bonus) {
    Bonus = bonus;
  }

  public double getDeductions() {
    return Deductions;
  }

  public void setDeductions(double deductions) {
    Deductions = deductions;
  }

  @Override
  public double Earning() {
    // TODO Auto-generated method stub
    return Salary+Bonus-Deductions;
  }

  @Override
  public void DisplayAllDetails() {
    // TODO Auto-generated method stub
    System.out.println("<<<<<<<<<<<<<<<Salaried Employee Details>>>>>>>>>>>>>>>");
    System.out.println(super.toString());
    System.out.println(toString());
    DisplayEarning();
  }

  @Override
  public void DisplayEarning() {
    // TODO Auto-generated method stub
    System.out.println("Earning = "+Earning());
  }

  @Override
  public String toString() {
    return "SalariedEmployee [Bonus=" + Bonus + ", Deductions=" + Deductions + ", Salary=" + Salary + "]";
  }

}

/*_______________________________*/