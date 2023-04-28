package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static String baseUrl="https://www.amazon.co.uk/";
public static WebDriver driver;

public static void openBrowser (){
    driver = new ChromeDriver();//Launch the driver
    driver.get(baseUrl);//pass the baseUrl
    driver.manage().window().maximize();//maximize the window
    //Implicit TimeOut
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
public void closeBrowser(){

    driver.quit();//clse all selenium instance browser
}





}

