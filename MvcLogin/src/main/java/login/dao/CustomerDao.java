package login.dao;

import login.beans.Customer;

public interface CustomerDao {
	public void saveCustomer(Customer customer);
	public Customer loginCustomer(Customer customer);
}
