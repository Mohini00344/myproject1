package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HomeServiceImpl implements HomeServices{
	@Autowired
	ServiceRepository repo;
	@Override
	public Customer saveCustomer(Customer c) {
		return null;
	}
	@Override
	public List<Customer>fetchCustomerList(){
		List<Customer> list= repo.findAll();
		return list;
	}
	@Override
	public Customer updateCustomer(Customer c ,int id) {
		Customer pr=repo.getById(id);
	    repo.save(pr);
	    return pr;
	
	}
	@Override
	public Customer deleteCustomerById(int id) {
		repo.deleteById(id);
		return null;
	}
	@Override
	public Customer findById(int id) {
		Customer c= repo.getById(id);
		return c;
	}


}