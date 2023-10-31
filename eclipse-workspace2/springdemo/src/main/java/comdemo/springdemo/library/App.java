package comdemo.springdemo.library;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import comdemo.springdemo.SpringConfigration;
 
public class App {
  public static void main(String[] args) {
    //ProductComponent product;
    ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigration.class);
    ProductComponent products =context.getBean(ProductComponent.class);
    ProductComponent products1 =context.getBean(ProductComponent.class);
    if(products==products1) {
    	System.out.println("same object");
    	
    }
    else {
    	System.out.println("different object");
    }
	//product=context.getBean(ProductComponent.class);
	//product.setCart(context.getBean(CartComponent.class));
    //product=new ProductComponent(context.getBean(CartComponent.class));
    Scanner sc=new Scanner(System.in);
    while(true) {
    	System.out.print("Enter product ");
    	String prd=sc.nextLine();
    	if(prd.equals("end")) {
    		break;
    	}
    	System.out.println(products .viewAddProduct(prd));
    }
  }
}
 