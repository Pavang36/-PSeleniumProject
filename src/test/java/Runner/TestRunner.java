package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Feature",glue={"stepdefinition"},
monochrome = true,
plugin= {"html:C:\\Users\\pgedela\\eclipse-workspace\\NopCommerceAutomation\\Report\\Html_Report",
"json:C:\\Users\\pgedela\\eclipse-workspace\\NopCommerceAutomation\\Reports\\JsonReport\\cucumber.json",
"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
}
)


public class TestRunner {

}
