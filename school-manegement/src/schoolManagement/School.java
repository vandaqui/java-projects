package schoolManagement;

import java.util.List;

// High number of students and teachers
// Implements teachers and students using ArrayList
public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpent;
	
	/**
	 * New school object is created
	 * @param teachers list of teachers
	 * @param students list of students
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
		
		
		
	}

	/**
	 * 
	 * @return the list of teachers in the school
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Add a teacher to the school
	 * @param teachers the teacher to be added
	 */
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * 
	 * @return the list of students
	 */
	public List<Student> getStudents() {
		return students;
	}

	public void addStudents(Student student) {
		students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public void setTotalMoneyEarned(int totalMoneyEarned) {
		this.totalMoneyEarned = totalMoneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public void setTotalMoneySpent(int totalMoneySpent) {
		this.totalMoneySpent = totalMoneySpent;
	}
		
}
