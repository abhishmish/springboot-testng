package org.automation.project.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import io.restassured.RestAssured;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Configuration
@ComponentScan(basePackages = { "org.automation.project" })
public class BeanFactory{
	
	@Bean
	@Scope(value="prototype")
	public RestClient getRestClient() {
		return new RestClient();
	}
	
	@Bean
	@Scope(value="prototype")
	public Response getApiResponse() {
		return new RestAssuredResponseImpl();
	}
	
	@Bean
	@Scope(value="prototype")
	public RequestSpecification getRequest() {
		return RestAssured.given();
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceHolder() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}