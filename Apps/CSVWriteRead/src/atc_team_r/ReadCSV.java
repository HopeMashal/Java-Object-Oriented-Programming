package atc_team_r;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ReadCSV {
  private String FilePath;
  private List<ArrayList<String>> readFileCSV = new ArrayList<ArrayList<String>>();

	  public ReadCSV(String path) {
	    FilePath = path;
	  }

	  public List<ArrayList<String>> readCSV(){
      try {
        FileReader filereader = new FileReader(FilePath);
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                                  .build();
        List<String[]> allData = csvReader.readAll();
        ArrayList<String> myList;
        for (String[] row : allData) { 
          myList = new ArrayList<String>();
          for (String cell : row) {
            myList.add(cell);
          }
          System.out.println(myList); 
          readFileCSV.add(myList);
        }
        csvReader.close();
        filereader.close();
      }
      catch (Exception e) {
        e.printStackTrace();
      }
	    return readFileCSV;
	  }

}
