package Notes.lesson_7;

public class Student extends Person {
  private String Specialization;
  private int Study_Level;
  private double GPA;
  public Student(String name, double age, String address, String nationality,int study,String special,double gpa){
    super(name,age,address,nationality);
    Study_Level = study;
    Specialization=special;
    GPA=gpa;
  }
  public void printInfo(){
    super.printInfo();
    System.out.println("The student's study level is "+Study_Level+". the student's specialization is "+Specialization+". The student's GPA is "+GPA);
  }
  public int getStudy_Level() {
    return Study_Level;
  }
  public void setStudy_Level(int study_Level) {
    Study_Level = study_Level;
  }
  public String getSpecialization() {
    return Specialization;
  }
  public void setSpecialization(String specialization) {
    Specialization = specialization;
  }
  public double getGPA() {
    return GPA;
  }
  public void setGPA(double gPA) {
    GPA = gPA;
  }
  
}
