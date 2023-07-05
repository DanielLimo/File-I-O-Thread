package limo;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInput  myThread1 = new UserInput();
		FilereaderThread myThread2 =new 	FilereaderThread();

		 Thread t1 = new Thread(new UserInput());
		Thread t2 = new Thread(new FilereaderThread ());
        t1.start();
        t2.start();
	}

}
