package com.project.test;

import org.testng.annotations.Test;

import com.project.page.LoginPage;

import generic.BaseTest;

public class ValidLogin extends BaseTest{
 @Test(priority=1,groups={"login","valid"})
 public void testValidLogin(){
	LoginPage l=new LoginPage(driver);
	l.setUserName("admin");
	l.setPassword("manager");
	l.clickLogin();
	}
}
