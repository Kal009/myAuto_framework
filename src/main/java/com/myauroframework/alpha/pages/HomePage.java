package com.myauroframework.alpha.pages;

import com.myauroframework.alpha.base.BrowserFectory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BrowserFectory {
    @FindBy(linkText = "Homepage")
    WebElement homepagelink;

    @FindBy(linkText = "Sign in")
    WebElement signlink;





    public void varifyhomepage() {
        homepagelink.click();
    }

    public void signButton (){
        signlink.click();
    }

    public String  homepagetital(){
       return driver.getTitle();
    }
}



