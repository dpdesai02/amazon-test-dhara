package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class AmazonTest extends Utility {
    @Before
    public void setUp() {
        openBrowser();

    }

    @After
    public void tearDown() {
        closeBrowser();//close browser
    }

    //Type "Dell Laptop" in the search box and press enter or click on search Button

    @Test
    public void selectMenu() throws InterruptedException {
        //accept alert
        Thread.sleep(2000);
        clickOnElement(By.xpath("//input[@id='sp-cc-accept']"));
        Thread.sleep(2000);
        //send text to search bar
        sendTextToElement(By.xpath("//input[@id='twotabsearchtextbox']"), "Dell Laptop");
        Thread.sleep(2000);
        //Click on Submit
        mouseHoverAndClickOnElement(By.xpath("//input[@id='nav-search-submit-button']"));
        Thread.sleep(2000);
        //Click on the checkbox brand Dell on the left side.
        clickOnElement(By.xpath("//li[@id='p_89/Dell']//i[@class='a-icon a-icon-checkbox']"));
        //get number of elements
        int actualNumPerPage = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).size();
        //print number of elements
        System.out.println(actualNumPerPage);
        //define expected
        int expectedNumPerPage = 30;
        Thread.sleep(2000);
        //verify expected is equal to actual
        Assert.assertEquals("not 31",expectedNumPerPage,actualNumPerPage);
        //print all elements
        List<WebElement> listProducts = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement lists : listProducts){
            System.out.println(lists.getText());
        }
        // Click on the product name 'Dell LATITUDE 5300 LAPTOP CORE I5 8365u 8GB 250GB SSD 13.3" FHD TOUCH'
       clickOnElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Dell LATITUDE 5300 LAPTOP CORE I5 8365u 8GB 250GB SSD 13.3 FHD TOUCH )]"));
       Thread.sleep(5000);
        // Verify product text
       verifyTextDisplayed(By.id("productTitle"), " 'Dell LATITUDE 5300 LAPTOP CORE I5 8365u 8GB 250GB SSD 13.3 FHD TOUCH ");
   }

}






