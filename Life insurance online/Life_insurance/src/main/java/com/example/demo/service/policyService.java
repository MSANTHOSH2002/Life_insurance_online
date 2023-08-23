package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.customer;
import com.example.demo.model.policy;
import com.example.demo.respository.policyRepo;

@Service
public class policyService {
@Autowired
policyRepo ps;
public policy addPolicy(policy po)
{
	return ps.save(po);
}
public List<policy> showPolicy()
{
	return ps.findAll();
}
public policy putPolicy(policy po)
{
	return ps.saveAndFlush(po);
}
public void deletePolicy(policy po)
{
	 ps.delete(po);
}
}
