import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;





public class FirstTest {

    public WebDriver driver;

    //Declare a test URL variable
    public String testURL = "https://www.facebook.com/";

    //-----------------------------------Test Setup-----------------------------------
    @Test
    public void setupTest (){
        //Create a new ChromeDriver
        System.setProperty("webdriver.gecko.driver","C:\\Users\\deept\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");

        driver = new FirefoxDriver();
        //Go to www.swtestacademy.com
        driver.navigate().to(testURL);
        driver.findElement(By.id("email")).sendKeys("deepti.madhuri@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("deepti1");
        driver.findElement(By.id("loginbutton")).click();
        System.out.println("Clicked the button");



    }

}
