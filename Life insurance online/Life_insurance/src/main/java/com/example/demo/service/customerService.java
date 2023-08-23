package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.customer;
import com.example.demo.respository.customerRepo;

@Service
public class customerService 
{
	@Autowired 
	customerRepo cr;  
	public customer addCustomer(customer cu) 
	{
		return cr.save(cu);
	}
	public List<customer> showCustomer()
	{
		return cr.findAll();
	}
	public customer putCustomer(customer cu)
	{
		return cr.saveAndFlush(cu);
	}
	public void deleteCustomer(customer cu)
	{
		cr.delete(cu);
	}
	public void deleteid(String email)
	{
		cr.deleteById(email);
	} 
}
