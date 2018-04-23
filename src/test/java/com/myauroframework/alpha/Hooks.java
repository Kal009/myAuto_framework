package com.myauroframework.alpha;

import com.myauroframework.alpha.base.BrowserFectory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private BrowserFectory browser_fectory;

    public Hooks(BrowserFectory browserFectory) {
        this.browser_fectory = browserFectory;
    }


    @Before
    public void startBrowser() {
        browser_fectory.openBrowser();
        browser_fectory.maximisize();
        browser_fectory.pageload();
        browser_fectory.timeout();

    }

    @After
    public void teardown() {
        browser_fectory.closeBrowser();

    }
}
