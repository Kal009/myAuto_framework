package com.myauroframework.alpha.testpages;

import com.myauroframework.alpha.base.BrowserFectory;
import com.myauroframework.alpha.pages.HomePage;
import com.myauroframework.alpha.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageTest extends BrowserFectory {

    HomePage hp = new HomePage();
    LoginPage lp = new LoginPage();


    @Given("^i am on home page$")
    public void iAmOnHomePage() throws Throwable {
        hp.varifyhomepage();

    }

    @When("^i click on sing in$")
    public void iClickOnSingIn() throws Throwable {
        hp.signButton();

    }

    @Then("^i should navigate to login page$")
    public void iShouldNavigateToLoginPage() throws Throwable {
        //driver.findElement(By.linkText("Register now")).click();
        String actual = hp.homepagetital();
        Assert.assertEquals(actual, "BBC – Sign in");

    }


}


