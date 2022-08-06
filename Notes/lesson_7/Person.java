package Notes.lesson_7;

public class Person {
  private String Name,Address,Nationality;
  private int Age;
  public Person(String name, int age, String address, String nationality){
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
  public int getAge() {
    return Age;
  }
  public void setAge(int age) {
    Age = age;
  }
  
}
