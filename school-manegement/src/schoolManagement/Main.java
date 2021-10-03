package schoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Add teachers
		Teacher lizzy = new Teacher(id:1, name:"Lizzy", salary:500);
		Teacher mellisa = new Teacher(id:2, name:"Melissa", salary:700);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		
		// Add students
		Student tamasha = new Student(id:1, name:"Tamasha", grade:4);
		Student rabi = new Student(id:2, name:"Rabi", grade:10);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rabi);
		
		// Add school
		School ghs = new School(teacherList, studentList);
		ghs.getTotalMoneyEarned();
	}

}
