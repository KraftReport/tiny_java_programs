package com.jdc.student.actions;

import com.jdc.student.model.Student;
import com.jdc.student.model.StudentRegistry;

public class SearchStudentAction extends AbstractAction {

	public SearchStudentAction(StudentRegistry registry, InputUtils inputs) {
		super(1, "Search Student", registry, inputs);
	}
	
	

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		 String stuName = inputs.readString("Enter student Name you want to search ");
		 StudentRegistry stuRegi = new StudentRegistry();
		 System.out.println(stuRegi.search(stuName));
		 
		 
		 
	}

}