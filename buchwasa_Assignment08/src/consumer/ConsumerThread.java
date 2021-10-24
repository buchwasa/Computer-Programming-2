package consumer;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread extends Thread {
	private BlockingQueue<String> myBQ;
	private String queueID;
	private int counter;

	public ConsumerThread(BlockingQueue<String> bq, String queueID) {
		myBQ = bq;
		this.queueID = queueID;
		counter = 0;
	}

	public void run() {
		while (true) {
			String buffer = null;
			try {
				buffer = myBQ.take(); // blocks here if necessary
				counter++;
				System.out.println("Queue " + queueID + " took " + buffer + ", " + counter + " items taken.");
				if (buffer.equals(queueID)) {
					break; //Poison pill, ends the thread. Non-deterministic
				}
			} catch (Exception ex) {
				//Ignore any incoming errors
			}
		}
	}
}
