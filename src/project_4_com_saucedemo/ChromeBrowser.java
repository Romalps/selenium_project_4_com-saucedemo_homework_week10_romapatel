package project_4_com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*
Project-4 - Project Name: com-saucedemo
BaseUrl = https://www.saucedemo.com/
1. Setup Chrome browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field
8. Close the browser
 */
public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        //Launch the chrome driver
        WebDriver driver = new ChromeDriver();
        // Open the URL into browser
        driver.get(baseUrl);
        // Maximize the browser window
        driver.manage().window().maximize();
        // Give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get and Print title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Get and Print the current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        // Get and print the page source
        System.out.println("Page source : " + driver.getPageSource());
        // Find and enter the email to email field
        driver.findElement(By.id("user-name")).sendKeys("prime123@gmail.com");
        // find and enter password to password field
        driver.findElement(By.id("password")).sendKeys("Prime123");

        // Closing the browser
        driver.close();
    }
}
