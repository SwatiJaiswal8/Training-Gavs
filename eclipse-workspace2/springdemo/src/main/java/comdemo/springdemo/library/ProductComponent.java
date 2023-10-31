package comdemo.springdemo.library;



 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import comdemo.springdemo.SpringConfigration;
 @Component
 @Scope(value="prototype")
public class ProductComponent {
	 @Autowired
		CartComponent cart;
		@Value("${cname}")
		String cname;
		public List<String> viewAddProduct(String prdname){
			return cart.addProduct(cname + ":" + prdname);
	}
}
 