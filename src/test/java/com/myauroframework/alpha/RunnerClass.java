package com.myauroframework.alpha;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = ".",
        plugin = {"json:target/cucumber.json"}
)

public class RunnerClass {
}
