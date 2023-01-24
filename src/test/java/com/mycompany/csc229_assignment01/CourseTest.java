/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.csc229_assignment01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MoaathAlrajab
 */
public class CourseTest {
    
    Course crs;
    public CourseTest() {
        crs= new Course();
    }

    //Test setter
    @Test
    public void testSomeMethod1() {
        crs.setName("Moaath");
        crs.setCode("CSC229");
        crs.setID(12012);
        
    }
    
    //Test setter
        @Test
    public void testSomeMethod2() {
            assertEquals("Moaath", crs.getName());
    }
    
        @Test
    public void testSomeMethod3() {
        assertEquals("CSC229", crs.getCode());
    }
    
        @Test
    public void testSomeMethod4() {
        assertEquals(12012, crs.getID());
    }
    
        @Test
    public void testSomeMethod5() {
        Course cr2= new Course(12012, "Moaath", "CSC229");
        
            assertNotNull(cr2);
    }
    
    
}
