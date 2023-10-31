package comdemo.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import comdemo.hibernate.config.HibernateDemo;

public class App4 {
	public static void main(String arg[]) {
		SessionFactory sessionFactory=HibernateDemo.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		 //Query query= session.createNativeQuery("select prdid,prdname from product where prdcategory=?");
		 Query query= session.createNativeQuery("select * from product ");
		 //query.setParameter(1, "program");
		 List<Object[]> products=query.getResultList();
		 for(Object[] p:products) {
			 for(Object o:p)
			 System.out.println(o);
		 }
		 session.close();
	}

}
