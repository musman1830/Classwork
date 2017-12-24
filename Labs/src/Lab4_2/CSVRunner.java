package Lab4_2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.File;

	public class CSVRunner {
		public static void main(String[] args) throws IOException
		{	
			File CVS = new File("data.csv");
			CSVUtilities x =  new CSVUtilities(CVS); 
			
			ArrayList<String> y = new ArrayList<String>();
			y= (ArrayList<String>) x.getColumnData(5);
			x.getColumnData(5);
		}
	}

