package com.AmazonRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginAmaon.feature",
           glue= {"com.AmazonStepDefination"}, 
            plugin= {"pretty",
        		   "json:target/MyReports/report.json",
        		   "junit:target/MyReports/report.xml"
        		   }
           
          )

public class Amazon_Runner {

}
