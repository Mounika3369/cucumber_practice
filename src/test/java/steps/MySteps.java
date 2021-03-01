package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class   MySteps {
    public static WebDriver driver;
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void enterUrl(){
        driver.get("http://practice.automationtesting.in/");
    }
    public void clickOnMyAccount(){
        driver.findElement(By.linkText("My Account")).click();
    }
    public void enterIdPassword(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("gandhaveetimounika@gmail.com");
        driver.findElement(By.id("password")).sendKeys("bujji@33");

    }
    public void clickOnLogin(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("login")).click();

    }
    public void verifyLoginSuccessfully(){
        String cap_text= driver.findElement(By.xpath("//strong[text()='gandhaveetimounika']")).getText();
        Assert.assertEquals(true,cap_text.contains("gandhaveetimounika"));

    }
    }



