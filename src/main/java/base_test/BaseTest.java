package base_test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public  static final String project_path=System.getProperty("user.dir");
    public static WebDriver driver;
    public static Properties properties;
    public BaseTest() throws IOException {
        FileInputStream inputStream=new FileInputStream(project_path+"\\src\\main\\resources\\configuration\\config.properties");
        properties=new Properties();
        properties.load(inputStream);
        launch_browser();
        launch_url();

    }
private void launch_browser(){
        if(properties.getProperty("browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",project_path+"\\src\\main\\resources\\drivers\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
}
private void launch_url(){
        driver.get(properties.getProperty("url"));
}
}
