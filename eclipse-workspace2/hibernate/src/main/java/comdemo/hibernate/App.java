package comdemo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import comdemo.hibernate.config.HibernateDemo;
import comdemo.hibernate.entities.Product;
 
public class App {
  public static void main(String[] args) {
    SessionFactory sessionFactory=HibernateDemo.getSessionFactoryObject();
    
 /*Product prdObj=new Product(1,"Java","Book",700);
  Session session=sessionFactory.openSession();
 Transaction trnx= session.beginTransaction();
 session.save(prdObj);
  trnx.commit();
 session.close();*/
    
    /*Session session=sessionFactory.openSession();
  Product prdObj=session.get(Product.class, 1);
  prdObj.setPrdPrice(3900);
  Transaction trnx= session.beginTransaction();
  session.update(prdObj);
  trnx.commit();
  session.close();
  System.out.println(prdObj);*/
    
    
    //deleting data
    /*Session session = sessionFactory.openSession();
    Product pobj=session.get(Product.class,1);
    Transaction tr =session.beginTransaction();
    session.delete(pobj);
    tr.commit();
    session.close();*/
    //select
    Session session = sessionFactory.openSession();
    Product pobj=session.get(Product.class,2);
    if (pobj != null) {
        // The Product entity with id = 1 exists in the database
        System.out.println("Product ID: " + pobj.getPrdId ());
        System.out.println("Product Name: " + pobj.getPrdName());
        System.out.println("Product Price: " + pobj.getPrdPrice());
    } else {
        // The Product entity with id = 1 does not exist in the database
        System.out.println("Product with ID 1 not found in the database.");
    }
    session.close();
    
    
    
    
   
 
  }
}
