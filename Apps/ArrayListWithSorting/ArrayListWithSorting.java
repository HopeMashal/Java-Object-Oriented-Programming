package ArrayListWithSorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithSorting {
  public static void main(String[] args) {
    // Create ArrayList
    ArrayList<Bottle> bottleList = new ArrayList<Bottle>();

    //Create Some Bottles
    Bottle b1 = new Bottle(20);
    Bottle b2 = new Bottle(10);
    Bottle b3 = new Bottle(40);
    Bottle b4 = new Bottle(50);
    Bottle b5 = new Bottle(60);
    Bottle b6 = new Bottle(30);

    //Fill the ArrayList
    bottleList.add(b1);
    bottleList.add(b2);
    bottleList.add(b3);
    bottleList.add(b4);
    bottleList.add(b5);
    bottleList.add(b6);

    System.out.println("\n--------------------Before Sorting--------------------\n");
    for(int i=0;i<bottleList.size();i++){
      System.out.println(bottleList.get(i).toString());
    }

    Collections.sort(bottleList);

    System.out.println("\n--------------------After Sorting--------------------\n");
    for(Bottle myBottle:bottleList){
      System.out.println(myBottle.toString());
    }
  }
}
