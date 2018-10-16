package com.demoaut.newtours.Pages_IniciarSesion;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.codoid.products.exception.FilloException;
import com.demoaut.newtours_TomarPantallazo.Registro_Fotografico;


/**Clase la cual permite navegar en Internet Explore, en este probaremos los datos
 * provenientes del excel en la pagina newtours ademas de tomar las fotos o pantallazos
 * a cada procedimiento hecho en dicha pagina mientra se ingresan los datos al login.
 * @author Socrates
 *
 */
public class Navegador_InternetExplore {

	static File directory = new File ("C:\\Users\\SBMEDADMIN\\Documents\\Tests-Newtours\\pantallaIE");/* variable que contiene la ruta 
	donde se guardaran los pantallazos*/
	/**
	 * metodo el cual recibe los datos que contiene el excel previamente gestionados en listas,
	 * y una variable tipo entera que nos servira para ponerle indentificacion a las fotos
	 * ,ademas de ellos en este metodo se probara el login de newtours con los datos
	 * gestinados.
	 * @param UserName-lista con todos los username del excel
	 * @param PassWord-lista con todos los password del excel
	 * @param i- variable tipo int para identificar los pantallazos
	 * @throws FilloException-excepción para poder usar todas las herramientas de fillo
 * que nos permite usar sql
	 */
	public static void navegando_Internetexplore(String UserName, String PassWord, int i) throws FilloException 
	{
		
		int sin =i*30;
		System.setProperty("webdriver.ie.driver","C:\\IE\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		WebDriver casemiro =  new InternetExplorerDriver();
		casemiro.manage().window().maximize();
		casemiro.get("http://newtours.demoaut.com/");
		
		int in= sin;
		int isn=sin+1;
		int issn= sin+2;
		int isssn=sin+3;
		Registro_Fotografico.pantallazos(casemiro,in,directory);
		casemiro.findElement(By.name("userName")).sendKeys(UserName);
		
		Registro_Fotografico.pantallazos(casemiro,isn,directory);	
		//paso 5
		casemiro.findElement(By.name("password")).sendKeys(PassWord);
		
		Registro_Fotografico.pantallazos(casemiro,issn,directory);
		
		
		casemiro.findElement(By.name("login")).click();
		
		Registro_Fotografico.pantallazos(casemiro,isssn,directory);
		//casemiro.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//casemiro.close();
		/*boolean vv= (boolean)casemiro.findElement(By.xpath(".//input[@alt='Login']")).isEnabled();
		if (vv== true) {
			casemiro.findElement(By.name("userName")).sendKeys(UserName);
			//fotografia.pantallazos(casemiro,isn,directory);	
			casemiro.findElement(By.name("password")).sendKeys(PassWord);
			//fotografia.pantallazos(casemiro,issn,directory);
			casemiro.findElement(By.name("login")).click();
			casemiro.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}*/
		casemiro.close();
}
	
}
