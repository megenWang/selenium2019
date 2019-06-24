package com.mm.day02;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class windowNavigate {

    @Test
    public void windowNavigate() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mbd.baidu.com/newspage/data/landingsuper?context=%7B%22nid%22%3A%22news_9985804555278491558%22%7D&n_type=0&p_from=1");
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        driver.navigate().forward();
//        Thread.sleep(5000);
//        driver.navigate().refresh();

//        Dimension dimension = new Dimension(900,800);
//        driver.manage().window().setSize(dimension);
//        Thread.sleep(5000);
//        driver.manage().window().fullscreen();
//        Thread.sleep(5000);

        driver.manage().window().setSize(new Dimension(1280,800));
//        String url = driver.getCurrentUrl();
//        System.out.println(url);
//
//        String title = driver.getTitle();
//
//        System.out.println(title);

    }


    @Test
    public void testCurrentPage()throws InterruptedException{
              /*
        打开浏览器
        打开百度页面
        等待3s
        获取当前的url
        校验当前页面是不是百度首页
        关闭当前浏览器
         */
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.baidu.com/");
        Thread.sleep(3000);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://www.baidu.com/");
        driver.quit();
    }

    @Test
    public void SetValue()throws InterruptedException{
              /*sendkeys
        打开浏览器
        打开百度页面
        等待3s
        获取当前的url
        校验当前页面是不是百度首页
        关闭当前浏览器
         */
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.baidu.com/");
        Thread.sleep(3000);
        WebElement inputValue = driver.findElement(By.id("kw"));
        inputValue.sendKeys("selenium");
        driver.findElement(By.id("su")).click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        Assert.assertEquals(title,"selenium_百度搜索");
        driver.quit();
    }


    @Test
    public void ClearValue()throws InterruptedException{
              /*   clear()
        打开浏览器
        打开百度页面
        等待3s
        输入关键字selenium
        校验文本框内容是否为selenium
        清除文本框
        再次获取输入框文本
        校验文本框内容为重新输入值
         */
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.baidu.com/");
        Thread.sleep(3000);
        WebElement inputValue = driver.findElement(By.id("kw"));
        inputValue.sendKeys("selenium");
        String text1 = inputValue.getText();
        Thread.sleep(3000);
        inputValue.clear();
        Thread.sleep(3000);
        inputValue.sendKeys("ResetValue");
        driver.findElement(By.id("su")).click();
        Thread.sleep(3000);
        driver.quit();
    }


    /*
    1.打开百度页面
    2.获取文本框的tagname
    3.校验是否为input

     */
    @Test
    public void getTagName(){
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        String tagName = driver.findElement(By.id("kw")).getTagName();
        Assert.assertEquals(tagName,"input");
        driver.quit();

}

    /**
     * 1.打开百度页面
     * 2.获取按钮的值为百度一下
     */
    @Test
    public void getAttribute(){
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        String Name = driver.findElement(By.id("su")).getAttribute("value");
        Assert.assertEquals(Name,"百度一下");
        driver.quit();

    }
    /**
     *1.打开百度首页
     * 2.查看页面是否显示百度一下按钮  isDisplayed
     */
    @Test
    public void isDisplayed(){
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        Boolean trueLy = driver.findElement(By.id("su")).isDisplayed();
        Assert.assertTrue(trueLy);
        driver.quit();

    }
    /**
     * 1.打开测试页面
     * 2.判断XX单选框被选中
     * isSelected
     */

    /**
     *
     * is Enabled
     */

    /**
     * 截图
     */
    @Test
    public void ScreenShot(){

        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com/");
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(file,new File("D:\\ScreenShot1.png"));
        }catch(IOException e){
            e.printStackTrace();
        }


    }





}
