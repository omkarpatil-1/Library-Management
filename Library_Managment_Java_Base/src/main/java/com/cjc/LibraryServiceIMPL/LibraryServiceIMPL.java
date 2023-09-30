package com.cjc.LibraryServiceIMPL;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.LibraryDao.LibraryRepository;
import com.cjc.LibraryService.LibraryService;
import com.cjc.model.Books;
@Service
public class LibraryServiceIMPL implements LibraryService{
	@Autowired
  private LibraryRepository libraryRepository;
	public void insertbook(Books book) {
		libraryRepository.insertbook(book);
		
		
	}
	
	public Books getbook(int bid) {
		Books book = libraryRepository.getbook(bid);
		
		return book;
	}

	public Books update(int bid) {
		
		return libraryRepository.getbook(bid);
	}

	public void save(Books book) {
		libraryRepository.save(book);
		
	}

	public List<Books> getallbooks() {
		List<Books> list= libraryRepository.getallbooks();
		return list;
	}

	public List<Books> delete(int bid) {
		List<Books> list = libraryRepository.delete(bid);
		return list;
	}


}
