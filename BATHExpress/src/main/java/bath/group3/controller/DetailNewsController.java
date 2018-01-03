package bath.group3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DetailNewsController {
	@RequestMapping(value ="/detailnews", method = RequestMethod.GET)
	public ModelAndView detailNews(){
		return new ModelAndView("detailNews");
	}
}
