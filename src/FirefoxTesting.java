import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTesting {
    public static void main(String[] args) {
        FirefoxTesting d = new FirefoxTesting();
        d.firefoxtest();
    }


    public void firefoxtest(){

        String baseurl = "http://the-internet.herokuapp.com/login\n";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        //driver.close();
    }

}
