package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.policy;
import com.example.demo.model.signUp;
import com.example.demo.service.signUpService;

@RestController
public class signUpController {
@Autowired
signUpService sus;
@PostMapping("addSignUp")
public signUp add(@RequestBody signUp su)
{
	return sus.saveSignUpInfo(su);
}
@GetMapping("showSignUp")
public List<signUp> show()
{
	return sus.showSignUpInfo();
}
@PutMapping("putSignUP")
public signUp change(@RequestBody signUp su)
{
	return sus.putSignUp(su);
}
@DeleteMapping("deleteSignUp")
public String delete(@RequestBody signUp su)
{
	sus.deleteSignUpInfo(su);
	return "SIGN UP DETAILS DELETED FROM THE DATABASE";
}
}
