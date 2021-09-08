/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JohnPC
 */
public class SumaNumTest {
    
    public SumaNumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumarDos method, of class SumaNum.
     */
    @Test
    public void testSumarDos() {
        System.out.println("sumarDos");
        int num1 = 452;
        int num2 = 56;
        SumaNum instance = new SumaNum();
        int expResult = 508;
        int result = instance.sumarDos(num1, num2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sumarTres method, of class SumaNum.
     */
    @Test
    public void testSumarTres() {
        System.out.println("sumarTres");
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        SumaNum instance = new SumaNum();
        int expResult = 6;
        int result = instance.sumarTres(num1, num2, num3);
        assertEquals(expResult, result);
       
    }

   
}
