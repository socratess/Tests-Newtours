package com.demoaut.newtours.TestCases;


import org.junit.Test;

import com.codoid.products.exception.FilloException;
import com.demoaut.newtours.Pages_IniciarSesion.Extraccion_Datos_Excel_IniciarSesion;


/**En esta clase se realizan las pruebas de iniciar sesión en los navegadores tales como:
 * Google Chrome,FireFox e Internet Explore, se tienes 3 test en las cuales se tiene que
 * cada una posee un objeto creado del tipo de la clase donde se extraen los datos de excel
 * ,luego desde esa clase se empieza a transitar hasta 
 * la clase que nos lleva a los navegadores.
 * @author Socrates
 *
 */
public class Validar_Inicio {
/**
 * teste para el navegador chrome
 * @throws FilloException-excepción para poder usar todas las herramientas de fillo
 * que nos permite usar sql
 */
	@Test
	public void test1() throws FilloException {
		String navegador= "chrome";
		Extraccion_Datos_Excel_IniciarSesion exc = new Extraccion_Datos_Excel_IniciarSesion();
		exc.tomar(navegador);
	}
	/**
	 * teste para el navegador firefox
	 * @throws FilloException-excepción para poder usar todas las herramientas de fillo
	 * que nos permite usar sql
	 */
	/*@Test
	public void test2() throws FilloException {
		String navegador= "firefox";
		Extraccion_Datos_Excel_IniciarSesion exc = new Extraccion_Datos_Excel_IniciarSesion();
		 exc.tomar(navegador);
	}*/
	/**
	 * teste para el navegador Internet Explore
	 * @throws FilloException-excepción para poder usar todas las herramientas de fillo
	 * que nos permite usar sql
	 */
	/*@Test
	public void test3() throws FilloException {
		String navegador= "Internet Explore";
		Extraccion_Datos_Excel_IniciarSesion exc = new Extraccion_Datos_Excel_IniciarSesion();
		exc.tomar(navegador);
	}
*/
}
