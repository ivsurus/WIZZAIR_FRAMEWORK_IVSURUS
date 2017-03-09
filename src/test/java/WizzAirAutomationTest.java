/*
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.epam.steps.Steps;

public class WizzAirAutomationTest

{

	private Steps steps;
	private final String EMAIL = "ivsurus@gmail.com";
	private final String USERNAME = "\"Ivan\" \"Surus\""; // "Ivan Surus";
	private final String PASSWORD = "W+8nb5C=";

	@BeforeMethod(description = "Init browser")
	public void setUp()
	{
		steps = new Steps();
		steps.initBrowser();
	}

	@Test(description = "Login to WizzAir")
	public void oneCanLoginWizzAir()
	{
		steps.loginWizzAir(EMAIL, PASSWORD);
		Assert.assertTrue(steps.isLoggedIn(USERNAME));
	}

	@AfterMethod(description = "Stop Browser")
	public void stopBrowser()
	{
		steps.closeDriver();
	}

}
*/
