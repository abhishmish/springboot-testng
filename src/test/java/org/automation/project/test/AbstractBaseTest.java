package org.automation.project.test;

import org.automation.project.common.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;

@ContextConfiguration(classes= BeanFactory.class)
@PropertySource("classpath:application.properties")
@EnableConfigurationProperties
public class AbstractBaseTest extends AbstractTestNGSpringContextTests {
	
	@Autowired
	public Environment envData;
    
	@BeforeClass(dependsOnMethods={"springTestContextPrepareTestInstance"})
	public void setup(){ 
		System.out.println("Test suite name-------------" + this.envData.getProperty("test.suite.name"));
	}
}
