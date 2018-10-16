package com.demoaut.newtours.Pages_RealizarReserva;

import java.util.List;

//import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Ingresar_comprador {

	public static void Ingresar_compradores(WebDriver casemiro,List<String> firstname, List<String> middle, List<String> lastname, List<String> address1, List<String> address, List<String> city, List<String> city1, List<String> state, List<String> state1, List<String> postalCode, List<String> postalCode1, List<String> country, List<String> country1, List<String> card, List<String> number) throws Exception {
		Tomar_Video.videopantallazo();
		Alert alerta;
		//ScreenRecorder screenRecorder = null;
		for (int j=0;j<firstname.size();j++) {
			
			Select drpCountry = new Select(casemiro.findElement(By.name("creditCard")));
			drpCountry.selectByValue(card.get(j));
			casemiro.findElement(By.name("creditnumber")).sendKeys(number.get(j));
			int mess;
			String mesess;
			 mess = (int) (Math.random() * 12) + 1;
			    mesess = Integer.toString(mess);
			    if (mess<10) {
			    	mesess="0"+mesess;
			    }
			    Tomar_Video.videopantallazo();
			Select drpfecha = new Select(casemiro.findElement(By.name("cc_exp_dt_mn")));
			 drpfecha.selectByVisibleText(mesess);
			 int year;
	        year = (int) (Math.random() * 2010) + 2000;
	        while (year > 2010 ){
	            year = (int) (Math.random() * 2010) + 2000;
	        }
		 String years = Integer.toString(year);
			System.out.print("este es el an:"+ years);
			
			Select drpyear = new Select(casemiro.findElement(By.name("cc_exp_dt_yr")));
		 if(years=="2003") {
			 
		 drpyear.selectByVisibleText(years);
		 //Thread.sleep(1000);
		 alerta = casemiro.switchTo().alert();
		 alerta.accept();
		 Thread.sleep(1000);}
		 else {
			 //Select drpyear = new Select(casemiro.findElement(By.name("cc_exp_dt_yr")));
			 drpyear.selectByVisibleText(years);
		 }
		 Tomar_Video.videopantallazo();
		 WebElement element = casemiro.findElement(By.xpath("//input[@name = 'buyFlights' ]"));
		 ((RemoteWebDriver) casemiro).executeScript("arguments[0].scrollIntoView(true);", element); 
		Thread.sleep(200);
		Tomar_Video.videopantallazo();
		 casemiro.findElement(By.name("cc_frst_name")).sendKeys(firstname.get(j));
			casemiro.findElement(By.name("cc_mid_name")).sendKeys(middle.get(j));
			casemiro.findElement(By.name("cc_last_name")).sendKeys(lastname.get(j));
		
			//casemiro.findElement(By.name("ticketLess")).click();
			
			//casemiro.findElement(By.tagName("Ticketless Travel")).click();
			//casemiro.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),MY_VALUE);
			
			String tick="//font[contains(text(),'Ticketless Travel')]/preceding-sibling::input";
			casemiro.findElement(By.xpath(tick)).click();
			casemiro.findElement(By.name("billAddress1")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),address.get(j));
			casemiro.findElement(By.name("billAddress2")).sendKeys(address.get(j));
			casemiro.findElement(By.name("billCity")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),city.get(j));
		   
			casemiro.findElement(By.name("billState")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),state.get(j));
			casemiro.findElement(By.name("billZip")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),postalCode.get(j));
			//casemiro.findElement(By.name("billCountry")).sendKeys(lastname.get(j));
		
			String mpais=country.get(j).toUpperCase();
			Select drpcountry = new Select(casemiro.findElement(By.name("billCountry")));
			 drpcountry.selectByVisibleText(mpais);
			
			 //cambiar nombre-casemiro.findElement(By.name("ticketLess")).click();
			
			 String same="//font[contains(text(),'Same as Billing Address')]/preceding-sibling::input";
				casemiro.findElement(By.xpath(same)).click();
			 
			 casemiro.findElement(By.name("delAddress1")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),address1.get(j));
				casemiro.findElement(By.name("delAddress2")).sendKeys(address.get(j));
				casemiro.findElement(By.name("delCity")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),city1.get(j));
			   
				casemiro.findElement(By.name("delState")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),state1.get(j));
				casemiro.findElement(By.name("delZip")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),postalCode1.get(j));
				//casemiro.findElement(By.name("billCountry")).sendKeys(lastname.get(j));
			
				String mpaiss=country1.get(j).toUpperCase();
				Select drpcountrys = new Select(casemiro.findElement(By.name("delCountry")));
				 drpcountrys.selectByVisibleText(mpaiss);
				 Thread.sleep(1000);
				 alerta = casemiro.switchTo().alert();
				 /*String print = alerta.getText();
				 System.out.println(print);*/
				 alerta.accept();
			     Thread.sleep(1000);
			     
		casemiro.findElement(By.name("buyFlights")).click();	
		}

	

		WebElement element = casemiro.findElement(By.xpath("//div[@class='footer']"));
		 ((RemoteWebDriver) casemiro).executeScript("arguments[0].scrollIntoView(true);", element); 
		Thread.sleep(1000);
		casemiro.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
		Thread.sleep(1000);
		casemiro.close();
		//Tomar_Video.stopRecording(screenRecorder);
	}
	
}
