package com.bankingproject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankingproject.dao.CustomerAccountDao;

@RestController
public class BankAccountOpeningController {
	
	
	@PostMapping("/customer")
	public String addingCustomer(@RequestBody CustomerAccountDao customerAccountDao)
	{
		System.out.println("test date "+customerAccountDao.getDoj());
		return "successfull";
	}

}
