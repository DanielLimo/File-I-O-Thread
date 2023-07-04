package limo;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderThread implements Runnable {
	public void run()
{
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\testout.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
int i;    
try {
	while((i=fr.read())!=-1)    
	System.out.print((char)i);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}    
try {
	fr.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
} 


}
	
