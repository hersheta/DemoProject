import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class Login {
    public static void main(String args[]) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.facebook.com");
        String title=driver.getTitle();
        System.out.println(title);
        driver.findElement(By.xpath("//input[@aria-label='ईमेल या फ़ोन नंबर']")).sendKeys("hershiitasrivastav@gmail.com");
      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("2u32hef");
        driver.findElement(By.xpath("//button")).click();


       // driver.findElement(By.xpath(//input[@id="email"])).sendKeys("harshitashrivastav3108@gmail.com");
       // driver.findElement(By.xpath((""//input[@id="pass"]).sendKeys("momharshitA@1");
   //     driver.findElement(By.xpath(//button[@name="login"]).click();

    }
}
