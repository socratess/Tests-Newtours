package com.demoaut.newtours.TestCases;


import org.junit.Test;

import com.codoid.products.exception.FilloException;
import com.demoaut.newtours.Pages_Registrar.Extraccion_Datos_Excel_Registrar;
/**En esta clase se realizan las pruebas de registrar en los navegadores tales como:
 * Google Chrome,FireFox e Internet Explore, se tienes 3 test en las cuales se tiene que
 * cada una posee un objeto creado del tipo de la clase donde se extraen los datos de excel
 * ,luego desde esa clase se empieza a transitar hasta 
 * la clase que nos lleva a los navegadores.
 * @author Socrates
 *
 */
public class Validar_Registro {


/**
 * teste para el navegador chrome
 * @throws FilloException-excepción para poder usar todas las herramientas de fillo
 * que nos permite usar sql
 * @throws InterruptedException-Se lanza cuando un hilo está esperando, 
 * durmiendo u ocupado de otra manera,
 * y el hilo se interrumpe, ya sea antes o durante la actividad.
 */
	@Test
	public void test1() throws FilloException, InterruptedException {
		String navegador= "chrome";
		Extraccion_Datos_Excel_Registrar exce = new Extraccion_Datos_Excel_Registrar();
		exce.veodatos(navegador);
	}
	/**
	 * teste para el navegador Firefox
	 * @throws FilloException-excepción para poder usar todas las herramientas de fillo
	 * que nos permite usar sql
	 * @throws InterruptedException-Se lanza cuando un hilo está esperando, 
	 * durmiendo u ocupado de otra manera,
	 * y el hilo se interrumpe, ya sea antes o durante la actividad.
	 */
/*	@Test
	public void test2() throws FilloException, InterruptedException {
		String navegador= "firefox";
		Extraccion_Datos_Excel_Registrar exce = new Extraccion_Datos_Excel_Registrar();
		exce.veodatos(navegador);
	}
	/**
	 * teste para el navegador Internet Explore
	 * @throws FilloException-excepción para poder usar todas las herramientas de fillo
	 * que nos permite usar sql
	 * @throws InterruptedException-Se lanza cuando un hilo está esperando, 
	 * durmiendo u ocupado de otra manera,
	 * y el hilo se interrumpe, ya sea antes o durante la actividad.
	 *//*
	@Test
	public void test3() throws FilloException, InterruptedException {
		String navegador= "Internet Explore";
		Extraccion_Datos_Excel_Registrar exce = new Extraccion_Datos_Excel_Registrar();
		exce.veodatos(navegador);
	}*/
}
