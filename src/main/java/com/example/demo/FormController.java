package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Customer;

@Controller
public class FormController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping("/")
	public String customerForm(Model model){
		model.addAttribute("Customer", new Customer());
		return "inputForm";
	}

	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	
	@GetMapping("/getCustomers")
	public String getCustomers(){
		List<Customer> customerData = customerRepository.findAll();
		return "viewCustomers";
	}
	
	@PostMapping("/saveCustomer")
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Customer> getAllCustomers() {
	  return customerRepository.findAll();
	}

}