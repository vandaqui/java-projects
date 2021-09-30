package schoolManagement;

// Class responsible for keeping the track of the students info
// These info are fees, name, grades etc.
// The anual fee is 30k, there is no need to pay upfront

public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	//Create new student object
	public Student (int id, String name, int grade) {
		
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}
	
	// Update student grade
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// Update fees paid
	public void updateFeesPaid(int fees) {
		feesPaid += fees;
	}

	// Return id of the student
	public int getId() {
		return id;
	}

	// Return name of the student
	public String getName() {
		return name;
	}

	// Return grade of the student
	public int getGrade() {
		return grade;
	}

	// Return fees paid by the student
	public int getFeesPaid() {
		return feesPaid;
	}

	// Return his total debt
	public int getFeesTotal() {
		return feesTotal;
	}
	
	
	
	
}
