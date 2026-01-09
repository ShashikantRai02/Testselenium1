package ex02_seleniumbasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testselenium2 {
    @Test
    public void test_basics()
    {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");

    }
}
