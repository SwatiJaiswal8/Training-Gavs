package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Administrator;
import com.example.demo.model.OrderManagement;

@Repository
public interface OrderRepository extends CrudRepository<OrderManagement, Long> {

	
    
}