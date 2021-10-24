package person;

public class Main {

	public static void main(String[] args) {
		Person student = new Person();
		student.setFirstName("John");
		student.setLastName("Adams");
		student.addClass("IT1");
		student.addClass("IT2");
		student.addClass("IT3");
		System.out.println(student.toString());
	}
}
