/*_______________________________*/
//! Salaried Employee Class!! 

package Notes.lesson_10;

public class SalariedEmployee extends Employee {
  private double Bonus,Deductions;
  public SalariedEmployee(String name, int age, String address, String nationality,double salary,String rank, String job,double bonus, double deductions){
    super(name,age,address,nationality,salary,rank,job);
    Bonus=bonus;
    Deductions=deductions;
  }
  public void printInfo(){
    super.printInfo();
    System.out.println("The employee's bonus is "+Bonus+". the employee's deductions are "+Deductions);
  }
  @Override
  public double getSalary() {
    return Salary + Bonus-Deductions;
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
  
}

/*_______________________________*/