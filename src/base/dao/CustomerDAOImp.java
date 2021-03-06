package base.dao;

import base.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class CustomerDAOImp implements CustomerDAO{

    private SessionFactory sessionFactory;

    @Autowired
    public CustomerDAOImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Customer> getCustomers() {

        Session session = sessionFactory.getCurrentSession();

       Query<Customer> query = session.createQuery("FROM Customer order by lastName",Customer.class);

        return query.getResultList();
    }

    @Override
    public Customer getCustomerById(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Customer.class,id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(customer);
    }

    @Override
    public void deleteCustomer(int id) {

        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("delete from Customer where id =:theCustomerId ");

        query.setParameter("theCustomerId",id);

        query.executeUpdate();
    }
}
