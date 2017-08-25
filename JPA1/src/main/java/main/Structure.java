/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Customer;

/**
 *
 * @author Oakberg
 */
public class Structure {
        public static void main(String[] args) {
        
        HashMap properties = new HashMap();
        properties.put("javax.persistense.sql-load-script-source","scripts/data.sql");
        
        Persistence.generateSchema("JPA1PU", properties);
        
        properties.remove("javax.persistense.sql-load-script-source","scripts/data.sql");
        
        Persistence.generateSchema("JPA1PU", properties);
        

    //EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA1PU"); //name of persistence unit here
    //EntityManager entityManager = factory.createEntityManager();
        
    }
     
}