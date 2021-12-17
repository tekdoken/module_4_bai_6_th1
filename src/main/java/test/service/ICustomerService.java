package test.service;

import test.model.Customer;

public interface ICustomerService extends IGeneralService<Customer>{
    void save(Customer customer);
}
