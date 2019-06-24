package com.mm.day01;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGDemo1 {

    @BeforeTest
    //do the same things that all case do
    public void BeforeTest01(){
        System.out.println("BeforeTest");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod");
    }

    @Test
    public void testCase1(){
        System.out.println("testingShow1");

    }

    @Test
    public void testCase2(){
        System.out.println("testingShow2");

        int a = 1;
        int b = 2;
        String c = null;

//        Assert.assertNotEquals(a,b,"a=b");
        Assert.assertNull(a);
        System.out.println("11111======================11111");

    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod");

    }



    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");




    }




}
