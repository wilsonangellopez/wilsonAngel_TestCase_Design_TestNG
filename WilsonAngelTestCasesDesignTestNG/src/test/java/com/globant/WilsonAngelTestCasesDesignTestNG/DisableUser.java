package com.globant.WilsonAngelTestCasesDesignTestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DisableUser {
	
	@Test()
	public void disableUser() {
		System.out.println("User disabled");
	}
	@BeforeTest()
	public void validAccount() {
		System.out.println("La cuenta es valida");
	}


}
