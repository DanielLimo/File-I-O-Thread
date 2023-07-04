package limo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileReaderThread  myThread1 = new FileReaderThread();
		FileWriterThread  myThread2 =new 	FileWriterThread();

		 Thread t1 = new Thread(new FileReaderThread());
		Thread t2 = new Thread(new FileWriterThread ());
        t1.start();
        t2.start();
       
		
	}

}
