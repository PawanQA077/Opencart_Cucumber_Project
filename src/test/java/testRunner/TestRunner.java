package testRunner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(

				        features= {".//Features//Login.feature"},
				       // features= {".//Features//LoginDDT.feature"},
					   // features= {".//Features//LoginDDTExcel.feature"},
					   // features="@target/rerun.txt",                   							// run only on failure
    				  // features= {".//Features//Login.feature", ".//Features//LoginDDT.feature"},	// If we want to run multiple feature in Feature Folder
									
				        glue="stepDefinitions",
				        
				        plugin= {
				        		"pretty", "html:reports/myreport.html", 
				        		"json:reports/myreport.json", 
				        		"rerun:target/rerun.txt",				// Mandtory to capture failures  &  failure steps available in target folder 
				        		},    									// with rerun.txt name
				        
				        dryRun=false,
				        monochrome=true,
				         tags = "@sanity"								  //Scenarios tagged with @sanity,
				        // tags = "@regression"				 		     //Scenarios tagged with @regression,
				        // tags = "@sanity and @regression"				 //Scenarios tagged with both @sanity and @regression
				        // tags = "@sanity or @regression"	 			 //Scenarios tagged with either @sanity or @regression
				        // tags = "@sanity and not @regression",		 //Scenarios tagged with @sanity but not tagged with @regression
					)

public class TestRunner {

}
