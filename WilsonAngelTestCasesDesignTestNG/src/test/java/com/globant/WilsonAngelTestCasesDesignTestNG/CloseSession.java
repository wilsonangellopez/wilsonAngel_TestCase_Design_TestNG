package com.globant.WilsonAngelTestCasesDesignTestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CloseSession {
	
	@Test()
	public void closeSession() {
		System.out.println("session Closed");
	}
	@BeforeTest()
	public void validAccount() {
		System.out.println("La cuenta es valida");
	}


}
