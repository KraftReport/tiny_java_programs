package com.jdc.student.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.basic.BasicGraphicsUtils;

public class StudentRegistry {

	private Map<Integer, Student> students;

	private IdGenerater idGen;

	public StudentRegistry() {
		idGen = new IdGenerater();
		students = new HashMap<Integer, Student>();
	}

	public List<Student> search(String name) {
		List<Student> searchResult =new ArrayList<>();
		for(Map.Entry<Integer,Student>entry:students.entrySet()) {
			Student student=entry.getValue();
			
			if(student.getName().equalsIgnoreCase(name)) {
				searchResult.add(student);
			}
		}
		return searchResult;
	}

	public int addNew(Student student) {
		var id = idGen.next();
		student.setId(id);
		students.put(id, student);
		return id;
	}

	public Student findById(int id) {
		return students.get(id);
	}

}