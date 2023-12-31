package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue="stepDefinitions",
tags="@selTest"
//stepNotifications=true,
//plugin= {"html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml","pretty"},monochrome=true
//dryRun=false

)
public class TestRunner {

}
