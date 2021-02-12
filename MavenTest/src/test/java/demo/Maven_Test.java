package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Maven_Test 
{
static 
{
    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

@Test
public void tc_01()
{
      WebDriver driver = new ChromeDriver();	
      driver.get("http://www.google.com");
}
}
