package CompareBetweenMapAndSet;

import java.util.TreeSet;

public class Course {
  TreeSet<Student> myTree= new TreeSet<Student>();

  public void addStudent (Student myStudent){
    myTree.add(myStudent);
  }

  public String StudentToString(String ID){
    System.out.println("\n----Select Student with ID Number: "+ID+" from Tree Set----");
    for(Student myStudent:myTree){
      if(myStudent.getIDNum() == ID ){
        return myStudent.toString();
      }
    }
    return "Invalid ID Number!!! We don't have any student with ID Number: "+ID;
  }

  public void getAllElements(){
    System.out.println("\n--------------------All Elements in Tree Set--------------------");
    for(Student myStudent:myTree){
      System.out.println(myStudent.toString());
    }
  }
}
