package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Medicine;
import com.example.demo.entities.MedicineNotFoundException;
import com.example.demo.entities.Stock;
import com.example.demo.repository.StockRepository;
import com.example.demo.service.CustomerService;
import com.example.demo.service.MedicineService;
import com.example.demo.service.StockService;
@RestController
@RequestMapping("/customer") 
public class CustomerController {
 
    @Autowired
    CustomerService service;
    @Autowired
    MedicineService service2;
     @Autowired
     StockService service3;
     @Autowired
     StockRepository repo;
    
    @PostMapping("/addCustomer")
    public void addNewcustomer(@RequestBody Customer customer) throws MedicineNotFoundException {
        Long medicineid = customer.getMedicineIdC();
        Medicine obj= service2.getMedicineById(medicineid);
        double pricePerUnit=obj.getMedicinePrice();        
        int quantity = customer.getQuantityC();
        Stock medicineQuantity = service3.getQuantityById(medicineid);
        int stockQuantoty = medicineQuantity.getQuantity();
        if(stockQuantoty>quantity) {
        double calculatedPrice = pricePerUnit * quantity;
        customer.setCalculatedPrice(calculatedPrice);
        service.saveCustomer(customer);
       int updatedQuantity = stockQuantoty - quantity;
       	medicineQuantity.setQuantity(updatedQuantity);
       repo.save(medicineQuantity);
        
       
    }
    }
}
 