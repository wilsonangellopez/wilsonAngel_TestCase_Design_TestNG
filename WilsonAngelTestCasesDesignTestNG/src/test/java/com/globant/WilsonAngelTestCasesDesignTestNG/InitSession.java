package com.globant.WilsonAngelTestCasesDesignTestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InitSession {
	
	@Test()
	public void initSession() {		
		System.out.println("session inited");
	}
	
	@BeforeTest()
	public void validAccount() {
		System.out.println("La cuenta es valida");
	}
	


}
