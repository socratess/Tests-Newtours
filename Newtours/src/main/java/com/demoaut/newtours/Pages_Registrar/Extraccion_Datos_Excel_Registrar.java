package com.demoaut.newtours.Pages_Registrar;

import java.util.ArrayList;
import java.util.List;



import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


/**En esta clase se extraen los datos tales como :FirstName,LastName,Phone,
 * Email,Address,City,State,PostalCode,Country,UserName,Password
 * que contiene el excel en la hoja registrar, 
 * dichos datos usaremos para probar el registrar de la pagina newtours.
 * @author Socrates
 *
 */
public class Extraccion_Datos_Excel_Registrar {
/**
 * Metodo el cual recibe un navegador de tipo string el cual no usaremos en este metodo
 * pero es necesario para las otras clases que usaran el metodo.
 * Ademas este metodo es donde se realiza la consulta  a la base de datos, en este caso
 * es un excel de nombre Datos con extensión xls, cuando se obtienen los datos,
 * se pasan por parametros a otro metodo de otra clase.
 * @param navegador- variable tipo String que contiene el nombre del navegador a usar, 
 * ya sea Chrome,Firefox ó Internet Explore. 
 * @throws FilloException-para poder usar todas las herramientas de fillo
 * que nos permite usar sql
 * @throws InterruptedException-Se lanza cuando un hilo está esperando, 
 * durmiendo u ocupado de otra manera,
 * y el hilo se interrumpe, ya sea antes o durante la actividad.
 */

public void veodatos(String navegador) throws FilloException, InterruptedException {
	//System.out.println();
	Fillo vars = new Fillo();
    Connection conexions =  vars.getConnection("C:\\Users\\SBMEDADMIN\\Documents\\Tests-Newtours\\date\\Datos.xls");
      
    String consultas= "Select * from registrar";
     
     Recordset registros= conexions.executeQuery(consultas);
     List<String> Firstname=new ArrayList<>();
     List<String> Lastname=new ArrayList<>();
     List<String> Telefonos=new ArrayList<>();
     List<String> Email=new ArrayList<>();
     List<String> Address=new ArrayList<>();
     List<String> City=new ArrayList<>();
     List<String> State=new ArrayList<>();
     List<String> PostalCode=new ArrayList<>();
     List<String> Country=new ArrayList<>();
     List<String> Usernames= new ArrayList<>();
     List<String> Passwords= new ArrayList<>();
     
     
     while(registros.next()){
    	 System.out.println(registros.getField("UserName")+ "---" +registros.getField("Password")+ "---" +registros.getField("Phone"));       
         Firstname.add(registros.getField("FirstName"));
         Lastname.add(registros.getField("LastName"));
        Telefonos.add(registros.getField("Phone"));
       Email.add(registros.getField("Email"));
          Address.add(registros.getField("Address"));
         City.add(registros.getField("City"));
        State.add(registros.getField("State"));
         PostalCode.add(registros.getField("PostalCode"));
        Country.add(registros.getField("Country"));
      Usernames.add(registros.getField("UserName"));
      Passwords.add(registros.getField("Password"));    
     }
     
     registros.close();
     conexions.close();
    Ingresando_Navegadores_Registrar.navegando(Firstname,Lastname,Telefonos,Email,Address,City,State,PostalCode,Country,Usernames,Passwords,navegador);
}

}
