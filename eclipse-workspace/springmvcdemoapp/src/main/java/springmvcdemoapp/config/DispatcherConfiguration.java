package springmvcdemoapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

@Configuration
public class DispatcherConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(SpringConfig.class);
		context.scan("springmvcdemoapp");
		servletContext.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic register=servletContext.addServlet("ds",new DispatcherServlet(new GenericWebApplicationContext())); //bind DS with IOC
		register.setLoadOnStartup(1);
		register.addMapping("/"); //http://localhost:8080/SpringDemo to be routed to the ds
	}

}
