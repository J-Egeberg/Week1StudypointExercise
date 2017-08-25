/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import facade.OrderFacade;
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
public class Populate {
                
    public static void main(String[] args) {
    
        OrderFacade orderFacade = new OrderFacade();
        Customer customer = new Customer();
        Orders order = new Orders();
        OrderLine orderLine = new OrderLine();
        ItemType itemType = new ItemType();

        
        customer.setEmail("@hej");
        customer.setName("Jans");
        orderFacade.createCustomer(customer);
        
        order.setTitle("FLISER");
        orderFacade.createOrder(order);
        
        orderLine.setQuantity(16);
        orderFacade.createOrderLine(orderLine);
        
        itemType.setDescription("luk røven i føtex");
        itemType.setName("tekst");
        orderFacade.createItemType(itemType);
        

    
}
}
