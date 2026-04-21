package ParaBank.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("ParaBankFeatures")
@ConfigurationParameters({
        @ConfigurationParameter(key = "cucumber.glue", value = "ParaBank.TestRunner.ParaBankHooks, ParaBank.TestRunner.ParaBankStepDefin, ParaBank.TestRunner.ParaBankData, ParaBank.TestRunner.ParaBankLocators"),
        @ConfigurationParameter(key = "cucumber.tags", value = "@Smoke or @Regression"),
        @ConfigurationParameter(key = "cucumber.plugin", value = "pretty, junit:target/cucumber-results.xml, html:target/cucumber.html, json:target/cucumber.json, html:target/site/cucumber-pretty, com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"),
        @ConfigurationParameter(key = "cucumber.monochrome", value = "true")
})
public class ParaBank_TestRunner extends AbstractTestNGCucumberTests {
}