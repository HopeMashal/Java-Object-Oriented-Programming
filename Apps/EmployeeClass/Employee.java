/*_______________________________*/
//! Employee Class!!

package EmployeeClass;

enum GENDER{Male,Female};
public abstract class Employee {
  private String Name,Address;
  private int SSN;
  private GENDER Gender;
  
  public Employee() {
  }

  public Employee(String name, String address, int sSN, GENDER gender) {
    Name = name;
    Address = address;
    SSN = sSN;
    Gender = gender;
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

  public int getSSN() {
    return SSN;
  }

  public void setSSN(int sSN) {
    SSN = sSN;
  }

  public GENDER getGender() {
    return Gender;
  }

  public void setGender(GENDER gender) {
    Gender = gender;
  }

  public abstract double Earning();

  @Override
  public String toString() {
    return "Employee [Address=" + Address + ", Gender=" + Gender + ", Name=" + Name + ", SSN=" + SSN + "]";
  }

}

/*_______________________________*/