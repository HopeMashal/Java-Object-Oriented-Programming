/*_______________________________*/
//! Salaried Employee Class!! 

package Notes.lesson_7;

public class SalariedEmployee extends Employee {
  private double Bonus;
  private String Deductions;
  public SalariedEmployee(String name, int age, String address, String nationality,double salary,String rank, String job,double bonus, String deductions){
    super(name,age,address,nationality,salary,rank,job);
    Bonus=bonus;
    Deductions=deductions;
  }
  public void printInfo(){
    super.printInfo();
    System.out.println("The employee's bonus is "+Bonus+". the employee's deductions are "+Deductions);
  }
  public double getBonus() {
    return Bonus;
  }
  public void setBonus(double bonus) {
    Bonus = bonus;
  }
  public String getDeductions() {
    return Deductions;
  }
  public void setDeductions(String deductions) {
    Deductions = deductions;
  }
  
}

/*_______________________________*/