package com.demoaut.newtours.Pages_RealizarReserva;

import java.util.ArrayList;
import java.util.List;

//import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class Extraccion_Datos_Excel_Reservar {

	 List<String> Password;
	 List<String> Username;
	 
public void seleccionar(String navegador) throws Exception {
		
		Fillo var = new Fillo();
	    Connection conexion =  var.getConnection("C:\\Users\\SBMEDADMIN\\Documents\\NewTours-Test-Automatization\\date\\Datos.xls");
	      
	    String consulta= "Select * from registrados";
	     
	     Recordset registro= conexion.executeQuery(consulta);
	     Username= new ArrayList<>();
	     Password= new ArrayList<>();
	     while(registro.next()){
	    	 System.out.println(registro.getField("UserName")+ "---" +registro.getField("Password"));
	    	 Username.add(registro.getField("Username"));
	    	 Password.add(registro.getField("Password"));
	     }
	     registro.close();
	 	 conexion.close();
	 	Ingresar_Navegador.navegando(Username, Password,navegador);
	}

}
