package qa.sdt.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.sdt.base.TestBase;

public class SampleTest extends TestBase{
	

	public SampleTest() throws IOException {
		super();
	}

	SampleTest st;
		
	@BeforeMethod
	public void init() throws IOException {
		st= new SampleTest();
		st.initilization();
	}
	
	@Test()
	public void sample() {

		System.out.println("Login sucessfully ");
	}
	
	
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
}
