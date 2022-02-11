package seleniumsession;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriveBasic {

public static void main(String[] argo) throws InterruptedException, IllegalStateException {

    System.setProperty("webdiver.chrome.driver","C:\\Users\\visha\\IdeaProjects\\selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    Thread.sleep(3000);

   driver.close();
}

}
