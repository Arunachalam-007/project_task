package file_asmt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileConcept {

	public static void main(String[] args) throws IOException {
//		writeOprn();
		readOprn();
		
	}
	public static void writeOprn() {
		try {
			File f=new File("sample1.txt");
			
			
			if(f.exists()) {
				System.out.println("File exists");
			}
			else {
				f.createNewFile();
				System.out.println("File created "+f.getAbsolutePath());
			}
			
			FileWriter fw=new FileWriter("sample1.txt");
			fw.write("This is sample 1 file");
			fw.close();
			System.out.println("Successfully wrote to the file");
			
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
	}
	public static void readOprn() {
		try {
			File f=new File("sample1.txt");
			if(f.exists()) {
				Scanner sc=new Scanner(f);
				
				while(sc.hasNextLine()) {
					String data=sc.nextLine();
					System.out.println(data);
				}
				sc.close();
			}
			else {
				System.out.println("The file is not exists");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
