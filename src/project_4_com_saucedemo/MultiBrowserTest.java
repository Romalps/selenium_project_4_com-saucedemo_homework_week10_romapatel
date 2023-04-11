package project_4_com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Edge";
    static WebDriver driver;
    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver=new FirefoxDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        // Open the URL into browser
        driver.get(baseUrl);
        //Maximise the browser
        driver.manage().window().maximize();
        // Give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Get the Title of the page
        String title= driver.getTitle();
        System.out.println(title);
        // Get current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        // Get Page source
        System.out.println("Page source : "+ driver.getPageSource());
        // Find and enter the email to email field
        driver.findElement(By.id("user-name")).sendKeys("prime123@gmail.com");
        // Find and Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("Prime123");

        // close the browser
        driver.close();

    }
}
