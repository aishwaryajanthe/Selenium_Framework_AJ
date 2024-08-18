package stepdefs;


import base_test.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page_objects.HomePage;
import page_objects.LoginPage;

import java.io.IOException;

public class MyStepdefs extends BaseTest {
    @After
    public void after_method(){
        driver.quit();
    }

    HomePage homePage;
    LoginPage loginPage;
    public MyStepdefs() throws IOException {
        homePage=new HomePage(driver,properties);
        loginPage=new LoginPage(driver,properties);
    }

    @Given("Enter the user name details")
    public void enter_the_user_name_details() {
        loginPage.enter_user_name();
        
    }
    @Given("Enter the password details")
    public void enter_the_password_details() {
        loginPage.enter_password();
        
    }
    @When("Click the login button")
    public void click_the_login_button() {
        loginPage.click_login();
        
    }
    @Then("Verify the error message")
    public void verify_the_error_message() {
        Assert.assertEquals(homePage.verify_error(),"Sorry, your password was incorrect. Please double-check your password.");
        
    }


}
