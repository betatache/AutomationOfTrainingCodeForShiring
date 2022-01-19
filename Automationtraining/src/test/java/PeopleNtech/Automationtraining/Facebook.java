package PeopleNtech.Automationtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) 
    {
        ChromeDriver fd=new ChromeDriver();
        fd.get("http:www.facebook.com");
        List<WebElement> links=fd.findElements(By.tagName("a"));
        System.out.println("no of links:" +links.size());

        for(int i=0;i<links.size();i++)
        {
            if(!(links.get(i).getText().isEmpty()))
            {
            links.get(i).click();
            fd.navigate().back();
            links=fd.findElements(By.tagName("a"));
            }       
        }
   }
}
