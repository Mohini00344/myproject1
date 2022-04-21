package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface HomeServices {
	Customer saveCustomer(Customer c);
	List<Customer>fetchCustomerList();
	Customer updateCustomer(Customer c,int id);
	Customer deleteCustomerById(int id);
	Customer findById(int id);

}