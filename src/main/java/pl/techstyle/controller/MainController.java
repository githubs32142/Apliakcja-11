package pl.techstyle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping(value="/")
	public ModelAndView getIndex() {
		ModelAndView mav= new ModelAndView();
		mav.setViewName("index");
		return mav;
		
	}
}
