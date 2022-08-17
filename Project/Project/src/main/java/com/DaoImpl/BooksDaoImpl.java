package com.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil;
import com.Dao.BooksDao;
import com.Entity.Books;

public class BooksDaoImpl implements BooksDao {

	@Override
	public void AddBooks() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create Book Id :");
		int id = s.nextInt();
		System.out.println("Create Book Title :");
		String title = s.next();
		System.out.println("Create Book Author :");
		String author = s.next();
		System.out.println("Create Book Genre :");
		String genre = s.next();
		System.out.println("Create Book Price :");
		double price = s.nextDouble();
		Books b = new Books();
		b.setBookId(id);
		b.setTitle(title);
		b.setAuthor(author);
		b.setGenre(genre);
		b.setPrice(price);
		session.save(b);
		t.commit();
		System.out.println("Book Record Inserted successfully");
		session.close();
	}

	@Override
	public void UpdateBooks() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter Book Id :");
		int id = s.nextInt();
		Books h = session.get(Books.class,id);
		System.out.println("Enter Book Title :");
		String title = s.next();
		System.out.println("Enter Book Author :");
		String author = s.next();
		System.out.println("Enter Book Genre :");
		String genre = s.next();
		System.out.println("Enter Book Price :");
		double price = s.nextDouble();
		h.setTitle(title);
		h.setAuthor(author);
		h.setGenre(genre);
		h.setPrice(price);
		session.update(h);
		t.commit();
		System.out.println("Book Record Updated successfully");
		session.close();
	}

	@Override
	public void DeleteBooks() {
		Session session = HibernateUtil.getSessionFactory().openSession();		
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter Book Id :");
		int id = s.nextInt();
		Books k = session.get(Books.class,id);
		session.delete(k);
		t.commit();
		System.out.println("Book Record Deleted successfully");
		session.close();
	}

	@Override
	public void ShowBookDetails() {
		Session session = HibernateUtil.getSessionFactory().openSession();	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Book Id :");
		int id = s.nextInt();
		Books j = session.get(Books.class,id);
		System.out.println(" Book Id :"+j.getBookId()+" Book Title :"+j.getTitle()
		+" Book Author :"+j.getAuthor()+" Book Genre :"+j.getGenre()+" Book Price :"+j.getPrice());
	}

}
