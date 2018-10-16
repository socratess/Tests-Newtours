package com.demoaut.newtours.Pages_IniciarSesion;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


/** En esta clase se extraen los datos tales como : username y password 
 * que contiene el excel en la hoja login, 
 * dichos datos usaremos para probar el login de la pagina newtours.
 * @author Socrates
 *
 */
public class Extraccion_Datos_Excel_IniciarSesion {

	 List<String> Password;
	 List<String> Username;
	/**
	 * Metodo el cual recibe un navegador de tipo string el cual no usaremos en este metodo
	 * pero es necesario para las otras clases que usaran el metodo.
	 * Ademas este metodo es donde se realiza la consulta  a la base de datos, en este caso
	 * es un excel de nombre Datos con extensión xls, cuando se obtienen los datos,
	 * se pasan por parametros a otro metodo de otra clase. 
	 * @param navegador - variable tipo String que contiene el nombre del navegador a usar, 
	 * ya sea Chrome,Firefox ó Internet Explore. 
	 * @throws FilloExceptionexcepción- para poder usar todas las herramientas de fillo
     * que nos permite usar sql
	 */
public void tomar(String navegador) throws FilloException {
		
		Fillo var = new Fillo();
	    Connection conexion =  var.getConnection("C:\\Users\\SBMEDADMIN\\Documents\\Tests-Newtours\\date\\Datos.xls");
	      
	    String consulta= "Select * from login";
	     
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
	 	Ingresando_Navegadores.navegando(Username, Password,navegador);
	}
}
