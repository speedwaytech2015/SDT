package qa.sdt.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.sdt.base.TestBase;
import qa.sdt.pages.LogPage;

public class LoginPageTest extends TestBase {


	LogPage loginPage;
	
	@BeforeMethod
	public void setUp() 
	
	{
		initialization();
		loginPage = new LogPage();		
	}
	
	
	@Test
	public void validateLoginTest()  {
	
		loginPage.login();
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
	
	
	
	
		
	

}
