
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Course crs = new Course();

        Course crs2 = new Course(20320,"Li","BCS350");
        
         
        crs.setID(12012);
        crs.setName("Moaath");
        crs.setCode("CSC229");
        
         
    }
    
}
