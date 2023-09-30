package com.cjc.LibraryDaoIMPL;

import java.awt.print.Book;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.LibraryDao.LibraryRepository;
import com.cjc.model.Books;

@Repository
public class LibraryDaoIMPL implements LibraryRepository {
	@Autowired
	private SessionFactory sessionFactory;

	public void insertbook(Books book) {

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		session.saveOrUpdate(book);
		tx.commit();

	}

	@SuppressWarnings("deprecation")
	public Books getbook(int bid) {
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
//		Query Query = session.createQuery("from Books where bid=:bid");
//				Query.setParameter("bid",bid);

		Criteria criteria = session.createCriteria(Books.class);
		Criterion eq = Restrictions.eq("bid", bid);
		criteria.add(eq);
//		Query.executeUpdate();
		// Books b = (Books) Query.getSingleResult();
		Books book = (Books) criteria.uniqueResult();

		tx.commit();
		return book;
	}

	public Books update(int bid) {

		return sessionFactory.openSession().get(Books.class, bid);
	}

	public void save(Books book) {
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(book);
	    tx.commit();	
	 

	}

	public List<Books> getallbooks() {
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from Books");
		List<Books> list = q.getResultList();
		return list;
	}

	public List<Books> delete(int bid) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery("delete from Books where bid=:bid");
		q.setParameter("bid",bid);
		q.executeUpdate();
		tx.commit();
		return getallbooks();
	}

}
