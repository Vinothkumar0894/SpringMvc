package login.services;

import org.springframework.beans.factory.annotation.Autowired;

import login.beans.Customer;
import login.dao.CustomerDao;

public class CustomerServiceImple implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao=customerDao;
	}
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}
	public Customer loginCustomer(Customer customer) {
		return customerDao.loginCustomer(customer);
	}

}
