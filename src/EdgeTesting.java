import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTesting {

    public static void main(String[] args) {


        EdgeTesting d = new EdgeTesting();
        d.edgetest();

    }


    public void edgetest(){
        String baseurl = "http://the-internet.herokuapp.com/login\n";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
       // driver.close();
    }
}
