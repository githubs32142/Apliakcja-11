package pl.techstyle.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.techstyle.model.Publisher;
import pl.techstyle.service.PublisherService;

@Controller
@RequestMapping(value="/publisher")
public class PublisherController {
	@Autowired
	PublisherService servicePublisher;
	
	@GetMapping(value="/all")
	public ModelAndView getAllBooks(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("publishers",servicePublisher.getAll());
		mav.setViewName("allPublisher");
		return mav;
		
	}
	@GetMapping(value="/add")
	public ModelAndView addBook(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("publisher",new Publisher());
		mav.setViewName("addPublisher");
		return mav;
		
	}
	@PostMapping(value="/add")
	public ModelAndView addBookPost(@Valid Publisher p,BindingResult br){
		ModelAndView mav = new ModelAndView();
		servicePublisher.add(p);
		mav.addObject("publisher",new Publisher());;
		mav.setViewName("addPublisher");
		return mav;
	}

}
