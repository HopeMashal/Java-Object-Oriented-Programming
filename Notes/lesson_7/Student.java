package Notes.lesson_7;

public class Student extends Person {
  private String Study_Level, Specialization, GPA;
  public Student(String name, int age, String address, String nationality,String study,String special,String gpa){
    super(name,age,address,nationality);
    Study_Level = study;
    Specialization=special;
    GPA=gpa;
  }
  public void printInfo(){
    super.printInfo();
    System.out.println("The student's study level is "+Study_Level+". the student's specialization is "+Specialization+". The student's GPA is "+GPA);
  }
  public String getStudy_Level() {
    return Study_Level;
  }
  public void setStudy_Level(String study_Level) {
    Study_Level = study_Level;
  }
  public String getSpecialization() {
    return Specialization;
  }
  public void setSpecialization(String specialization) {
    Specialization = specialization;
  }
  public String getGPA() {
    return GPA;
  }
  public void setGPA(String gPA) {
    GPA = gPA;
  }
  
}
