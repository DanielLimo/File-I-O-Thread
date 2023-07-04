package limo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterThread implements Runnable{
	 public void run()
	    {
		 FileWriter fw;
			try {
				fw = new FileWriter("D:\\testout.txt");
				fw.write("This is a program to write in  a text file.");
			    fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("You have succesfully written something in the text fiile!!");

		}
	    }

