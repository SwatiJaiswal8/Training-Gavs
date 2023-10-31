package comdemo.hibernate;


 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import comdemo.hibernate.config.HibernateDemo;
import comdemo.hibernate.entities.Address;
import comdemo.hibernate.entities.Employee;



 
public class App6 {
 
	public static void main(String[] args) {
		 SessionFactory sessionFactory=HibernateDemo.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		 Address addObj=new Address("Chennai","India");
		 Employee empObj=new Employee("Reeta", 25000);
		 Transaction trnx=session.beginTransaction();
		 empObj.setEmpAddress(addObj);
		 session.persist(addObj);
		 session.persist(empObj);
		 trnx.commit();
		 session.close();
		 System.out.println(empObj);
		
	}
 
}
 