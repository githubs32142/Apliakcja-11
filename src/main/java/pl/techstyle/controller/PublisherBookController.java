package pl.techstyle.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.techstyle.model.PublisherBook;
import pl.techstyle.service.BookService;
import pl.techstyle.service.PublisherBookService;
import pl.techstyle.service.PublisherService;

@Controller
@RequestMapping(value="/pb")
public class PublisherBookController {
	
@Autowired
PublisherBookService service;

@Autowired
PublisherService servicePublisher;

@Autowired
BookService serviceBook;


@GetMapping(value="/add")
public ModelAndView addBook(){
	ModelAndView mav = new ModelAndView();
	mav.addObject("publisherBook",new PublisherBook());
	mav.addObject("publishers",servicePublisher.getAll());
	mav.addObject("books",serviceBook.getAll());
	mav.setViewName("addPublisherBook");
	return mav;
	
}
@PostMapping(value="/add")
public ModelAndView addBookPost(@Valid PublisherBook p,BindingResult br){
	ModelAndView mav = new ModelAndView();
	service.add(p);
	mav.addObject("publisherBook",new PublisherBook());
	mav.addObject("publishers",servicePublisher.getAll());
	mav.addObject("books",serviceBook.getAll());
	mav.setViewName("addPublisherBook");
	return mav;
}

@GetMapping(value="/all")
public ModelAndView getAllResults(){
	ModelAndView mav = new ModelAndView();
	mav.addObject("results",service.getResult());
	mav.setViewName("allPublisherBook");
	return mav;
	
}
}
