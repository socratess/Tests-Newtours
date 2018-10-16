package com.demoaut.newtours.Pages_RealizarReserva;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.codoid.products.exception.FilloException;

public class Navegar_FireFox {
static File directory = new File ("C:\\Users\\SBMEDADMIN\\Documents\\Tests-Newtours\\pantallachrome");
	
	public static void navegar_FireFox(String UserName, String PassWord, int i) throws Exception  {
		// int sin= i*10;
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver\\geckodriver-v0.22.0-win32\\geckodriver.exe");
		WebDriver casemiro =  new FirefoxDriver();

			
			casemiro.get("http://newtours.demoaut.com/");
			casemiro.manage().window().maximize();
			//int in= sin;
			//int isn=sin+1;
			//i//nt issn= sin+2;
			//int isssn=sin+3;
			//fotografia.pantallazos(casemiro,in,directory);
			casemiro.findElement(By.name("userName")).sendKeys(UserName);
			//fotografia.pantallazos(casemiro,isn,directory);	
			casemiro.findElement(By.name("password")).sendKeys(PassWord);
			//fotografia.pantallazos(casemiro,issn,directory);
			casemiro.findElement(By.name("login")).click();
			//fotografia.pantallazos(casemiro,isssn,directory);
			casemiro.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			Flight_Finder.flight(casemiro); 
			//	casemiro.close();
			
			
}
}
