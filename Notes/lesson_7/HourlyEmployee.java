/*_______________________________*/
//! Hourly Employee Class!! 

package Notes.lesson_7;

public class HourlyEmployee extends Employee {
  private double Working_Hours,Hours_Rate;
  public HourlyEmployee(String name, int age, String address, String nationality,double salary,String rank, String job,double hours,double rate){
    super(name,age,address,nationality,salary,rank,job);
    Working_Hours=hours;
    Hours_Rate=rate;
  }
  public void printInfo(){
    super.printInfo();
    System.out.println("The employee's working hours is "+Working_Hours+". the employee's hours rate is "+Hours_Rate);
  }
  @Override
  public double getSalary() {
    return Working_Hours*Hours_Rate;
  }
  public double getWorking_Hours() {
    return Working_Hours;
  }
  public void setWorking_Hours(double working_Hours) {
    Working_Hours = working_Hours;
  }
  public double getHours_Rate() {
    return Hours_Rate;
  }
  public void setHours_Rate(double hours_Rate) {
    Hours_Rate = hours_Rate;
  }
  
}

/*_______________________________*/