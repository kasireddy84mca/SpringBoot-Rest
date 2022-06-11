package com.example.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {

	private List<Student> studentRecords;

	private static StudentRegistration stdregd = null;

	private StudentRegistration() {

		studentRecords = new ArrayList<Student>();

	}

	public static StudentRegistration getInstance() {

		if (stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		}

		else {
			return stdregd;
		}
	}

	public void add(Student std) {
		studentRecords.add(std);
	}

	public String upDateStudent(Student std) {
		for (int i = 0; i < studentRecords.size(); i++) {
			Student stdn = studentRecords.get(i);
			if (stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
				studentRecords.set(i, std);
				return "Update sucessfully";
			}
		}
		return "update un-sucessful";

	}

	public String deleteStudent(String registerNumber) {
		for (int i = 0; i < studentRecords.size(); i++) {
			Student stdd = studentRecords.get(i);

			if (stdd.getRegistrationNumber().equals(registerNumber)) {
				studentRecords.remove(i);
				return "Delete Sucessfully";
			}
		}
		return "Delete un-Sucessful";
	}

	public List<Student> getStudentRecords() {
		return studentRecords;

	}

}
