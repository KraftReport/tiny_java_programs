package com.jdc.student.actions;

import com.jdc.student.model.Student;
import com.jdc.student.model.StudentRegistry;

public class ShowStudentAction extends AbstractAction {

	public ShowStudentAction(StudentRegistry registry, InputUtils inputs) {
		super(3, "Show Student Details", registry, inputs);
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		int stuId = inputs.readInt("Type Student id");
		StudentRegistry stRg= new StudentRegistry();
		Student student = stRg.findById(3);
		student.getName();
		
	}

}