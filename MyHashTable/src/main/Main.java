package main;

import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		Hashtable<String, String> myHT = new Hashtable<String, String>();
		
		myHT.put("IBM", "PC, PS/2, AS400. 370, Big Blue");
		myHT.put("Atari", "800, 400, 2600, 810");
		myHT.put("Dell", "XZ3000, MegaCompuDyne, A1, plain boring laptop");
		
		System.out.println(myHT.toString());
		
		myHT.remove("Dell");
		
		System.out.println(myHT.toString());
		
		myHT.put("Commodore", "64, Pet");
		
		String value = myHT.get("IBM");
		System.out.println(value);
		
		System.out.println(myHT.keySet());
	}
}
