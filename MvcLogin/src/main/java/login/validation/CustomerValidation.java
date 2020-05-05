package login.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import login.beans.Customer;

public class CustomerValidation implements Validator{
	public boolean supports(Class<?>argo) {
		return Customer.class.equals(argo);
	}
	public void validate(Object argo,Errors arg1) {
		
	}
}
