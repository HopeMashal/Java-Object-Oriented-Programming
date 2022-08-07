/*_______________________________*/
//! Person Class!!

package Notes.lesson_9;

public class Person {
  protected String Name,ID;

  public Person(String name, String iD) {
    Name = name;
    ID = iD;
  }

  public Person() {
  }

  public final String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  
  
}
