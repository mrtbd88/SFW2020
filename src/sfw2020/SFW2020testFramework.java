package sfw2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFW2020testFramework {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dsebd.org/");
		driver.manage().window().maximize();
			}

}
