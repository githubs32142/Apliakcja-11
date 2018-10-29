package pl.techstyle.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pl.techstyle.model.Book;
import pl.techstyle.service.BookService;

@Controller
@RequestMapping(value="/book")
public class BookController {
	@Autowired
	BookService serviceBook;
	
	@GetMapping(value="/all")
	public ModelAndView getAllBooks(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("books",serviceBook.getAll());
		mav.setViewName("allBook");
		return mav;
		
	}
	@GetMapping(value="/add")
	public ModelAndView addBook(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("book",new Book());
		mav.setViewName("addBook");
		return mav;
		
	}
	@PostMapping(value="/add")
	public ModelAndView addBookPost(@Valid Book b,BindingResult br){
		ModelAndView mav = new ModelAndView();
		serviceBook.add(b);
		mav.addObject("book",new Book());
		mav.setViewName("addBook");
		return mav;
	}
		
	
}
