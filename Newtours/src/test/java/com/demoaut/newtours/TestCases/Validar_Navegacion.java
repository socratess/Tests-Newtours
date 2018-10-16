package com.demoaut.newtours.TestCases;


import org.junit.Test;

//import com.codoid.products.exception.FilloException;
import com.demoaut.newtours.Pages_RealizarReserva.Extraccion_Datos_Excel_Reservar;


/**En esta clase se realizan las pruebas cuando se esta realizando
 * la reserva del vuelo dentro de la pagina en los navegadores tales como:
 * Google Chrome,FireFox e Internet Explore, se tienes 3 test en las cuales se tiene que
 * cada una posee un objeto creado del tipo de la clase donde se extraen los datos de excel
 * ,luego desde esa clase se empieza a transitar hasta 
 * la clase que nos lleva a los navegadores.
 * @author Socrates
 *
 */
public class Validar_Navegacion {

	/**
	 * teste para el navegador chrome
	 * @throws Exception 
	 */

	@Test
	public void test() throws Exception {
		String navegador= "chrome";
		Extraccion_Datos_Excel_Reservar excele = new Extraccion_Datos_Excel_Reservar();
		excele.seleccionar(navegador);
	}
	/**
	 * teste para el navegador Firefox
	 * @throws Exception 
	 *//*
	@Test
	public void test2() throws Exception {
		String navegador= "firefox";
		Extraccion_Datos_Excel_Reservar excele = new Extraccion_Datos_Excel_Reservar();
		excele.seleccionar(navegador);
	}
	/**
	 * teste para el navegador Internet Explore
	 * @throws Exception 
	 *//*
	@Test
	public void test3() throws Exception {
		String navegador= "Internet Explore";
		Extraccion_Datos_Excel_Reservar excele = new Extraccion_Datos_Excel_Reservar();
		excele.seleccionar(navegador);
	}

*/
}
