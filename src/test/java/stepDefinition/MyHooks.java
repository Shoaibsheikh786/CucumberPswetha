package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	 
	//Before
	
	
	@Before(order=2)
	public void setUp()
	{
		System.out.println("This is Setup code 111");
	}
	
	@Before(order=1)
	public void setUp2()
	{
		System.out.println("This is Setup code 222222");
	}
	
	
	@After
	public void tearDown()
	{
		System.out.println("Database connection closed 111");
	}
	@After
	public void tearDown2()
	{
		System.out.println("Database connection closed222");
	}
	
//	@BeforeStep()
//	public void beStep()
//	{
//		System.out.println("For EACH STEP");
//	}

}
