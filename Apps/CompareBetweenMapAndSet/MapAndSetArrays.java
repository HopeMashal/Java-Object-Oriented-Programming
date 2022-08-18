package CompareBetweenMapAndSet;

public class MapAndSetArrays {
  public static void main(String[] args) {
    Course myCourse = new Course();
    CourseWithMap myCourseWithMap = new CourseWithMap();

    Student s1 = new Student("Amal", "91234", "0522265321");
    Student s2 = new Student("Hope", "22334", "0522285321");
    Student s3 = new Student("Yuki", "11204", "0522275321");
    Student s4 = new Student("Akira", "01234", "0522255321");
    Student s5 = new Student("Loly", "91204", "0522245321");
    Student s6 = new Student("Iso", "12345", "0522205321");

    myCourse.addStudent(s1);
    myCourse.addStudent(s2);
    myCourse.addStudent(s3);
    myCourse.addStudent(s4);
    myCourse.addStudent(s5);
    myCourse.addStudent(s6);

    System.out.println("\n-------------------------------Tree Set-------------------------------");
    myCourse.getAllElements();
    System.out.println(myCourse.StudentToString("22334"));
    System.out.println(myCourse.StudentToString("91204"));
    System.out.println(myCourse.StudentToString("221334"));

    myCourseWithMap.putStudent(s1);
    myCourseWithMap.putStudent(s2);
    myCourseWithMap.putStudent(s3);
    myCourseWithMap.putStudent(s4);
    myCourseWithMap.putStudent(s5);
    myCourseWithMap.putStudent(s6);

    System.out.println("\n-------------------------------Hash Map-------------------------------");
    myCourseWithMap.getAllElements();
    System.out.println(myCourseWithMap.StudentToString("22334"));
    System.out.println(myCourseWithMap.StudentToString("91204"));
    System.out.println(myCourseWithMap.StudentToString("221334"));
  }
}
