package com.demoaut.newtours.Pages_RealizarReserva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

//import com.codoid.products.exception.FilloException;

public class Flight_Finder {

	public static void flight(WebDriver casemiro) throws Exception {
		Tomar_Video.videopantallazo();
		Thread.sleep(200);
	casemiro.findElement(By.xpath(".//*[@value='oneway']")).click();
	Tomar_Video.videopantallazo();
    int pasajeros = (int) (Math.random() * 3) + 1;
    String pasajero = Integer.toString( pasajeros);
    Select drpCountrys = new Select(casemiro.findElement(By.xpath("//select[@name='passCount']")));
	 drpCountrys.selectByValue(pasajero); 
	 Tomar_Video.videopantallazo();
     Select drpCountryss = new Select(casemiro.findElement(By.xpath("//select[@name='fromPort']")));
	 drpCountryss.selectByValue("London");
	 Tomar_Video.videopantallazo();
	 int meses = (int) (Math.random() * 12) + 1;
    String mes = Integer.toString( meses);
	 Select drpCountrysss = new Select(casemiro.findElement(By.xpath("//select[@name='fromMonth']")));
	 drpCountrysss.selectByValue(mes);
	 
	 int dia_ida= (int) (Math.random() * 31) + 1;
	 String ida = Integer.toString( dia_ida);
	 Select drpCountryssse = new Select(casemiro.findElement(By.xpath("//select[@name='fromDay']")));
	 drpCountryssse.selectByValue(ida);
	 Tomar_Video.videopantallazo();
	 Select drpCountrysssee = new Select(casemiro.findElement(By.xpath("//select[@name='toPort']")));
	 drpCountrysssee.selectByValue("Portland");
	 
	 int mesess = (int) (Math.random() * 12) + 1;
	    String mess = Integer.toString( mesess);
	 Select drpCountryssseex = new Select(casemiro.findElement(By.xpath("//select[@name='toMonth']")));
	 drpCountryssseex.selectByValue(mess);
	 
	 
	 int dia_vuelta=(int) (Math.random() * 31) + 1;
	 String vuelta = Integer.toString( dia_vuelta);
	 Select drpCountryssseecx = new Select(casemiro.findElement(By.xpath("//select[@name='toDay']")));
	 drpCountryssseecx.selectByValue(vuelta);
	 
	 Tomar_Video.videopantallazo();
	 casemiro.findElement(By.xpath(".//*[@value='First']")).click();
	 
	 Select drpCountryssseecxy = new Select(casemiro.findElement(By.xpath("//select[@name='airline']")));
	 drpCountryssseecxy.selectByVisibleText("Blue Skies Airlines");
	 Thread.sleep(200);
	 casemiro.findElement(By.xpath("//input[@name = 'findFlights' ]")).click();
	 
	 Select_Flight.select(casemiro,pasajero);
	}
	
}
