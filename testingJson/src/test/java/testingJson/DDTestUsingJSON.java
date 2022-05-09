package testingJson;
import static org.testng.Assert.assertEquals;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTestUsingJSON {
	
	public WebDriver driver =new ChromeDriver();

	@SuppressWarnings("deprecation")
	@BeforeClass
	void setup()
	{	
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@Test (dataProvider= "DataBase")
	void login(String data)
	{
		String users[]= data.split(",");
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.cssSelector("a.login")).click();  
		driver.findElement(By.id("email")).sendKeys(users[0]);
		driver.findElement(By.id("passwd")).sendKeys(users[1]);
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.className("logout")).click();
		
		String act_title=driver.getTitle();
		String exp_title="Login - My Store";
		assertEquals(act_title, exp_title);
		
	}

	@DataProvider(name= "DataBase")
	public String[] readJson() throws IOException, ParseException
	{
		JSONParser jsonParser=new JSONParser();
		FileReader reader =new FileReader(".\\jsonfiles\\Users.json");
		
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject userloginsJsonobj=(JSONObject) obj;
		JSONArray userloginsArray =(JSONArray) userloginsJsonobj.get("userlogins");
		
		String arr[]=new String[userloginsArray.size()];
		
		for(int i=0;i<userloginsArray.size();i++)
		{
			JSONObject users = (JSONObject) userloginsArray.get(i);
			String user= (String) users.get("username");
			String pwd= (String) users.get("password");
			
			arr[i] = user+" , "+pwd;
		}
		
		return arr;
	}
}














