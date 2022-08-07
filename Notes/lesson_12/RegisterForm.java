package Notes.lesson_12;

enum Gender {Male,Female};
enum Course {DataBase,Programming,Math,Art};
enum Semester {Summer,Winter,Fall,Spring};

public class RegisterForm {
  String stdName;
  Gender stdGender;
  Course stdCourse;
  Semester stdSemester;

  public RegisterForm() {
    stdName="No Name";
    stdGender=Gender.Male;
    stdCourse=Course.Math;
    stdSemester=Semester.Fall;
  }

  
}
