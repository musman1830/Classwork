package Lab4_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class Reader
{
	public static void main(String[] args) 
	{ 
		
		List<Score> books = readScoresFromCSV("Book1.csv");
		for (Score b : books)
		{ 
			System.out.println(b.toString()); 
			}
			
	}
	private static List<Score> readScoresFromCSV(String fileName)
	{ 
		List<Score> books = new ArrayList<>(); 
		Path pathToFile = Paths.get(fileName);
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) 
		{ 
			
			String line = br.readLine(); 
			
			while (line != null) {  
				String[] attributes = line.split(","); 
				Score book = createScore(attributes); 
				books.add(book);  
				line = br.readLine(); 
				} 
			} 
		catch (IOException ioe) 
		{ 
			ioe.printStackTrace(); 
		} 
		
		return books; 
		}
	private static Score createScore(String[] metadata) 
	{ 
		String name = metadata[0]; 
		int score = Integer.parseInt(metadata[1]);
		return new Score(name,score);
	}
	}
