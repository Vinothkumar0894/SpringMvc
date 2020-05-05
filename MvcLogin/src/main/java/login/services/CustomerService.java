package login.services;

import login.beans.Customer;

public interface CustomerService {
	public void saveCustomer(Customer customer);
	public Customer loginCustomer(Customer customer);

}
