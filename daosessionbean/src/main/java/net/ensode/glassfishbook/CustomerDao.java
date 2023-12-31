package net.ensode.glassfishbook;

import javax.ejb.Remote;

@Remote
public interface CustomerDao {

    public void saveCustomer(Customer customer);

    public Customer getCustomer(Long customerId);

    public void deleteCustomer(Customer customer);
}
