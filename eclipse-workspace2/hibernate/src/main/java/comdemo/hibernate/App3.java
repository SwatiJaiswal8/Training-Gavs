package comdemo.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import comdemo.hibernate.config.HibernateDemo;
import comdemo.hibernate.entities.Product;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=HibernateDemo.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		// Query query=session.createQuery("from Product p where p.prdCategory=?1");
		// Query query=session.createQuery("select p.prdId,p.prdName from Product p where p.prdCategory=?1");
		 Query query= session.createQuery(" from Product ");
		// query.setParameter(1, "Toy");
 List<Product> products=query.getResultList();
		// List<Object[]> products=query.getResultList();
		// products.forEach((System.out::println));
		 /*for(Object[] prd:products) {
			 for(Object o:prd)
			  System.out.println(o);
		 }*/
 for(Product prd:products) {
	 
	  System.out.println(prd);
 }
		 session.close();

	}

}
