/*_______________________________*/
//! Employee Class!! 

package Notes.lesson_7;

public class Employee extends Person {
  private String Rank,Job;
  private double Salary;
  public Employee(String name, double age, String address, String nationality,double salary,String rank, String job){
    super(name,age,address,nationality);
    Salary=salary;
    Rank=rank;
    Job=job;
  }
  public Employee(){
    
  }
  public void printInfo(){
    super.printInfo();
    System.out.println("The employee's salary is "+Salary+". the employee's rank is "+Rank+". The employee's job is "+Job);
  }
  public String getRank() {
    return Rank;
  }
  public void setRank(String rank) {
    Rank = rank;
  }
  public String getJob() {
    return Job;
  }
  public void setJob(String job) {
    Job = job;
  }
  public double getSalary() {
    return Salary;
  }
  public void setSalary(double salary) {
    Salary = salary;
  }
  
}

/*_______________________________*/