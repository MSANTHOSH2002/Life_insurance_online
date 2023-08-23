package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.policy;
import com.example.demo.model.signUp;
import com.example.demo.respository.signUpRepo;

@Service
public class signUpService {
@Autowired
signUpRepo sur;
public signUp saveSignUpInfo(signUp su)
{
	return sur.save(su);
}
public List<signUp> showSignUpInfo()
{
	return sur.findAll();
}
public signUp putSignUp(signUp po)
{
	return sur.saveAndFlush(po);
}
public void deleteSignUpInfo(signUp su)
{
	sur.delete(su);
}

}