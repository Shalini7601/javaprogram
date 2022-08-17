package com.DaoImpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.HibernateUtil;
import com.Dao.OrdersDao;
import com.Entity.Orders;

public class OrdersDaoImpl implements OrdersDao {

	@Override
	public void AddOrders() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Order Id :");
		int id = s.nextInt();
		System.out.println("Enter CustomerName :");
		String cname = s.next();
		System.out.println("Enter CustomerPhNo :");
		long cno = s.nextLong();
		System.out.println("Enter Books Purchased :");
		String bpr = s.next();
		System.out.println("Enter Total Price :");
		double tprice = s.nextDouble();
		Orders p = new Orders();
		p.setOrderId(id);
		p.setCustomerName(cname);
		p.setCustomerPhone(cno);
		p.setBooksPurchased(bpr);
		p.setTotalprice(tprice);
		session.save(p);
		t.commit();
		System.out.println("Order Record Inserted successfully");
		session.close();

	}

	@Override
	public void UpdateOrders() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Order Id :");
		int id = s.nextInt();
		Orders u = session.get(Orders.class,id);
		System.out.println("Enter Updated CustomerName :");
		String cname = s.next();
		System.out.println("Enter Updated CustomerPhNo :");
		long cno = s.nextLong();
		System.out.println("Enter Updated Books Purchased :");
		String bpr = s.next();
		System.out.println("Enter Updated Total Price :");
		double tprice = s.nextDouble();
		u.setCustomerName(cname);
		u.setCustomerPhone(cno);
		u.setBooksPurchased(bpr);
		u.setTotalprice(tprice);
		session.update(u);
		t.commit();
		System.out.println("Order Record Updated successfully");
		session.close();
	}

	@Override
	public void DeleteOrders() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Order Id :");
		int id = s.nextInt();
		Orders r = session.get(Orders.class,id);
		session.delete(r);
		t.commit();
		System.out.println("Order Record Deleted successfully");
		session.close();
	}

	@Override
	public void ShowOrderDetails() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Order Id :");
		int id = s.nextInt();
		Orders w = session.get(Orders.class,id);
		System.out.println(" CustomerName :"+w.getCustomerName()+" Customer PhoneNo :"+w.getCustomerPhone()
		+" Purchase :"+w.getBooksPurchased()+" TotalPrice :"+w.getTotalprice());
		
	}

}
