package com.amusementBookingApplication.Service;

import com.amusementBookingApplication.Entity.Customer;
import com.amusementBookingApplication.Exception.CustomerNotFoundException;
import com.amusementBookingApplication.Exception.InvalidId;
import com.amusementBookingApplication.Exception.TicketNotFoundException;
import com.amusementBookingApplication.Pojos.CustomerOutput;
import com.amusementBookingApplication.Pojos.LoginRequest;
import com.amusementBookingApplication.Pojos.updateRequestBody;

public interface CustomerService {
	
	//public Customer addCustomer(Customer c) throws CustomerExistsException ;
	public Customer updateCustomer(LoginRequest customer) throws CustomerNotFoundException;
	public Iterable<CustomerOutput> viewAllCustomers();
	public Customer vaildCustomer(String Email, String Password) throws InvalidId ;
	Customer addCustomer(LoginRequest log);
	Customer deleteCustomer(int id) throws CustomerNotFoundException, TicketNotFoundException ;
	CustomerOutput getCustomer(int customerId) throws CustomerNotFoundException;
    Customer getCustomerByEmail(String email);
    Customer updateCustomerById(updateRequestBody customer, int id) throws CustomerNotFoundException;
}
