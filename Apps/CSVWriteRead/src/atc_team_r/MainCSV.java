package atc_team_r;

import java.util.ArrayList;
import java.util.List;

public class MainCSV {
  public static void main(String[] args) {
    List<String[]> arrayList = new ArrayList<String[]>();

		arrayList.add(new String[] {"Hello !!!","Amal"});
    arrayList.add(new String[] {"Hope"});
    arrayList.add(new String[] {"Yuki"});

		WriteCSV writer = new WriteCSV(arrayList);
		System.out.println(writer.writeToCsv());

    ReadCSV reader = new ReadCSV(writer.writeToCsv());
    System.out.println(reader.readCSV());
  }
}
