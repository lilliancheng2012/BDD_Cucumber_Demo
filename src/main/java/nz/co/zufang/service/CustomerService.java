package nz.co.zufang.service;

import java.util.List;

import nz.co.zufang.model.Customer;

public interface CustomerService {
	
	Customer createCustomer(Customer customer);
	
	Customer queryCustomerByID(String id);
	
	List<Customer> queryAllCustomers();
	
	Customer updateCustomer(Customer customer);
	
	Boolean deleteCustomerById(String id);
	
}