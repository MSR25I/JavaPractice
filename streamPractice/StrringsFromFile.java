package streamPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StrringsFromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  Path path = Paths.get("C://Users//manis//OneDrive//Desktop/my.txt"); // Use forward slashes

	        try (Stream<String> stringLines = Files.lines(path)){ // Try-with-resources
	            stringLines.forEach(System.out::println); // Using method reference for brevity
	        }
	        
	}

}
