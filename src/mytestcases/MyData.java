package mytestcases;

import java.nio.channels.Selector;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyData {
	WebDriver driver = new ChromeDriver();
	String mywebsite ="https://www.automationteststore.com/";
	
	String Signup = "https://automationteststore.com/index.php?rt=account/create";
	String loginp ="https://automationteststore.com/index.php?rt=account/login";
	String logoutL = "https://automationteststore.com/index.php?rt=account/logout";
	String CartL = "https://automationteststore.com/index.php?rt=checkout/cart";
	
	Random rand = new Random();
	
	String [] FNames = {"ayham","Mohammad","Feras"};
	int RindexForTheFNames = rand.nextInt(FNames.length);
	String firstname = FNames[RindexForTheFNames];
	
	String[] LNames = {"Alshmali", "Feras", "Fares"};
	int RindexForTheLNames = rand.nextInt(LNames.length);
	String lastname = LNames[RindexForTheLNames];
	
	int randomnumberfortheemail = rand.nextInt(4582);
	String TheEmail = firstname+lastname+randomnumberfortheemail+"@gmail.com";
	
	String address1 = "address1";
	String City1 = "City1";
	
	int Rindexforthecountry = rand.nextInt(1,10);
	int Rindexforthestate = rand.nextInt(1,2);
	
	String ZIPCodde = "21212";
	String logname = firstname+randomnumberfortheemail;
	String password = "Ayham@2002";
	
	
	int Rindexforthecolor = rand.nextInt(0,2);
	
	
	
	
	public void BFTS() {
		driver.get(mywebsite);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}

}
