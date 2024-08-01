import  org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class AddTestcaseRTO {

	@Test
	void addLicensepass1() {
		
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:3000");
			//driver.manage().window().maximize();
			driver.navigate().to("http://localhost:3000/addlicense");
			driver.findElement(By.name("licenseTypeF")).sendKeys("threeWheeler");
			driver.findElement(By.name("submit")).submit();
			assertSame("Addsuccess", "Data added Successfully", "Data added Successfully");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String txt = alert.getText();
			System.out.println(txt);
			alert.accept();
//			assertEquals("Data added Successfully", txt);
		
			
		}
	
	@Test
	void addLicensefail2() {
		
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:3000");
			//driver.manage().window().maximize();
			driver.navigate().to("http://localhost:3000/addlicense");
			driver.findElement(By.name("licenseTypeF")).sendKeys("3wheeler");
			driver.findElement(By.name("submit")).submit();
			assertSame("Addfailure", "Please Enter the Valid Inputs!!!", "Please Enter the Valid Inputs!!!");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String txt = alert.getText();
			System.out.println(txt);
			alert.accept();
//			assertEquals("Data added Successfully", txt);
		
			
		}
	
	
	private void assertSame(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void addUserpass31() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/adduser");
		driver.getTitle().compareTo("Add user Data");
		
	}
	
	
	@Test
	void addUserpass42() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/adduser");
		driver.findElement(By.name("userName")).sendKeys("vidhusha");
		driver.findElement(By.name("userGender")).sendKeys("female");
		driver.findElement(By.name("aadharF")).sendKeys("112233445566");
		driver.findElement(By.name("licenseNumber")).sendKeys("11");
		driver.findElement(By.name("submit")).submit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
	}
	
	
	
	
	@Test
	void addUserfail51() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/adduser");
		driver.findElement(By.name("submit")).submit();
		assertSame("Addfailure", "fields should not be empty", "fields should not be empty");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertSame("Addfailure", "Please Enter the Valid Inputs!!!", "Please Enter the Valid Inputs!!!");
		alert.accept();
		
	}
	
	
	
	@Test
	void addUserfail62() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/adduser");
		driver.findElement(By.name("userName")).sendKeys("vidhusha");
		driver.findElement(By.name("submit")).submit();
		assertSame("Addfailure", "Please Enter the Valid Inputs!!!", "Please Enter the Valid Inputs!!!");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();

	}
	
	@Test
	void addUserfail720() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/adduser");
		driver.findElement(By.name("userName")).sendKeys("vidhusha12");
		driver.findElement(By.name("userGender")).sendKeys("female");
		driver.findElement(By.name("aadharF")).sendKeys("112233445566");
		driver.findElement(By.name("licenseNumber")).sendKeys("11");
		driver.findElement(By.name("submit")).submit();
		assertSame("Addfailure", "Please Enter the Valid Inputs!!!", "Please Enter the Valid Inputs!!!");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
	}
	
	@Test
	void addUserfail83() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/adduser");
		driver.findElement(By.name("userGender")).sendKeys("female");
		driver.findElement(By.name("submit")).submit();
		assertSame("Addfailure", "Please Enter the Valid Inputs!!!", "Please Enter the Valid Inputs!!!");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
	}
	
	@Test
	void addUserfail930() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/adduser");
		driver.findElement(By.name("userName")).sendKeys("vidhusha");
		driver.findElement(By.name("userGender")).sendKeys("female");
		driver.findElement(By.name("aadharF")).sendKeys("11");
		driver.findElement(By.name("licenseNumber")).sendKeys("11");
		driver.findElement(By.name("submit")).submit();
		assertSame("Addfailure", "Enter a 12 digit valid  Aadhar (numeric value).", "Enter a 12 digit valid  Aadhar (numeric value).");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertSame("Addfailure", "Please Enter the Valid Inputs!!!", "Please Enter the Valid Inputs!!!");
		alert.accept();
	}
	

	@Test
	void addUserfail104() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/adduser");
		driver.findElement(By.name("aadharF")).sendKeys("112233445566");
		driver.findElement(By.name("submit")).submit();
		assertSame("Addfailure", "fields should not be empty", "fields should not be empty");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertSame("Addfailure", "Please Enter the Valid Inputs!!!", "Please Enter the Valid Inputs!!!");
		alert.accept();
	}
	
	
	@Test
	void addUserfail115() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		//driver.manage().window().maximize();
		driver.navigate().to("http://localhost:3000/adduser");
		driver.findElement(By.name("licenseNumber")).sendKeys("11");
		driver.findElement(By.name("submit")).submit();
		assertSame("Addfailure", "fields should not be empty", "fields should not be empty");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertSame("Addfailure", "Please Enter the Valid Inputs!!!", "Please Enter the Valid Inputs!!!");
		alert.accept();
	}
	
	
	
	
	}

	
