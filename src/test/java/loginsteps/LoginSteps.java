package loginsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public static WebDriver driver;

    public void openUrl()  {
        System.setProperty("webdriver.chrome.driver","C://my softwares//Drivers//chromedriver.exe");
        driver =new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(" https://goo.gl/RVdKM9");

        }
        public void firstname(){
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Mounika");
        }
        public void lastname(){
            driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Reddy");

        }
        public void phoneNumber(){
            driver.findElement(By.id("RESULT_TextField-3")).sendKeys("7661867728");

        }
        public void countryName(){
            driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");

        }
        public void cityName(){
            driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Andhra Pradesh");

        }
        public void emailAddress(){
            driver.findElement(By.id("RESULT_TextField-6")).sendKeys("abc@gmail.com");

        }
        public void selectGender(){
            driver.findElement(By.id("//label[text()='Female']")).click();
        }
        public void checkBox(){
        driver.findElement(By.id("//label[text()='Sunday']")).click();
            driver.findElement(By.id("//label[text()='Monday']")).click();

        }
        public void dropDown(){
           WebElement elm= driver.findElement(By.id("RESULT_RadioButton-9"));
        Select dropdown=new Select(elm);
        dropdown.selectByVisibleText("Morning");

        }
        public void submit(){
        driver.findElement(By.id("FSsubmit")).click();

        }
        public void validation(){
        driver.getTitle();

        }
    }

