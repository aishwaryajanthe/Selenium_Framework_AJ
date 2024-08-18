package page_objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class HomePage {
    WebDriver driver;
    Properties properties;
    public HomePage(WebDriver driver, Properties properties) {
        this.driver=driver;
        this.properties=properties;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath= "//div[contains(text(),'Sorry')]")
    WebElement error_message;

public String verify_error(){
    return error_message.getText();
}





}
