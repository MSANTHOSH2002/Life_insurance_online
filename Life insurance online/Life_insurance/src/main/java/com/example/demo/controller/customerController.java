package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.customer;
import com.example.demo.service.customerService;

@RestController
public class customerController {
@Autowired
customerService cs;
@PostMapping("addCustomer")
public customer add(@RequestBody customer cu)
{
	return cs.addCustomer(cu);
}
@GetMapping("showCustomer")
public List<customer> show()
{
	return cs.showCustomer();
}
@PutMapping("putCustomer")
public customer change(@RequestBody customer cu)
{
	return cs.putCustomer(cu);
}
@DeleteMapping("deleteCustomer")
public String delete(@RequestBody customer cu)
{
	cs.deleteCustomer(cu);
	return "CUSTOMER DETAILS IS DELETED IN THE DATABASE";
}   
@DeleteMapping("deleteCustomerByEmail")
public String delete(@RequestParam String email)
{
	cs.deleteid(email);
	return "Deleted successfully";
}
}
