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
  public void printInfo(){
    System.out.println("This person's name is "+Name+". He/She is "+Age+" years old. His/her address is "+Address+" and his/her nationality is "+Nationality);
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
