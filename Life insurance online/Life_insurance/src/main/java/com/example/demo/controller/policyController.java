package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.customer;
import com.example.demo.model.policy;
import com.example.demo.service.policyService;

@RestController
public class policyController {
@Autowired
policyService sd;
@PostMapping("addPolicy")
public policy add(@RequestBody policy po)
{
	return sd.addPolicy(po);
}
@GetMapping("showPolicy")    
public List<policy> show()
{
	return sd.showPolicy();
}
@PutMapping("putPolicy")
public policy change(@RequestBody policy cu)
{
	return sd.putPolicy(cu);
}
@DeleteMapping("deletePolicy")
public String delete(@RequestBody policy po)
{
	sd.deletePolicy(po);
	return "POLICY IS REMOVED FROM THE DATABASE";
}
}
