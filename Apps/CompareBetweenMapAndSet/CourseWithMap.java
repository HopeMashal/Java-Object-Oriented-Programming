package CompareBetweenMapAndSet;

import java.util.TreeMap;

public class CourseWithMap {
  TreeMap<String,Student> myMap = new TreeMap<String,Student>();

  public void putStudent (Student myStudent){
    myMap.put(myStudent.getIDNum(), myStudent);
  }

  public String StudentToString(String ID){
    System.out.println("\n----Select Student with ID Number: "+ID+" from Tree Map----");
    try {
      return myMap.get(ID).toString();
    } catch (Exception e) {
      return "Invalid ID Number!!! We don't have any student with ID Number: "+ID;
    }
  }

  public void getAllElements(){
    System.out.println("\n--------------------All Elements in Tree Map--------------------");
    for (String key: myMap.keySet()) {
      System.out.println(myMap.get(key).toString());
    }
  }
}
