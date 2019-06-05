package org.automation.project.test;

import org.automation.project.common.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends AbstractBaseTest {
	
	@Autowired
    private RestClient restClient;
     
    @Test
    public void validateSpringBean() {
    	System.out.println("Test case name is: " + super.envData.getProperty("test.case.name"));
    	Assert.assertEquals(this.restClient.setServerURL("abc").getServerURL(), "abc");
    }
}
