package com.mm.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class findElement {

    /**
     * 打开新浪新闻，
     * 使用多种方法获取元素
     * 关闭浏览器
     */

    WebDriver driver;
//    @BeforeMethod
//    public void openChrome() throws InterruptedException{
//        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.navigate().to(" https://www.sina.com.cn/");
//        Thread.sleep(3000);
//    }

    @Test
    public void setValueInput() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(" https://www.baidu.com/");
        Thread.sleep(3000);
        //use id  find element
        WebElement Input = driver.findElement(By.id("kw"));//Input.sendKeys();
        Thread.sleep(6000);

        driver.quit();
        //use name

        //use classname

    }

    //    @AfterMethod
//    public void closeChrome(){
//        driver.quit();
//    }
    @Test
    public void findElement() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(" https://www.baidu.com/");
        Thread.sleep(3000);
        //find element by LinkedText
//        WebElement Input = driver.findElement(By.partialLinkText("闻"));
        List<WebElement> Input= driver.findElements(By.tagName("input"));
        System.out.println(Input.size());
        Thread.sleep(6000);
//        Input.click();
        driver.quit();
    }

    @Test
    public void findElementByXpath() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(" https://www.baidu.com/");
        Thread.sleep(3000);
        //find element by LinkedTex
//        WebElement Input = driver.findElement(By.partialLinkText("闻"));
        WebElement Input= driver.findElement(By.cssSelector("#kw"));

        Thread.sleep(6000);
//        Input.click();
        driver.quit();
    }



}
