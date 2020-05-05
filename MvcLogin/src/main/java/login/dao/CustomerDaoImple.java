package login.dao;

import javax.print.ServiceUIFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import login.beans.Customer;

public class CustomerDaoImple implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory=sessionFactory;
}

public void saveCustomer(Customer customer) {
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	if(customer!=null) {
		try {
			session.save(customer);
			tx.commit();
			session.close();
		}catch(Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
	}
	}
	public Customer loginCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="login.beans.Customer as where email=? and password=?";
		try {
			Query query=session.createQuery(hql);
			query.setParameter(0,customer.getemail());
			query.setParameter(1,customer.getpassword());
			customer=(Customer) query.uniqueResult();
			tx.commit();
			session.close();
		}
		catch(Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		return customer;
	}
}
