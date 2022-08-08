/*_______________________________*/
//! Exception Handling!! 
package Notes.lesson_13;

import java.util.*;

public class lesson_13 {
  public static void main(String[] args) {
    try {
      int x=10,y=0;
      System.out.println(x/y);
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println("Error!! Division By Zero not Allowed");
    }
    System.out.println("The Program Continues :)");

    try {
      int z,o;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter z value: ");
      z = input.nextInt();

      System.out.print("Enter o value: ");
      o = input.nextInt();

      System.out.println(z/o);

    } catch (ArithmeticException e) {
      //TODO: handle exception
      System.out.println("Error!! Division By Zero not Allowed");
    } catch (InputMismatchException e) {
      //TODO: handle exception
      System.out.println("Error!!! Please Enter Numeric values!");
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println("Error!!! "+e.getMessage());
    }

  }
}

/*_______________________________*/

//! Handling Exception

//? An exception is an object that is generated as the result of an error or an unexpected event
//? Exception are said to have been "thrown"
//? It is the programmers responsibility to write code that detects and handles exceptions
//? Unhandled exceptions will crash a program
//? Java allows you to create exception handlers

/* 
 * int x=10,y=10;
 * System.out.println(x/y);
 */

//? To handle an exception, you use a try statement
/* 
 * try{
 * (try block statement)
 * }
 * catch (ExceptionType ParameterName){
 * (catch block statement)
 * }
 */
//? First the keyword try indicates a block of code will be attempted.

//? This code is designed to handle a FileNotFoundException if it is thrown
/* 
 * try{
 * File file = new File ("MyFile.txt");
 * Scanner inputFile= new Scanner(file);
 * }
 * catch (FileNotFoundException e){
 * System.out.println("File not found");
 * }
 */
//? The Java Virtual Machine searches for a catch clause that can deal with exception

/*_______________________________*/

//! Exception Classes

//? An exception handler is a section of code that gracefully responds to exceptions
//? An exception is an object
//? Exception objects are created from classes in the Java API hierarchy of exception classes
//? All of the exception classes in the hierarchy are derived from the Throwable class
//? Error and Exception are derived from the Throwable class

/*_______________________________*/

//! Handling Multiple Exceptions

//? The code in the try block may be capable of throwing more than one type of exception
//? A catch clause needs to be written for each type of exception that could potentially be thrown
//? The JVM will run the first compatible catch clause found
//? The catch clauses must be listed from most specific to most general

/*_______________________________*/

//! Polymorphic References To Exceptions

/* 
 * try{
 * number = Integer.parseInt(str);
 * }
 * catch (Exception e){
 * System.out.println("The following error occurred: "+e.getMessage());}
 */

//? The Integer class's parseInt method throws a NumberFormatException object
//? The NumberFormatException class is derived from the Exception class

/*_______________________________*/