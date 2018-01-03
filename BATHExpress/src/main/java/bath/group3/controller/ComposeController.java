package bath.group3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComposeController {
	@RequestMapping(value = "/composepage", method = RequestMethod.GET)
	public ModelAndView composePage(){
		return new ModelAndView("composePage");
	}
}
