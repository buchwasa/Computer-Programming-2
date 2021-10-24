package main;

public class MyThread extends Thread {
	private String id;
	
	public MyThread(String id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println(id);
		final long startTime = System.currentTimeMillis();
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			
		}
		System.out.println(id + " execute time: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
