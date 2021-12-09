package com.retail.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",
				 tags="@LoginUser",
				 monochrome=true,
				 dryRun=false,
				 glue="com.retail.stepdefinition",
				 plugin= {"html:target/cucumber-report/",
						 "json:target/cucumber.json",
						 "pretty:target/cucumber-pretty.txt",
						 "junit:target/cucumber-results.xml"
				 }
)

public class TestRunner {
	
}

