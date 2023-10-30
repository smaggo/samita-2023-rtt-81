package com.samita.customerDao.customerinterface;

import com.samita.customerDao.model.Customer;

public interface CustomerDao {
	 Customer getCustomerById(int id);
	    void addCustomer(Customer c);
	    void removeCustomerById(int id);
}
