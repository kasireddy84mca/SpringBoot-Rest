package com.example.control;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Student;
import com.example.beans.StudentRegistration;

@RestController
public class StudentUpdateController {

	@RequestMapping(method = RequestMethod.PUT, value = "/update/student/")
	@ResponseBody
	public String updateStudentRecord(@RequestBody Student stud) {
		System.out.println("Student update..");
		return StudentRegistration.getInstance().upDateStudent(stud);

	}

}
