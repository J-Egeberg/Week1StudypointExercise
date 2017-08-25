/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import javax.persistence.Id;
import model.Customer;
import model.ItemType;
import model.Orders;
import model.OrderLine;

/**
 *
 * @author Oakberg
 */
public interface OrderFacadeInterface {
    
    public Customer createCustomer (Customer customer);

    public void findCustomer (String name);

    public void getAllCustomers();
    
    public Orders createOrder(Orders order); 

    //addOrderToCustomer

    //findOrder

    public ItemType createItemType (ItemType itemType); 

    public OrderLine createOrderLine (OrderLine orderLine);

    //findTotalPriceOrder

    
}
