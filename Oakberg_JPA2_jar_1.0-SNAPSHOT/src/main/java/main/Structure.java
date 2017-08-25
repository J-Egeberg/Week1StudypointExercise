/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import javax.persistence.Persistence;

/**
 *
 * @author Oakberg
 */
public class Structure {
        public static void main(String[] args) {
        
        HashMap properties = new HashMap();
        properties.put("javax.persistense.sql-load-script-source","scripts/data.sql");
        
        Persistence.generateSchema("jpqlexam", properties);
        
        properties.remove("javax.persistense.sql-load-script-source");
        
        Persistence.generateSchema("jpqlexam", properties);
        
        
    }
}
