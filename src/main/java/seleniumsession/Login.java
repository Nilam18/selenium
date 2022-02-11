package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {


        public static void main(String[] argo) throws InterruptedException {

            System.setProperty("webdiver.chrome.driver","C:\\Users\\visha\\IdeaProjects\\selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();


            driver.get("https://demo.nopcommerce.com/");
            Thread.sleep(3000);
            driver.findElement(By.className("ico-login")).click();


            driver.findElement(By.id("Email")). sendKeys("nsharma18@hotmail.com");
            Thread.sleep(2000);
            driver.findElement(By.id("Password")). sendKeys("Password123");
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
            Thread.sleep(3000);



            driver.close();
        }

    }






