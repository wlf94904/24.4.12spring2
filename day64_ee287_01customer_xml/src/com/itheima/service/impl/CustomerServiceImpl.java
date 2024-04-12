package com.itheima.service.impl;

import java.util.List;

import com.itheima.dao.ICustomerDao;
import com.itheima.dao.impl.CustomerDaoImpl;
import com.itheima.domain.Customer;
import com.itheima.service.ICustomerService;

/**
 * 客户的业务层实现类
 * @author 86131
 *
 */
public class CustomerServiceImpl implements ICustomerService {
	
	private ICustomerDao customerDao=new CustomerDaoImpl();

	@Override
	public List<Customer> findAllCustomer() {
		return customerDao.findAllCustomer();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);

	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);

	}

	@Override
	public void deleteCustomer(Long custId) {
		customerDao.deleteCustomer(custId);

	}

	@Override
	public Customer findCustomerById(Long custId) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(custId);
	}

}
