package schoolManagement;

// This class is responsible for keeping track of teacher's info
public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
		
	}
	
	// Return the teacher's ID
	public int getId() {
		return id;
	}
	
	// Return Name of the teacher
	public int getSalary(){
		return salary;
	}
	
	// Return salary of the teacher
	public String getName() {	
		return name;	
	}
	
	// Set the salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// Adds to the salary and removes from the total money earned
	public void receiveSalary(int salary) {
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
	}
	
	@Override
	public String toString() {
		return "name of the Teacher: "+name+ "Total salary earned so far: $" + salaryEarned;
	}
}
