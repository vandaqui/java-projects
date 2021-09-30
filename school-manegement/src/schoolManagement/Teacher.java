package schoolManagement;

// This class is responsible for keeping track of teacher's info
public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	
	public Teacher(int id, String name, int salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	// Return the teacher's ID
	public int getId() {
		return this.id;
	}
	
	// Return Name of the teacher
	public int getSalary(){
		return this.salary;
	}
	
	// Return salary of the teacher
	public String getName() {	
		return this.name;	
	}
	
	// Set the salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
