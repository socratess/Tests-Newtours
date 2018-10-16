package com.demoaut.newtours.Pages_IniciarSesion;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;
import com.demoaut.newtours_TomarPantallazo.Registro_Fotografico;


/**Clase la cual permite navegar en google chrome, en este probaremos los datos
 * provenientes del excel en la pagina newtours ademas de tomar las fotos o pantallazos
 * a cada procedimiento hecho en dicha pagina mientra se ingresan los datos al login.
 * @author Socrates
 *
 */
public class Navegador_Chrome {
	static File directory = new File ("C:\\Users\\SBMEDADMIN\\Documents\\Tests-Newtours\\pantallachrome"); /* variable que contiene la ruta 
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
	
	public static void navegando_chrome(String UserName, String PassWord, int i) throws FilloException {
		    int sin= i*10;
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver casemiro =  new ChromeDriver();
			
			casemiro.get("http://newtours.demoaut.com/");
			casemiro.manage().window().maximize();
			  int in= sin;
			  int isn=sin+1;
			  int issn= sin+2;
			  int isssn=sin+3;
			Registro_Fotografico.pantallazos(casemiro,in,directory);
			casemiro.findElement(By.name("userName")).sendKeys(UserName);
			Registro_Fotografico.pantallazos(casemiro,isn,directory);	
			casemiro.findElement(By.name("password")).sendKeys(PassWord);
			Registro_Fotografico.pantallazos(casemiro,issn,directory);
			casemiro.findElement(By.name("login")).click();
			Registro_Fotografico.pantallazos(casemiro,isssn,directory);
			casemiro.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			boolean vv= (boolean)casemiro.findElement(By.xpath(".//input[@alt='Login']")).isEnabled();
			if (vv== true) {
				int x= sin+4;
				int xe= sin+5;
				int exe= sin+6;
				Registro_Fotografico.pantallazos(casemiro,x,directory);
				casemiro.findElement(By.name("userName")).sendKeys(UserName);
				Registro_Fotografico.pantallazos(casemiro,xe,directory);	
				casemiro.findElement(By.name("password")).sendKeys(PassWord);
				Registro_Fotografico.pantallazos(casemiro,exe,directory);
				casemiro.findElement(By.name("login")).click();
				casemiro.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				
				}
			
				casemiro.close();		
}
}
