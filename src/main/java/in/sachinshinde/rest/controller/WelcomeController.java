package in.sachinshinde.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.sachinshinde.beans.Welcome;

@Controller
public class WelcomeController {

	private static final String welcomemsg = "Welcome %s !!!";
	
//	HTTP method /welcome/user will be mapped to Welcome Method: welcomeuser()
	@GetMapping("/welcome/user")
	@ResponseBody
	public Welcome welcomeuser(@RequestParam(name="name", required=false, defaultValue="Sachin") String name) {
		return new Welcome (String.format(welcomemsg, name));
	}
}
