package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Account;

import com.example.demo.repository.AccountRepository;


@SpringBootApplication
public class SpringJpaAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAssignmentApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(AccountRepository repository) {
	    return (args) -> {
	        try {
	            repository.save(new Account("465768789", 768875d));
	            repository.save(new Account("897675653", 908875d));
	            repository.save(new Account("465435647", 238875d));
	            repository.save(new Account("576844893", 783627d));
	            repository.findAll().forEach(System.out::println);
	            Account acc = repository.findById(2).orElseThrow(() -> new RuntimeException("Account not found"));
                acc.withdraw(24490d);
                repository.save(acc);
                System.out.println(acc);
	            Account acc1 = repository.findById(3).orElseThrow(() -> new RuntimeException("Account not found"));
                acc1.deposit(13378d);
                repository.save(acc1);
                System.out.println(acc1);
                Account acc2 = repository.findById(1).orElseThrow(() -> new RuntimeException("Account not found"));
                Account acc3 = repository.findById(4).orElseThrow(() -> new RuntimeException("Account not found"));
                acc2.transfer(acc3, 233907d);
                repository.save(acc2);
                repository.save(acc3);
                System.out.println(acc2);
                System.out.println(acc3);
                System.out.println("------------------");
                repository.findAll().forEach(System.out::println);
                repository.deleteById(1);
    			System.out.println("-------------------");
    			repository.findAll().forEach(System.out::println);
               
	        } catch (Exception e) {
	           
	            e.printStackTrace();
	        }
	    };
	}


}
