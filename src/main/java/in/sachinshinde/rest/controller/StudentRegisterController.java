package in.sachinshinde.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import in.sachinshinde.beans.StudentRegistration;
import in.sachinshinde.beans.StudentRegistrationReply;

@Controller
public class StudentRegisterController {

	@RequestMapping(method=RequestMethod.POST,value="/register/student")
	@ResponseBody
	StudentRegistrationReply registerStudent(@RequestBody StudentRegistration studReg) {
		StudentRegistrationReply studRegRep = new StudentRegistrationReply();
		studRegRep.setName(studReg.getName());
		studRegRep.setAge(studReg.getAge());
		studRegRep.setRegistrationNumber("12345");
		studRegRep.setRegistrationStatus("Successfull");
		return studRegRep;
	}
	
}
