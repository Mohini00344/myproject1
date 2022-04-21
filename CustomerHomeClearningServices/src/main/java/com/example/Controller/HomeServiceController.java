package com.example.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.HomeServices;
import com.example.demo.Customer;

@RestController
@RequestMapping("/api")
public class HomeServiceController {
    @Autowired
    HomeServices service;
    @RequestMapping("/services")
    public String tests() {
    	return "test home service controller";
    }
    @RequestMapping(value="/customer/{id}",method=RequestMethod.GET)
    public Customer test(@PathVariable("id")int id,Model model) {
    	Customer c=service.findById(id);
    	model.addAttribute("result",c);
    	System.out.println(c);
    	return c;
    	
    }
    @RequestMapping("/getProduct/{id}")
    public ResponseEntity<Customer> findOne(@PathVariable(value="id")Integer id) {
    	Customer c=service.findById(id);
    	if(c !=null) {
    		return new ResponseEntity<>(c,HttpStatus.OK);
    		
    	}
    	else {
    		return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    	}
    }
    @GetMapping("/getProducts")
    List<Customer> listProducts(){
    	List<Customer> Customerlist=service.fetchCustomerList();
        for(Customer c:Customerlist)
        	System.out.println(c+"\n");
        return Customerlist;
    
    }
    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer c){
    	service.saveCustomer(c);
    	return new ResponseEntity<Customer>(c,HttpStatus.OK);
    }
    
   @PutMapping("/update")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer c){
    	service.updateCustomer(c,c.getId());
    	return new ResponseEntity<Customer>(c,HttpStatus.OK);
    }
    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Customer> deleteCustomerById(@PathVariable("id") int id){
    	Customer c=service.deleteCustomerById(id);
    	return new ResponseEntity<Customer>(c,HttpStatus.OK);
    }
}