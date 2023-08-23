package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.policy;
//@Repository
public interface policyRepo extends JpaRepository<policy, String>{

}
