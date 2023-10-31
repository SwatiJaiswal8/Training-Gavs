package comdemo.springdemo;


 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import comdemo.springdemo.library.CartComponent;
import comdemo.springdemo.library.ProductComponent;
 
@Configuration
@ComponentScan(basePackages = "comdemo.springdemo.library")
@PropertySource(value= {"classpath:/Application.properties"})
public class SpringConfigration {
	/*@Bean
	public ProductComponent getProduct() {
		return new ProductComponent();
	}
	@Bean
	public CartComponent getCart() {
		return new CartComponent();
	}*/
}
 