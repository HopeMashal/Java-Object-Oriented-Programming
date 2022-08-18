package FileWriteRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteRead {
  public static File file = new File("Test.txt");
  public static Scanner readFile;
  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Amal");
    myList.add("Hope");
    myList.add("Yuki");
    myList.add("Akira");
    myList.add("Iso");
    
    FileWrite(myList);

    System.out.println("\n---------------------Array List from FileRead Method---------------------");
    System.out.println(FileRead());

    System.out.println("\n---------------------Compare Two Array Lists---------------------"); 
    CompareTwoArrayList(myList, FileRead());

    file.delete();
  }
  public static void FileWrite(ArrayList<String> list){
    try {
			FileWriter f = new FileWriter(file);
      for(int i=0;i<list.size();i++){
        f.write(list.get(i)+"\n");
      }
      System.out.println("\n---------------------Array List from FileWrite Method---------------------");
      System.out.println(list);
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  public static ArrayList<String> FileRead(){
    ArrayList<String> list = new ArrayList<String>();
    try {
			readFile = new Scanner(file);
			while (readFile.hasNextLine()) {
				String data = readFile.nextLine();
				list.add(data);
			}
			readFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    return list;
  }
  public static void CompareTwoArrayList(ArrayList<String> list1,ArrayList<String> list2){
    if (list1.equals(list2)) {
      System.out.println("Two Array Lists are equal");
    } else {
      System.out.println("Two Array Lists are not equal");
    }
  }
}
