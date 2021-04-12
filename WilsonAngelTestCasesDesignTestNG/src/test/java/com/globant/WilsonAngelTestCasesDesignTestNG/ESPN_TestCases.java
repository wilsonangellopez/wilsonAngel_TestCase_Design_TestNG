package com.globant.WilsonAngelTestCasesDesignTestNG;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class ESPN_TestCases {

	
	@Test(priority=2)
	public void initSession() {
		
		System.out.println("session inited");
	}
	
	@Test(priority=3)
	public void closeSession() {
		System.out.println("session Closed");
	}
	
	@Test(priority=4)
	public void disableUser() {
		System.out.println("User disabled");
	}
	
	@Test(priority=1)
	public void validAccount() {
		System.out.println("cuenta valida");
	}
	
	
	
	

}
