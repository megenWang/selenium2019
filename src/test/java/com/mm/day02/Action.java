package com.mm.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Action {
    WebDriver driver;
    @BeforeMethod
    public void BeforeMethod(){
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("================================1111111");
    }


    @Test
    public void clickAction(){
        /**
         * 1.定位新闻页面连接
         * 2.点击新闻页面链接
         * 3.获取跳转后的url
         * 4.验证页面跳转后的url是否正确
         */

        driver.navigate().to("https://www.baidu.com/");
        WebElement newsButton = driver.findElement(By.linkText("新闻"));
        newsButton.click();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"http://news.baidu.com/");

    }


    @Test
    public void sedkeysAction(){
        /**
         * 1.打开百度首页
         * 2.在搜索框中输入selenium
         * 3.点击百度一下按钮
         * 4.验证页面跳转后的页面
         */

        driver.navigate().to("https://www.baidu.com/");
        WebElement searchContext = driver.findElement(By.id("kw"));
        searchContext.sendKeys("selenium");

        WebElement searchbutton = driver.findElement(By.id("su"));
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.baidu.com/s?wd=selenium&rsv_spt=1&rsv_iqid=0xff8a66550011fc2d&issp=1&f=8&rsv_bp=1&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=1&rsv_sug3=9&rsv_sug1=6&rsv_sug7=101&rsv_t=a4d6Lu%2BBZePcN3nL9uRhoDunLEPpPAFwh3qK8uyK%2BuygXb9QyZL6JQCojhjUH5ZjfSYh&rsv_sug2=0&inputT=176071&rsv_sug4=176071&rsv_sug=2");

    }

    @AfterMethod
    public void AfterMethod(){
        driver.quit();
        System.out.println("================================22222222222");


    }
}
