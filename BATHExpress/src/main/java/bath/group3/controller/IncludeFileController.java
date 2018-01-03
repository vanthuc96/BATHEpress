package bath.group3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IncludeFileController {
	@RequestMapping(value = "/footer", method = RequestMethod.GET)
	public ModelAndView footerPage(){
		return new ModelAndView("footer");
	}
	@RequestMapping(value = "/header", method = RequestMethod.GET)
	public ModelAndView headPage(){
		return new ModelAndView("header");
	}
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public ModelAndView mewnuPage(){
		return new ModelAndView("menubar");
	}
}
