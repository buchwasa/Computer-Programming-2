import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		HashSet<String> myData = new HashSet<>();
		
		myData.add("Apple");
		myData.add("Guava");
		myData.add("Pear");
		
		System.out.println(myData.toString());
		
		for (String data : myData) {
			System.out.println(data);
		}
		
		//Sorting
		List<String> list = new ArrayList<String>(myData); // A TreeSet also works
		Collections.sort(list);
		System.out.println(list.toString());
		
		myData.remove("Apple");
		System.out.println(myData.toString());
	}

}
