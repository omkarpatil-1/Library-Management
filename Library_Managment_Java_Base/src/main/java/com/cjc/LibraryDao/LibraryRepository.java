package com.cjc.LibraryDao;


import java.util.List;


import com.cjc.model.Books;

public interface LibraryRepository {
	public void insertbook(Books book);
	public Books getbook(int bid);
	public Books update(int bid);
	public void save(Books book);
	public List<Books> getallbooks();
		
	public List<Books> delete(int bid);
	
	

}
