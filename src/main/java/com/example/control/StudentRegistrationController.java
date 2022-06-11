package com.example.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.beans.Student;
import com.example.beans.StudentRegistration;
import com.example.beans.StudentRegistrationReply;

@Controller
public class StudentRegistrationController {

	@RequestMapping(method = RequestMethod.POST, value = "/register/student")
	@ResponseBody
	public StudentRegistrationReply registerStudent(@RequestBody Student student) {

		System.out.println("Register student...");
		StudentRegistrationReply stdregstert = new StudentRegistrationReply();
		StudentRegistration.getInstance().add(student);
		System.out.println("Register student...1");
		stdregstert.setName(student.getName());
		stdregstert.setAge(student.getAge());
		stdregstert.setRegistrationNumber(student.getRegistrationNumber());
		System.out.println("Register student...222");
		stdregstert.setRegistrationStatus("sucessful");
		return stdregstert;

	}

}
