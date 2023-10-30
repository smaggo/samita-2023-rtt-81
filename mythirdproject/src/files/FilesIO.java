package files;

	
//	import java.io.BufferedWriter;
//	import java.io.File;
//	import java.io.FileWriter;
//	import java.io.IOException;
//	import java.io.PrintWriter;
//	public class FilesIO {
//		public static void main(String[] args) {
//			File file = new File("sample1.txt");
//			System.out.println(file.getAbsolutePath());
//			System.out.println("File exists? " + file.exists());
//			// . means the current directory
//			// .. mean the parent directory
//			File dir = new File("C:\\Users\\eric\\development\\2023-RTT-81\\into-to-java\\FirstProject");
//			System.out.println(dir.getAbsolutePath());
//			File parent = new File("..\\..\\..\\..\\..\\..\\..");
//			System.out.println("Parent directory " + parent.getAbsolutePath());
//			for (File f : parent.listFiles()) {
//				System.out.println(f.getName());
//			}
//			try {
//				PrintWriter writer = new PrintWriter(new FileWriter(file, true));
//				writer.append("This is the java class file number 2\n");
//				writer.write("This is a write");
//				writer.flush();
//				writer.close();
//			} catch (IOException ioe) {
//				System.out.println(ioe.getMessage());
//			}
//		}
//	}
//

import java.util.ArrayList;
import java.util.Comparator;
 public static void (String[]args) {
  
    // create an ArrayList
    ArrayList<String> languages = new ArrayList<>();
    // add elements to ArrayList
    languages.add("Python");
    languages.add("Swift");
    languages.add("C");
    languages.add("JavaScript");
    System.out.println("Unsorted ArrayList: " + languages);
    // sort the ArrayList in ascending order
    languages.sort(Comparator.reverseOrder());
    System.out.println("Sorted ArrayList: " + languages);
    }
}







