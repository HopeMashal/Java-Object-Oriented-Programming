package atc_team_r;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import com.opencsv.CSVWriter;

public class WriteCSV {
	List<String[]> arrayList;
	File file;

	public WriteCSV(List<String[]> arrayList) {
		this.arrayList = arrayList;
	}

	public String writeToCsv() {
		File folder = new File("./Apps/CSVWriteRead/src/files");
		folder.mkdir();

		String filePath = this.file.getPath();

		Writer writer = null;
		try {
			writer = new FileWriter(filePath);

			CSVWriter csvFile = new CSVWriter(writer);
			csvFile.writeAll(arrayList);

			csvFile.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filePath;
	}

	public void createFile(String fileName) {
		this.file = new File("./Apps/CSVWriteRead/src/files/" + fileName+".csv");
	}
}
