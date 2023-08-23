package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.customer;

//@Repository
public interface customerRepo extends JpaRepository<customer,String >
{

	
}
