package comdemo.hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import comdemo.hibernate.entities.Category;
import comdemo.hibernate.entities.Employee;
import comdemo.hibernate.entities.Product;
import comdemo.hibernate.entities.Project;
 
public class HibernateDemo {
	private static SessionFactory sessionFactory=getSessionFactory();
	
	public static SessionFactory getSessionFactoryObject() {
		return sessionFactory;
	}
	private static SessionFactory getSessionFactory() {
		//create configuration object
		Configuration config=new Configuration();
		//Add entity mapping
		config.addAnnotatedClass(Product.class);
		//Standard registry builder object
		config.addAnnotatedClass(Category.class);
		config.addAnnotatedClass(Project.class);
		config.addAnnotatedClass(Employee.class);
		StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder();
		//load the properties
		Properties properties=config.getProperties();
		//Service registry with properties
		ServiceRegistry serviceRegistry=ssrb.applySettings(properties).build();
		//Create Session Factory
		sessionFactory=config.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}
	
}