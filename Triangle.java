/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Triangle.*;
/**
 * 
 *
 * @author Anon
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
@Test
    public void test1() {
        System.out.println("isEquilateral");
        Triangle instance = new Triangle(10,10,10);  //สร้างสามเหลี่ยมด้านเท่า
        boolean expResult = true; //กำหนดผลลัพธ์ที่คาดว่าจะได้ คือ สามเหลี่ยม 10 10 10 ควรจะเป็น สามเหลี่ยมด้านเท่า
        boolean result = instance.isEquilateral(); //เรียก เม็ดธ็อด ว่าเป็นสามเหลี่ยใด้านเท่าหรือไม่
        assertEquals(expResult, result); // ค่าที่คาดว่าจะได้ ต้องตรงกันกับ ผลลัพธ์ที่ได้จริง
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void test2() {
        System.out.println("isIsosceles");
        Triangle instance = new Triangle(10,10,5);;
        boolean expResult = true;
        boolean result = instance.isIsosceles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void test3() {
        System.out.println("isScalene");
        Triangle instance = new Triangle(9,8,7);
        boolean expResult = true;
        boolean result = instance.isScalene();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void test4() {
        System.out.println("isIsosceles");
        Triangle instance = new Triangle(10,5,10);;
        boolean expResult = true;
        boolean result = instance.isIsosceles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
@Test
    public void test5() {
        System.out.println("isScalene");
        Triangle instance = new Triangle(9.5,8.5,9.5);
        boolean expResult = true;
        boolean result = instance.isScalene();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");}
    }
  @Test
    public void test6() {
        System.out.println("Error");
        Triangle instance = new Triangle(-1,-2,-1);
        boolean expResult = true;
        boolean result = instance.isNotTriangle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");}
    }
    @Test
    public void test8() {
        System.out.println("Error");
        Triangle instance = new Triangle(,,);
        boolean expResult = false;
        boolean result = instance.isNotTriangle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");}
    }
    @Test
    public void test9() {
        System.out.println("Error");
        Triangle instance = new Triangle(0,0,0);
        boolean expResult = false;
        boolean result = instance.isNotTriangle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");}
    }
}
