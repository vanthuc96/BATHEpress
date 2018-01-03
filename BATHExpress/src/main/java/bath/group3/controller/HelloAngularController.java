package bath.group3.controller;


import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloAngularController {
	@RequestMapping(value = "/helloAngular", method = RequestMethod.GET)
	public String helloAngularPage() {
		return "helloAngular";
	}
}
