package stepDef1;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MyStepDefination {
    public WebDriver driver;

    public void enterUrl(String url){
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    /*public void login(String username,String password){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }*/
    public void login(DataTable cradentials){
        List<Map<String,String>>data=cradentials.asMaps(String.class,String.class);
        driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get("password"));

    }
    public void loginButton(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("btnLogin")).click();
    }
    public void verifyLogin(){
      String act_title= driver.getTitle();
       Assert.assertEquals("OrangeHRM", act_title);

       // driver.close();


    }
}
