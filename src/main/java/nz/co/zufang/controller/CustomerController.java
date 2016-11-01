package nz.co.zufang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import nz.co.zufang.model.Customer;
import nz.co.zufang.service.CustomerService;

/**
 * Created by Lillian.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createCustomer(@RequestBody Customer customer) {
		Customer a = customerService.createCustomer(customer);
		return "Customer added successfully";
	}
	
	@RequestMapping(value = "/query/{id}",method = RequestMethod.GET)
    public Customer queryCustomerById(@PathVariable String id){
		Customer b = customerService.queryCustomerByID(id);
		return b;
	}
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Customer> listAllCustomers(){
		List<Customer> c = customerService.queryAllCustomers();
		return c;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Customer updateCustomer(@RequestBody Customer customer) {
		Customer d = customerService.updateCustomer(customer);
		return d;
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public Boolean deleteUser(@PathVariable String id){
		Boolean e = customerService.deleteCustomerById(id);
		return e;
	}
}
