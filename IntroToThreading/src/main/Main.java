package main;

public class Main {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("T1");
		MyThread t2 = new MyThread("T2");
		MyThread t3 = new MyThread("T3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(Exception ex) {
			System.out.println("Error whilst joining threads: " + ex.getLocalizedMessage());
		}
	}
}
