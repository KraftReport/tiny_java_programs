package com.jdc.student.actions;
 
import com.jdc.student.model.Student;
import com.jdc.student.model.StudentRegistry;

public class AddNewStudentAction extends AbstractAction {

	public AddNewStudentAction(StudentRegistry registry, InputUtils inputs) {
		super(2, "Add New Student", registry, inputs);
	}

	@Override
	public void doAction() {

		// Show Menu
		
		// Get Student Name Input
		var name = inputs.readString("Student Name  : ");
		
		// Get Phone Number Input
		var number = inputs.readString("Phone : ");
		// Get Email Address Input
		var email = inputs.readString("Email : ");
		
		// Create Student Object
				Student stuNew = new Student();
				stuNew.setEmail(email);
				stuNew.setName(name);
				stuNew.setPhone(number);
		
		// Add To Registry
				StudentRegistry studentRegi = new StudentRegistry();
				int stuId = studentRegi.addNew(stuNew);
				
		
		// Show Result
		 System.out.println(studentRegi.findById(stuId));
			System.out.println("new student is added and student id is " +stuId);
	}
}