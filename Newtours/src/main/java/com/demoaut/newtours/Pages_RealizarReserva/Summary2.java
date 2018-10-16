package com.demoaut.newtours.Pages_RealizarReserva;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

//import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class Summary2 {

	public static void datos_comprador(WebDriver casemiro) throws Exception {
		Tomar_Video.videopantallazo();
		Fillo varss = new Fillo();
	    Connection conexionss =  varss.getConnection("C:\\date\\Datos.xls");
	      
	    String consultass= "Select * from comprador";
	     
	     Recordset registross= conexionss.executeQuery(consultass);
	     List<String> firstname=new ArrayList<>();
	     List<String> middle=new ArrayList<>();
	     List<String> lastname=new ArrayList<>();
	     List<String> Address1=new ArrayList<>();
	     List<String> Address=new ArrayList<>();
	     List<String> City=new ArrayList<>();
	     List<String> City1=new ArrayList<>();
	     List<String> State=new ArrayList<>();
	     List<String> State1=new ArrayList<>();
	     List<String> PostalCode=new ArrayList<>();
	     List<String> PostalCode1=new ArrayList<>();
	     List<String> Country=new ArrayList<>();
	     List<String> Country1=new ArrayList<>();
	     List<String> card=new ArrayList<>();
	     List<String> number=new ArrayList<>();
	  	     
	     while(registross.next()){
	    	 System.out.println("56");
	    	 firstname.add(registross.getField("FirstName2"));
		     middle.add(registross.getField("middle"));
		     lastname.add(registross.getField("last"));
		     Address.add(registross.getField("address2"));
		     City.add(registross.getField("city2"));
		     State.add(registross.getField("state2"));
		     PostalCode.add(registross.getField("poscode"));
		     Country.add(registross.getField("pais"));
             Address1.add(registross.getField("address3"));
		     City1.add(registross.getField("city3"));
		     State1.add(registross.getField("state3"));
		     PostalCode1.add(registross.getField("poscode2"));
		     Country1.add(registross.getField("pais2"));
		     card.add(registross.getField("CardType"));
		     number.add(registross.getField("Number"));
	     }
	     System.out.println(number);
	     registross.close();
	     conexionss.close();
	     Ingresar_comprador.Ingresar_compradores(casemiro, firstname,middle,lastname,Address1,Address,
	     City,City1,State,State1, PostalCode, PostalCode1, Country, Country1, card, number);
	

		
		
	}
	
}
