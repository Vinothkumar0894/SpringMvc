package login.application;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import login.beans.Customer;
import login.services.CustomerService;
import login.validation.CustomerValidation;
@Controller 
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/register,method=RequestMethod.GET")
	public String showForm(ModelMap model) {
		model.put("customerData",new Customer());
		return"register/register";
	}
	@RequestMapping(value="/register,method=RequestMethod.POST")
	public String saveForm(ModelMap model,@ModelAttribute("customerData")@Valid Customer customer,BindingResult br,HttpSession session) 
	{
	CustomerValidation customerValidation=new CustomerValidation();
	customerValidation.validate(customerValidation,br);
	if(br.hasErrors()) {
		return"register/register";
	}else {
		customerService.saveCustomer(customer);
		session.setAttribute("customer",customer);
		return"redirect:success";
	}

}
@RequestMapping(value="/login,method=RequestMethod.GET")
public String showLogin(ModelMap model,HttpSession session) {
	if(session.getAttribute("customer")==null) {
		model.put("customerData",new Customer());
		return"login/login";
	}
	else {
		return"redirect:success";
	}
}
@RequestMapping(value="/login,method=RequestMethod.POST")
public String doLogin(ModelMap model,@ModelAttribute("customerData")Customer customer,HttpSession session) {
if(customer.getemail()!=null&&customer.getpassword()!=null&&session.getAttribute("customer")==null) {
	customer=customerService.loginCustomer(customer);
	if(customer!=null) {
		session.setAttribute("customer",customer);
		return"redirect:success";
	}else {
		model.put("failed","Login Failed");
		return"login/login";
	}
}else {
		return"redirect:success";
	}
	
	}
@RequestMapping(value="/logout,method=RequestMethod.GET")
public String logOut(ModelMap Model,HttpSession session) {
	session.removeAttribute("customer");
	return"redirect:login";
	
}
@RequestMapping(value="/success,method=RequestMethod.GET")
public String showSuccess(ModelMap Model) {
	Model.put("success",new Customer());
	return"success";

	
}
}