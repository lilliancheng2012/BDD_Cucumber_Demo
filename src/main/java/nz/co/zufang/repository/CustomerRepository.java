package nz.co.zufang.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nz.co.zufang.model.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, String>{
	
	
}