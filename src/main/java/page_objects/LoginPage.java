package page_objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class LoginPage {
    WebDriver driver;
    Properties properties;
    public LoginPage(WebDriver driver, Properties properties) {
        this.driver=driver;
        this.properties=properties;
        PageFactory.initElements(driver,this);
    }


    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//div[text()='Log in']")
    WebElement login_btn;

   public void enter_user_name(){
       username.sendKeys(properties.getProperty("username"));
   }
   public void enter_password(){
       password.sendKeys(properties.getProperty("password"));
   }
   public void click_login(){
       login_btn.click();
   }

}