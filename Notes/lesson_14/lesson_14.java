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

//? The ArrayList class's toString method returns a string representing all ArrayList
  //* System.out.println(ArrayList);
  //* This statement yields: [Hope,Yuki]

//? The ArrayList class's remove method removes designated item from ArrayList
  //* nameList.remove(1); --> This statement removes the second item

//? The ArrayList class's add method with one argument adds new items to the end of the ArrayList
//? To insert items at a location of choice, use the add method with two arguments
  //* nameList.add(1,"Mary"); --> This statement inserts the String "Mary" at index 1

//? To replace an existing item, use the set method:
  //* nameList.set(1,"Akira"); --> This statement replaces "Mary" with "Akira"

//? An ArrayList has a capacity, which is the number of items it can hold without increasing its size.
//? The default capacity of an ArrayList is 10 item
//? To designate a different capacity, use a parameterized constructor:
  //* ArrayList<String> list = new ArrayList<String>(100);

/*_______________________________*/