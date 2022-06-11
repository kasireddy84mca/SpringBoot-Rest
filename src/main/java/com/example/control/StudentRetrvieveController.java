package com.example.control;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Student;
import com.example.beans.StudentRegistration;

@RestController
public class StudentRetrvieveController {

	@RequestMapping(method = RequestMethod.GET, value = "/student/allstudent")

	@ResponseBody
	public List<Student> getAllStudents() {
		System.out.println("all students");
		return StudentRegistration.getInstance().getStudentRecords();

	}

}
