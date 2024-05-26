package AB;

import java.util.*;

public class ABCVD {
    public static void main(String[] args) {
        blic static void main(String[] args) {
            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Initialize ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Open the browser and navigate to the webpage
            driver.get("URL_of_the_page");

            // Find the link element and click on it
            WebElement link = driver.findElement(By.xpath("xpath_of_the_link"));
            link.click();

            // Get all window handles
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

            // Switch to the 4th tab
            driver.switchTo().window(tabs.get(3));

            // Now you are in the 4th tab, you can perform actions as needed

            // Close the browser
            driver.quit();
        }