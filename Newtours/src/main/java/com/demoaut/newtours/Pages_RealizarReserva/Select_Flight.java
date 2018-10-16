package com.demoaut.newtours.Pages_RealizarReserva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

//import com.codoid.products.exception.FilloException;

public class Select_Flight {

	
	public static void select(WebDriver casemiro,String pasajero) throws Exception {
		Tomar_Video.videopantallazo();
		
		WebElement element = casemiro.findElement(By.xpath("//input[@name = 'reserveFlights' ]"));
		 ((RemoteWebDriver) casemiro).executeScript("arguments[0].scrollIntoView(true);", element); 
		
		Thread.sleep(200);
		Tomar_Video.videopantallazo();	
		casemiro.findElement(By.xpath("//input[@name = 'outFlight' and @value='Pangea Airlines$362$274$9:17']")).click();
		Thread.sleep(200);
		 casemiro.findElement(By.xpath("//input[@name = 'inFlight' and @value='Unified Airlines$633$303$18:44']")).click();
		 Thread.sleep(1000);
		 casemiro.findElement(By.xpath("//input[@name = 'reserveFlights' ]")).click();
		 Thread.sleep(50);
		 Tomar_Video.videopantallazo();
		 Summary1.datos_pasajeros(casemiro,pasajero);
		 
		 //casemiro.close();
	}
	
}
