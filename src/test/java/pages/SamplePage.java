package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SamplePage {
    public static WebDriver driver;
    public void luanch_url(){
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void loginToApplication(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Enter username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //Enter password
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        //Click on login button
        driver.findElement(By.id("btnLogin")).click();
    }

    public void verifyTitle(){
        String act_title=driver.getTitle();
        String exp_title="OrangeHRM";
        //Verify title of the page
        if(act_title.equals(exp_title)){
            System.out.println("Our test passed");
        }else{
            System.out.println("Our test is failed");
        }
    }

    public void userClicksOnHomePageTab(String eleName){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String path = "//ul[@id='mainMenuFirstLevelUnorderedList']//b[text()='"+eleName+"']";
        driver.findElement(By.xpath(path)).click();
    }

    public void verifyHeaders(String expHeader){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String headerPath = "//h1[text()='"+expHeader+"']";
        String headerText = driver.findElement(By.xpath(headerPath)).getText();
        boolean testResult= false;
        if(headerText.equalsIgnoreCase(expHeader)){
            System.out.println("header present");
            testResult = true;
        }
        Assert.assertTrue(testResult);
    }

}
