package com.demoaut.newtours.Pages_RealizarReserva;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

//import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Summary1 {

	public static void datos_pasajeros(WebDriver casemiro,String pasajero) throws Exception {
		Tomar_Video.videopantallazo();
		 List<String> firstname;
		 List<String> lastname;
		 List<String> meal; 
		 
			Fillo var = new Fillo();
		    Connection conexion =  var.getConnection("C:\\date\\Datos.xls");
		      
		    String consulta= "Select * from pasajeros";
		     
		     Recordset registro= conexion.executeQuery(consulta);
		     firstname= new ArrayList<>();
		     lastname= new ArrayList<>();
		     meal=new ArrayList<>();
		     while(registro.next()){
		    	// System.out.println(registro.getField("UserName")+ "---" +registro.getField("Password"));
		    	 firstname.add(registro.getField("FirstName"));
		    	 lastname.add(registro.getField("LastName"));
		    	 meal.add(registro.getField("Meal"));
		     }
		     registro.close();
		 	 conexion.close();
		 	 Ingresar_Pasajeros.Pasajero(casemiro,firstname, lastname,meal,pasajero);
		}

		
	}
	

