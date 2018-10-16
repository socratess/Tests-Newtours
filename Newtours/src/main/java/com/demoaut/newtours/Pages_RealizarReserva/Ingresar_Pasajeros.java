package com.demoaut.newtours.Pages_RealizarReserva;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

//import com.codoid.products.exception.FilloException;

public class Ingresar_Pasajeros {

	public static void Pasajero(WebDriver casemiro,List<String> firstname,List<String> lastname,List<String> meal,String pasajero) throws Exception{
		Tomar_Video.videopantallazo();
		int pasajers = Integer.parseInt(pasajero);
		String name="passFirst";
		String last="passLast";
	    String part1="pass.";
		String part2=".meal";
		for (int i=0;i<pasajers;i++) {
			String fullname=name+i;
			String fulllast=last+i;
			String fullmeal=part1+i+part2;		
			casemiro.findElement(By.name(fullname)).sendKeys(firstname.get(i));
			casemiro.findElement(By.name(fulllast)).sendKeys(lastname.get(i));
			Select drpCountry = new Select(casemiro.findElement(By.name(fullmeal)));
			 drpCountry.selectByValue(meal.get(i));
			
			
		}
	
		Summary2.datos_comprador(casemiro);
	}
	
}
