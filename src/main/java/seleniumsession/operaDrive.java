package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class operaDrive {
    public static void main(String[] argo) throws InterruptedException {

        System.setProperty("web-diver.opera.driver","C:\\Users\\visha\\IdeaProjects\\selenium\\operadriver.exe");
        WebDriver driver = new OperaDriver();
        Thread.sleep(4000);

        driver.close();
    }
}
