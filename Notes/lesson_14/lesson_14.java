/*_______________________________*/
//! ArrayList Class!! 

package Notes.lesson_14;

public class lesson_14 {
  public static void main(String[] args) {
    
  }
}

/*_______________________________*/

//! The ArrayList Class

//? Similar to an array, an ArrayList allows object storage
//? Unlike an array, an ArrayList object:
  //* Automatically expands when a new item is added
  //* Automatically shrinks when items are removed
//? Requires: import java.util.ArrayList;

/*_______________________________*/

//! Creating an ArrayList

//? ArrayList<String> nameList = new ArrayList<String>();
//? Notice the word String written inside angled brackets <>
//? This specifies that the ArrayList can hold String objects
//? If we try to store any other type of object in this ArrayList, an error will occur

/*_______________________________*/

//! Using an ArrayList

//? To populate the ArrayList, use the add method:
  //* nameList.add("Hope");
  //* nameList.add("Yuki");

//? To get the current size, call the size method:
  //* nameList.size();

//? To access items in an ArrayList, use the get method:
  //* nameList.get(1);

/*_______________________________*/