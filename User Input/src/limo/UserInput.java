package limo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class UserInput  implements Runnable {
		 FileWriter fw;
		 PrintWriter pw;
		   Path path = Paths.get("D:\\\\testout.txt");
		   
		 
		          public void run() {
				
				 try (Scanner scanner = new Scanner(System.in)) {
					System.out.println("\nWhat is your name");
					   String name=scanner.nextLine();
					   System.out.println("What is your age");
					   int age=scanner.nextInt();
					   scanner.nextLine();
					   System.out.println("What is your Gender");
					   String gender=scanner.nextLine();
					   System.out.println("Name: " + name);
					   System.out.println("\n Age: " + age);
					   System.out.println("\n Gender: " + gender);
					   
					   PrintWriter wr = null;
						try {
							wr = new PrintWriter("D:\\testout.txt");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				        wr.print( name);
				        wr.print("\n" +age);
				        wr.print("\n" +gender);
				       
				        wr.close();
				      
						
						
				} 
				 
				
				   
		}


			 }
	


