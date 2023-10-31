package comdemo.hibernate;


 
import java.util.List;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import comdemo.hibernate.config.HibernateDemo;
import comdemo.hibernate.entities.Employee;
import comdemo.hibernate.entities.Project;
 
public class App8 {
	public static void main(String ar[]) {
		 SessionFactory sessionFactory=HibernateDemo.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		 //session.beginTransaction();
	 Project prjObj1=new Project("ERP");
		 session.persist(prjObj1);
		 Project prjObj2=new Project("Inventory");
		 session.persist(prjObj2);
		 Employee empObj=new Employee("Ram", 35000);
		 empObj.getProjects().add(prjObj1);
		 empObj.getProjects().add(prjObj2);
		 session.persist(empObj);
//		Employee empObj=session.get(Employee.class, 1);
//		 System.out.println(empObj);
//		 List<Project> projects=empObj.getProjects();
//		 projects.forEach(System.out::println);
		 //-----------------------------------
//		 Project prjObj=session.get(Project.class, 1);
//		 System.out.println(prjObj);
//		 List<Employee> employees=prjObj.getEmployees();
//		 employees.forEach(System.out::println);
		 
	// Updating
//		 Project prjObj= session.get(Project.class, 2);
//		 prjObj.setPrjName("QuizApp");
//		 Transaction tr =session.beginTransaction();
//		 session.update(prjObj);
//		 tr.commit();
//		 session.close();
//		 System.out.println(prjObj);
		// deleting
		 Project prj = session.get(Project.class, 1);
		Transaction tr =session.beginTransaction();
		session.delete(prj);
		tr.commit();
		session.close();
		
		 
		 
	}
}
 