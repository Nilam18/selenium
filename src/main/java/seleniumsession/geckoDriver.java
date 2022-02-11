package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.IOException;

public class geckoDriver {

        public static void main(String[] argo) throws InterruptedException {

            System.setProperty("web-diver.gerko.drive.driver","C:\\Users\\visha\\IdeaProjects\\selenium\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            Thread.sleep(3000);

            driver.close();
        }

    }


