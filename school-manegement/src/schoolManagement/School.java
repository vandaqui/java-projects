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
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * 
	 * @return the list of students
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Adds student to the school
	 * @param student to be added
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * 
	 * @return the total money to be earned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adds the total money earned by the school
	 * @param MoneyEarned the money to be added
	 */
	public void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += totalMoneyEarned;
	}

	/**
	 * 
	 * @return the total money that is spent by the school
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * update the money that is spent by the school
	 * salary given by the school to it''s teachers
	 * @param totalMoneySpent 
	 */
	public void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned-=moneySpent;
	}
		
}
