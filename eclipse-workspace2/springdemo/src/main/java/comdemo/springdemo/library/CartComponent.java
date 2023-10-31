package comdemo.springdemo.library;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(value="prototype")
public class CartComponent {
	CartComponent(){
		System.out.println("create cart");
	}
	List<String> products= new ArrayList<String>();
	public List<String> addProduct(String prd){
		products.add(prd);
		return products;}

}
