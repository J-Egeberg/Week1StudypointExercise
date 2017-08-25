/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Customer;
import model.ItemType;
import model.Orders;
import model.OrderLine;

/**
 *
 * @author Oakberg
 */
public class OrderFacade implements OrderFacadeInterface {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory( "JPA1PU" );
    EntityManager em = emf.createEntityManager();
        
    Customer customer = new Customer();
    ItemType itemType = new ItemType();
    Orders order = new Orders();
    OrderLine orderLine = new OrderLine();
    ArrayList<Customer> customers = new ArrayList();
    
    @Override
    public Customer createCustomer(Customer customer) {
    EntityManager em = emf.createEntityManager();

       try
        {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
            customers.add(customer);
            return customer;
        }
        finally
        {
            em.close();
        }    
    }

    @Override
    public void findCustomer(String name) {   
    }
    
    @Override
    public void getAllCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i).getName());
        } 
        }

    @Override
    public Orders createOrder(Orders order) {
    EntityManager em = emf.createEntityManager();

       try
        {
            em.getTransaction().begin();
            em.persist(order);
            em.getTransaction().commit();
            return order;
        }
        finally
        {
            em.close();
        }        }

    @Override
    public OrderLine createOrderLine(OrderLine orderLine) {
    EntityManager em = emf.createEntityManager();

       try
        {
            em.getTransaction().begin();
            em.persist(orderLine);
            em.getTransaction().commit();
            return orderLine;
        }
        finally
        {
            em.close();
        }        }

    @Override
    public ItemType createItemType(ItemType itemType) {
    EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            em.persist(itemType);
            em.getTransaction().commit();
        }
        finally
        {
            em.close();
        }  return itemType; }
    
    
  
}
