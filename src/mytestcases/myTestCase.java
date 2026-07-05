package mytestcases;

import java.nio.channels.Selector;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class myTestCase extends MyData {

	@BeforeTest
	public void BFT() {
		BFTS();
	}

	@Test(priority = 0)
	public void FTSignUp() throws InterruptedException {
		driver.navigate().to(Signup);

		// Elements
		WebElement FName = driver.findElement(By.xpath("//input[@id='AccountFrm_firstname']"));
		WebElement LName = driver.findElement(By.xpath("//input[@id='AccountFrm_lastname']"));
		WebElement Email = driver.findElement(By.xpath("//input[@id='AccountFrm_email']"));
		WebElement Add1 = driver.findElement(By.xpath("//input[@id='AccountFrm_address_1']"));
		WebElement City = driver.findElement(By.xpath("//input[@id='AccountFrm_city']"));
		WebElement State = driver.findElement(By.xpath("//select[@id='AccountFrm_zone_id']"));
		WebElement ZIPCode = driver.findElement(By.xpath("//input[@id='AccountFrm_postcode']"));
		WebElement Country = driver.findElement(By.xpath("//select[@id='AccountFrm_country_id']"));
		WebElement LoginName = driver.findElement(By.xpath("//input[@id='AccountFrm_loginname']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='AccountFrm_password']"));
		WebElement PasswordC = driver.findElement(By.xpath("//input[@id='AccountFrm_confirm']"));
		WebElement Accept = driver.findElement(By.xpath("//input[@id='AccountFrm_agree']"));
		WebElement Continue = driver.findElement(By.cssSelector(".btn.btn-orange.pull-right.lock-on-click"));

		// Actions
		FName.sendKeys(firstname);
		LName.sendKeys(lastname);
		Email.sendKeys(TheEmail);
		Add1.sendKeys(address1);
		City.sendKeys(City1);

		Select Stateselector = new Select(State);
		Select Countryselector = new Select(Country);

		Countryselector.selectByIndex(Rindexforthecountry);
		Thread.sleep(2000);
		Stateselector.selectByIndex(Rindexforthestate);

		ZIPCode.sendKeys(ZIPCodde);
		LoginName.sendKeys(logname);
		Password.sendKeys(password);
		PasswordC.sendKeys(password);

		Accept.click();
		Continue.click();
		Thread.sleep(2000);

		String Url = driver.getCurrentUrl();
		Assert.assertEquals(Url.contains("success"), true);

	}

	@Test(priority = 1)

	public void logout() {
		driver.navigate().to(logoutL);

		String Url = driver.getCurrentUrl();
		Assert.assertEquals(Url.contains("logout"), true);

	}

	@Test(priority = 2)
	public void login() {
		driver.navigate().to(loginp);

		WebElement LoginN = driver.findElement(By.id("loginFrm_loginname"));
		WebElement Pass = driver.findElement(By.id("loginFrm_password"));
		WebElement Plogin = driver.findElement(By.xpath("//button[@title='Login']"));

		LoginN.sendKeys(logname);
		Pass.sendKeys(password);
		Plogin.click();

		String Url = driver.getCurrentUrl();
		Assert.assertEquals(Url.contains("account/account"), true);

	}

	@Test(priority = 3)
	public void AddAllItems() throws InterruptedException {
		driver.navigate().to(mywebsite);

		// AllItems.get(i).click();

		List<WebElement> AllItems = driver.findElements(By.className("prdocutname"));

		for (int i = 0; i < AllItems.size(); i++) {
			AllItems = driver.findElements(By.className("prdocutname"));
			AllItems.get(i).click();

			String Url = driver.getCurrentUrl();

			if (Url.contains("product_id=50")) {

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);
			} else if (Url.contains("product_id=51")) {

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);

			} else if (Url.contains("product_id=52")) {

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);

			} else if (Url.contains("product_id=53")) {

				WebElement color = driver.findElement(By.xpath("//select[@id='option318']"));

				Select colorselector = new Select(color);

				colorselector.selectByIndex(Rindexforthecolor);

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);

			} else if (Url.contains("product_id=68")) {

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);

			} else if (Url.contains("product_id=65")) {

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);

			} else if (Url.contains("product_id=66")) {

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);

			} else if (Url.contains("product_id=67")) {

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);

			} else if (Url.contains("product_id=116")) {

				WebElement TheDivOfTheRadioButton = driver.findElement(By.xpath("//div[@class='form-group']"));

				List<WebElement> MyRadioButtonList = TheDivOfTheRadioButton.findElements(By.tagName("input"));

				int Totalinputs = MyRadioButtonList.size() - 1;

				int myRadioItems = rand.nextInt(Totalinputs);

				MyRadioButtonList.get(myRadioItems).click();

				WebElement MySelectColor = driver.findElement(By.xpath("//select[@id='option345']"));

				Select mySelector = new Select(MySelectColor);

				mySelector.selectByIndex(1);

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);
			} else if (Url.contains("product_id=118")) {

				WebElement TheDivOfTheRadioButton = driver
						.findElement(By.xpath("//form[@id='product']//div[@class='form-group']"));
				List<WebElement> MyRadioButtonList = TheDivOfTheRadioButton.findElements(By.tagName("input"));
				int Totalinputs = MyRadioButtonList.size();

				int myRadioItems = rand.nextInt(Totalinputs);

				MyRadioButtonList.get(myRadioItems).click();

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);
			} else if (Url.contains("product_id=80")) {

				WebElement MySelectColor = driver.findElement(By.xpath("//select[@id='option321']"));

				Select mySelector = new Select(MySelectColor);

				int myrandomindex = rand.nextInt(0, 3);
				mySelector.selectByIndex(myrandomindex);

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);
				driver.navigate().to(mywebsite);
			} else if (Url.contains("product_id=72")) {

				WebElement AddToCart = driver.findElement(By.xpath("//a[@class='cart']"));

				AddToCart.click();
				Thread.sleep(1000);

			}

		}
		String Url = driver.getCurrentUrl();
		Assert.assertEquals(Url.contains("rt=checkout/cart"), true);

	}

	@Test(priority = 4)
	public void PrintCartItemsNames() {

		WebElement TheTable = driver.findElement(By.xpath("//table[@class='table table-striped table-bordered']"));
		List<WebElement> AllTableTDs = TheTable.findElements(By.tagName("td"));

		for (int i = 1; i < AllTableTDs.size(); i = i + 7) {

			System.out.println(AllTableTDs.get(i).getText());
		}
		Assert.assertEquals(driver.getPageSource().contains("Shopping Cart"), true);
	}

}
