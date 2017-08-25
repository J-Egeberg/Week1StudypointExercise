/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oakberg
 */ 
import javax.persistence.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        
        HashMap properties = new HashMap();
        properties.put("javax.persistense.sql-load-script-source","scripts/data.sql");
        
        Persistence.generateSchema("JPAPU", properties);
        
        properties.remove("javax.persistense.sql-load-script-source","scripts/data.sql");
        
        Persistence.generateSchema("JPAPU", properties);
        
        
    }
    
}
