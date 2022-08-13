import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTesting {


    public static void main(String[] args) {
        ChromeTesting d = new ChromeTesting();
        d.chrometest();
    }

    public void chrometest(){
        String baseurl = "http://the-internet.herokuapp.com/login\n";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
        //driver.close();



    }

}
