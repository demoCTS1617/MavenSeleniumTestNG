package Steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"Steps"},
    monochrome = true,
    plugin = { "pretty", "html:target/HtmlReport/reports.html"})
public class TestRunner {

	
}
