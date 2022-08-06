package Notes.lesson_7;

public class Person {
  private String Name,Address,Nationality;
  private double Age;
  public Person(String name, double age, String address, String nationality){
    Name=name;
    Age=age;
    Address=address;
    Nationality=nationality;
  }
  public Person(){
    
  }
  public void printInfo(){
    System.out.println("This person's name is "+Name+". This person's age is "+Age+" years old. This person's address is "+Address+" and this person's nationality is "+Nationality);
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
  
}
