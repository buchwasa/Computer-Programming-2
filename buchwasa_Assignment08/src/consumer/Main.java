package consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

	public static void main(String[] args) {
		BlockingQueue<String> bq = new LinkedBlockingQueue<String>();
		ConsumerThread c1 = new ConsumerThread(bq, "Consumer 001");
		ConsumerThread c2 = new ConsumerThread(bq, "Consumer Delta");

		c1.start();
		c2.start();

		int counter = 0;
		while (true) {
			try {
				bq.put("Fish");
				bq.put("Dog");
				bq.put("Cat");
				bq.put("Gerbil");
				counter++;
				if (counter > 1_000) {
					bq.put("Consumer 001");
				}
			} catch (Exception ex) {
				//Ignore any incoming errors
			}
		}

		/*
		 try { 
		  	c1.join(); //Wait until c1 finishes before continuing 
		  	//c2.join(); Not needed as c1 is always running
		 } catch (Exception ex) {
		 	//Ignore any incoming errors
		 } */
	}
}
