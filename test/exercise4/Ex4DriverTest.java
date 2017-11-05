/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yasiro01
 */
public class Ex4DriverTest {
  
  public Ex4DriverTest() {
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
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        // take integer and return one more than the integer
        System.out.println("task1");
        Integer n = 4;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 5;
        Integer result = instance.task1(n);
        assertEquals(expResult, result);
        n = -4;
        expResult = -3;
        result = instance.task1(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        // take string and return the length
        System.out.println("task2");
        String s = "task2";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 5;
        Integer result = instance.task2(s);
        assertEquals(expResult, result);
        s = ";;:";
        expResult = 3;
        result = instance.task2(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        // take character and return 3
        System.out.println("task3");
        Character c = 'C';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 3;
        Integer result = instance.task3(c);
        assertEquals(expResult, result);
        c = '!';
        expResult = 3;
        result = instance.task3(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        // takes a string and returns the first character
        System.out.println("task4");
        String s = "task4";
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 't';
        Character result = instance.task4(s);
        assertEquals(expResult, result);
        s = "CS252";
        expResult = 'C';
        result = instance.task4(s);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
         // takes two integers and returns the sum
        System.out.println("task5");
        Integer x = 4;
        Integer y = 5;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 9;
        Integer result = instance.task5(x, y);
        assertEquals(expResult, result);
        x = 4;
        y = -3;
        expResult = 1;
        result = instance.task5(x, y);
        assertEquals(expResult, result);
     
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
             // takes a string and integer and returns character at the yth + 1 position

        System.out.println("task6");
        String x = "task6";
        Integer y = 4;
        Ex4Driver instance = new Ex4Driver();
        Character expResult = '6';
        Character result = instance.task6(x, y);
        assertEquals(expResult, result);
        x = "CS252";
        y = 3;
        expResult = '5';
        result = instance.task6(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
             // takes an array of integers and returns the first integer in the array

        System.out.println("task7");
        Integer[] a = new Integer[5];
        a[0] = 4;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 4;
        Integer result = instance.task7(a);
        assertEquals(expResult, result);
        a[0] = 5;
        expResult = 5;
        result = instance.task7(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
      // takes an array of integers and an integer and returns true if the integer is the same as the length of the array; false otherwise
        System.out.println("task8");
        Integer[] a = new Integer[5];
        Integer i = 4;
        Ex4Driver instance = new Ex4Driver();
        Boolean expResult = false;
        Boolean result = instance.task8(a, i);
        assertEquals(expResult, result);
        i = 5;
        expResult = true;
        result = instance.task8(a, i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
      // takes a arraylist of strings and returns the size of the list
        System.out.println("task9");
        ArrayList<String> s = new ArrayList();
        s.add("CS252");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 1;
        Integer result = instance.task9(s);
        assertEquals(expResult, result);
        s.add("CS165");
        expResult = 2;
        result = instance.task9(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
              // takes a hashmap as a parameter and returns 0

        System.out.println("task10");
        HashMap<String, Integer> h = new HashMap<>();
        h.put("Dog", 1);
        h.put("Cat", 2);
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 0;
        Integer result = instance.task10(h);
        assertEquals(expResult, result);
        h.put("Elephant", 40);
        expResult = 0;
        result = instance.task10(h);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
