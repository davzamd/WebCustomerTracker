package base.dao;

import base.entity.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> getCustomers();

    Customer getCustomerById(int id);

    void saveCustomer(Customer customer);

    void deleteCustomer(Customer customer);

}
