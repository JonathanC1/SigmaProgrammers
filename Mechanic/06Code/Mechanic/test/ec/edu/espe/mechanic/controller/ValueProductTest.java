package ec.edu.espe.mechanic.controller;

import com.mongodb.DBObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sigma Programmers
 */
public class ValueProductTest {
    
    public ValueProductTest() {
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
     * Test of addProduct method, of class ValueProduct.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String name = "";
        int quanty = 0;
        int price = 0;
        ValueProduct instance = new ValueProduct();
        DBObject expResult = null;
        DBObject result = instance.addProduct(name, quanty, price);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
