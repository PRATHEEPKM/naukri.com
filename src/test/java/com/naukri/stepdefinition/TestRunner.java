package com.naukri.stepdefinition;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feachers",
                    glue  =  "com.naukri.stepdefinition",
                    plugin = "html:target",
                      dryRun = false)
public class TestRunner {

}
