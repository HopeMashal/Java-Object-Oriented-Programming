/*_______________________________*/
//! Employee Class!! 

package Notes.lesson_11;

public abstract class Employee{
  protected String Name,Address,Nationality,Rank,Job;
  protected double Age,Salary;
  public Employee(String name, double age, String address, String nationality,double salary,String rank, String job){
    Name=name;
    Age=age;
    Address=address;
    Nationality=nationality;
    Salary=salary;
    Rank=rank;
    Job=job;
  }
  public Employee(){
    
  }
  public void printInfo(){
    System.out.println("This employee's name is "+Name+". This employee's age is "+Age+" years old. This employee's address is "+Address+" and this employee's nationality is "+Nationality+"The employee's salary is "+Salary+". the employee's rank is "+Rank+". The employee's job is "+Job);
  }
  public String getName() {
    return Name;
  }
  public void setName(String name) {
    Name = name;
  }
  public String getAddress() {
    return Address;
  }
  public void setAddress(String address) {
    Address = address;
  }
  public String getNationality() {
    return Nationality;
  }
  public void setNationality(String nationality) {
    Nationality = nationality;
  }
  public double getAge() {
    return Age;
  }
  public void setAge(double age) {
    Age = age;
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
  public abstract double getSalary();
  public void setSalary(double salary) {
    Salary = salary;
  }
  
}

/*_______________________________*/