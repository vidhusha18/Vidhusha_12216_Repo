import  org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class findDeleteTestCases {

	private WebDriver driver;

	@BeforeAll
	void setUp() {
		driver = new ChromeDriver();
	}

	@AfterAll
	void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@BeforeEach
	void goToHomePage() {
		driver.get("http://localhost:3000/");
	}
	
	
	@Test
	void testHome(){
		driver.getTitle().compareTo("Online RTO Office Management System");
	}
	
	@Test
	void testHomeNav1(){
		driver.findElement(By.className("nav-link"));
		assertSame("HOME","HOME");
		
	}
	
	

	@Test
	void testHomeNav2(){
		driver.findElement(By.className("nav-link"));
		assertSame("Add user","Add user");
		
	}
	

	@Test
	void testHomeNav3(){
		driver.findElement(By.className("nav-link"));
		assertSame("Add license","Add license");
		
	}
	
	
	@Test
	void testHomeNav4(){
		driver.findElement(By.className("nav-link"));
		assertSame("View User","View User");
		
	}
	

	@Test
	void testHomeNav5(){
		driver.findElement(By.className("nav-link"));
		assertSame("View license","View license");
		
	}

	@Test
	void testHomeNav6(){
		driver.findElement(By.className("nav-link"));
		assertSame("Find license","Find license");
		
	}
	
	

	@Test
	void testfindlicSuccess() {
	
		driver.navigate().to("http://localhost:3000/findlicense");
		driver.getTitle().compareTo("Search license");
	}
	
	@Test
	void testfindlicSucess() {

		driver.manage().window().maximize();
		driver.navigate().to("http:localhost:3000/findlicense");
		WebElement searchInput = driver.findElement(By.id("search"));
		searchInput.sendKeys("1");
		WebElement searchButton = driver.findElement(By.id("button"));
		searchButton.click();
		assertEquals("license Id", "license Id");

	}
	
	
	@Test
	void testfindlicSucess1(){


		driver.manage().window().maximize();
		driver.navigate().to("http:localhost:3000/findlicense");
        WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("1");
        WebElement searchButton = driver.findElement(By.id("button"));
        searchButton.click();

  
        assertEquals("license Name","license Name");
        

        
        
    }
	
	
	@Test
	void testfindlicpass(){


		driver.manage().window().maximize();
		
		driver.navigate().to("http:localhost:3000/findlicense");
		WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("23");
       
        WebElement searchButton = driver.findElement(By.id("button"));
        searchButton.click();
        assertSame("record has deleted","record has deleted");

        
        
   }
	
	
	@Test
	void testfindlicFail(){


		driver.manage().window().maximize();
		
		driver.navigate().to("http:localhost:3000/findlicense");
		WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("101");
       
        WebElement searchButton = driver.findElement(By.id("button"));
        searchButton.click();
        assertSame("Record not found","Record not found");

        
        
   }
	
	@Test
	  public void testLlicDelete() {
		driver.findElement(By.linkText("View license")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(3) .ms-1")).click();
	    Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
	    assertEquals("Do you want to delete", txt);
		alert.accept();
	    
		
		
		
	}
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////
	
	@Test
	void testfindUserSuccess() {
	
		driver.navigate().to("http://localhost:3000/finduser");
		driver.getTitle().compareTo("Search user");
	}
	
	
	
	
	
	@Test
	  public void testUserDelete() {
		driver.findElement(By.linkText("View license")).click();
	    driver.findElement(By.cssSelector("tr:nth-child(3) .ms-1")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println(txt);
		alert.accept();
		assertEquals("Do you want to delete", txt);
		
	}
	
	
	
	@Test
	void testfindUserpass0(){


		driver.manage().window().maximize();
		
		driver.navigate().to("http:localhost:3000/finduser");
		WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("3");
       
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
        assertEquals("user Id","user Id");
       
   }
	
	
	@Test
	void testfindUserpass1(){


		driver.manage().window().maximize();
		
		driver.navigate().to("http:localhost:3000/finduser");
		WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("3");
       
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
        assertEquals("user Name","user Name");
       
   }
	
	@Test
	void testfindUserpass2(){


		driver.manage().window().maximize();
		
		driver.navigate().to("http:localhost:3000/finduser");
		WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("3");
       
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
        assertEquals("user Gender","user Gender");
       
   }
	
	
	@Test
	void testfindUserpass3(){


		driver.manage().window().maximize();
		
		driver.navigate().to("http:localhost:3000/finduser");
		WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("3");
       
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
        assertEquals("user Aadhar","user Aadhar");
       
   }
	
	@Test
	void testfindUserFail(){


		driver.manage().window().maximize();
		
		driver.navigate().to("http:localhost:3000/finduser");
		WebElement searchInput = driver.findElement(By.id("search"));
        searchInput.sendKeys("101");
       
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
        assertSame("Record not found","Record not found");

        
        
   }
	
	
	
	@Test
	void testviewUser(){

		
		driver.navigate().to("http:localhost:3000/viewusers");
		assertEquals("user Name","user Name");
		assertEquals("user Gender","user Gender");
		assertEquals("user Aadhar","user Aadhar");
		assertEquals("license Number","license Number");
		assertEquals("Action","Action");
  
   }
	
	@Test
	void testviewUser1(){


//		driver.manage().window().maximize();
		
		driver.navigate().to("http:localhost:3000/viewusers");
		driver.getTitle().compareTo("All USERS PAGE");
		

        
        
   }
	
	
	
	
}
