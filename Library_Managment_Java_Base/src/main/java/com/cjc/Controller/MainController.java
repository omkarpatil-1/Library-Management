package com.cjc.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.LibraryService.LibraryService;
import com.cjc.model.Books;

@Controller
public class MainController {
	@Autowired
	private LibraryService LibraryService;

	@RequestMapping("/")
	public String landingpage() {
		System.out.println();
		return "index";

	}

	@RequestMapping("/newbook")
	public String newbook() {
		return "newbook";

	}

	@RequestMapping("/regsnewbook")
	public String insertbook(@ModelAttribute Books book) {
		LibraryService.insertbook(book);
		return "redirect:/index.jsp";

	}

	@RequestMapping("/Search")
	public String getbook(@RequestParam int bid, Model model) {
		Books book = LibraryService.getbook(bid);
		int bid2 = book.getBid();
		String bname = book.getName();
		Double bprice = book.getBprice();
		
		
		model.addAttribute("bid", bid2);
		model.addAttribute("bname", bname);
		model.addAttribute("bprice", bprice);
		return "book";

	}
	@RequestMapping("/edit")
	public String update(@RequestParam int bid,Model model) {
		Books book = LibraryService.update(bid);
		model.addAttribute("data",book);
		
		return "updatebook";
		
		
	}
	@RequestMapping("/up")
	public String save(@ModelAttribute Books book) {
		LibraryService.save(book);
		return "index";
		
		
	}
	@RequestMapping("/allbooks")
	public String getallbooks(Model model) {
		
		List<Books> list = LibraryService.getallbooks();
		model.addAttribute("data",list);
		return "Allbooks";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam  int bid,Model model) {
		List<Books> list = LibraryService.delete(bid);
		model.addAttribute("data", list);
		return "Allbooks";
		
	}

}
