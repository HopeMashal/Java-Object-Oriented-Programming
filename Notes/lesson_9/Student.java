/*_______________________________*/
//! Student Class!!

package Notes.lesson_9;

public class Student extends Person {
  private String Major;

  public Student(String name, String iD, String major) {
    super(name, iD);
    Major = major;
  }

  public void printInfo(){
    System.out.println("My name is "+Name+". My ID number is "+ID+". My major is "+Major);
  }

  public String getMajor() {
    return Major;
  }

  public void setMajor(String major) {
    Major = major;
  }

}
