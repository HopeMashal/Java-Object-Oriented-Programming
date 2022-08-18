package CompareBetweenMapAndSet;

public class Student implements Comparable<Student> {
  private String Name, IDNum, MobileNumber;

  public Student(String name, String iDNum, String mobileNumber) {
    Name = name;
    IDNum = iDNum;
    MobileNumber = mobileNumber;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getIDNum() {
    return IDNum;
  }

  public void setIDNum(String iDNum) {
    IDNum = iDNum;
  }

  public String getMobileNumber() {
    return MobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    MobileNumber = mobileNumber;
  }

  @Override
  public String toString() {
    return "Student [IDNum=" + IDNum + ", MobileNumber=" + MobileNumber + ", Name=" + Name + "]";
  }

  @Override
  public int compareTo(Student o) {
    int thisID = Integer.parseInt(this.IDNum);
    int oID = Integer.parseInt(o.IDNum);
    return thisID - oID;
  }

}
