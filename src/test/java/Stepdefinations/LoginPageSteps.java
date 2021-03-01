package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageSteps {
    public WebDriver driver;
public void enterUrl(){
    System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://opensource-demo.orangehrmlive.com/");

}
public void usrpwd(){
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
}
public void loginbtn(){
    driver.findElement(By.id("btnLogin")).click();
}
public void login(){
    driver.getTitle();
}
}
