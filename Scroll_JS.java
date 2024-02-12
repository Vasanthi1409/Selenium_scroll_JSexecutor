package scroll_JSexecutor.com;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.*;


public class Scroll_JS { 

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		//Javascript Executor for mouse scroll actions
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");			//Scroll vertically down	1st val - horizontal scroll, 2nd val - vertical scroll
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,-1000)");			//Scroll vertically up
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	//Scroll to end of webpage
		
		WebElement scrolltotarget = driver.findElement(By.xpath("//h2[@class='titleText--22WAy']"));
		js.executeScript("arguments[0].scrollIntoView(true);", scrolltotarget);	//Scroll to the Target
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,0)");				//Scroll vertically to top of webpage
		

	}

}
