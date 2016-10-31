package nz.co.zufang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nz.co.zufang.model.Customer;
import nz.co.zufang.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		Customer a = customerRepository.save(customer);
		return a;
	}

	@Override
	public Customer queryCustomerByID(String id) {
		Customer b = customerRepository.findOne(id);
		return b;
	}

	@Override
	public List<Customer> queryAllCustomers() {
		List<Customer> c = (List<Customer>)customerRepository.findAll();
		return c;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Customer d = customerRepository.save(customer);
		return d;
	}

	@Override
	public Boolean deleteCustomerById(String id) {
		customerRepository.delete(id);
		return true;
	}

}
