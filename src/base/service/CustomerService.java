package base.service;

import base.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();

    Customer getCustomerById(int id);

    void saveCustomer(Customer customer);

    void deleteCustomer(int id);

}
