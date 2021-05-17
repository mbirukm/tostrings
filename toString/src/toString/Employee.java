package toString;

public class Employee extends Object {
	String firstName;
	String lastName;
	int id;

	@Override
	public String toString() {
		return "Full Name=" + firstName + " " + lastName + "with id =>" + id ;
	}

	
}
