package unittesting;

import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;

public class TestCalculator {

    @BeforeClass // @BeforeAll junit5
    public static void welcome(){
        System.out.println("*********** Welcome to unit testing class ***************************");
    }
    @AfterClass // @AfterAll junit 5
    public static void goodBye(){
        System.out.println("*********** good bye from unit testing class *********************");
    }
    @BeforeEach
    public static void tcStart(){
        System.out.println("********** test case execution starts***************");
    }


    // test class where we will call all the methods from action class / unit class
    // test case 1
    @Test
    public void testDoSum() {
        int expectedValue = 163;
        int actualValue = Calculator.doSum(113, 50);
        Assert.assertEquals("test Fail if Not Match", expectedValue, actualValue);
    }

    // test case 2
    @Test
    public void testDoSum1() {
        int expectedValue = 163;
        int actualValue = Calculator.doSum(113, 50);
        Assert.assertEquals("test Fail if Not Match", expectedValue, actualValue);
    }

    // test case 3
    @Test @Ignore // @Disabled junit 5
    public void testDoMulti() {
        int expectedValue = 200;
        int actualValue = Calculator.doMulti(10, 20);
        Assert.assertEquals("test Fail if Not Match", expectedValue, actualValue);
        // Assertions.assertEquals(expectedValue,actualValue,"test Fail if Not Match"); junit 5
    }
    // test case 4
    @Test
    public void testStFullName(){
        String expectedResult="iddir hadjal";
        String actualResult=Calculator.StFullName("iddir","hadjal");
        Assert.assertEquals("test fail if not match",expectedResult,actualResult);
    }
    // test case 5
    @Test
    public void testPizza(){
        boolean expectedResult=true;
        boolean actualResult=Calculator.Pizza();
        Assert.assertEquals("test fail if false ",expectedResult,actualResult);
    }




}
