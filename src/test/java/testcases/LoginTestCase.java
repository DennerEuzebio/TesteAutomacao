package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.BaseTest;
import tasks.LoginTask;

public class LoginTestCase extends BaseTest {

	private WebDriver driver = getDriver();

	private LoginTask loginTask = new LoginTask(driver);

	@Test
	public void test() {
		loginTask.logar();
	}

}
