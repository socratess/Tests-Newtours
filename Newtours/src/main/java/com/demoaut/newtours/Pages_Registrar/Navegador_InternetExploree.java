package com.demoaut.newtours.Pages_Registrar;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.demoaut.newtours_TomarPantallazo.Registro_Fotografico;

/**Clase la cual permite navegar en Internet Explore, en este probaremos los datos
 * provenientes del excel en la pagina newtours ademas de tomar las fotos o pantallazos
 * a cada procedimiento hecho en dicha pagina mientra se ingresan los datos al registro.
 * @author Socrates
 *
 */
public class Navegador_InternetExploree {
	static File directory = new File ("C:\\Users\\SBMEDADMIN\\Documents\\Tests-Newtours\\pantallaIE_Registro");/* variable que contiene la ruta 
	donde se guardaran los pantallazos*/
	/**
	 * metodo el cual recibe los datos que contiene el excel previamente gestionados en listas,
	 * y una variable tipo entera que nos servira para ponerle indentificacion a las fotos
	 * ,ademas de ellos en este metodo se probara el registro de newtours con los datos
	 * gestinados.
	 * @param nombre- variable que contiene el nombre que proviene del excel
	 * @param apellido- variable que contiene el apellido que proviene del excel
	 * @param telefono- variable que contiene el telefono que proviene del excel
	 * @param correo- variable que contiene el correo que proviene del excel
	 * @param direccion- variable que contiene el direccion que proviene del excel
	 * @param ciudad- variable que contiene el ciudad que proviene del excel
	 * @param estado- variable que contiene el estado que proviene del excel
	 * @param postal- variable que contiene el codigo postal que proviene del excel
	 * @param pais- variable que contiene el país que proviene del excel
	 * @param usuario- variable que contiene el username que proviene del excel
	 * @param contrase- variable que contiene el password que proviene del excel
	 * @param i- variable tipo int para identificar los pantallazos
	 * @throws InterruptedException--Se lanza cuando un hilo está esperando, 
	 * durmiendo u ocupado de otra manera,
	 * y el hilo se interrumpe, ya sea antes o durante la actividad.
	 */

	public static void navegando_Internetexploree(String nombre, String apellido, String telefono, String correo, String direccion,
			String ciudad, String estado, String postal, String pais, String usuario, String contrase,int i) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\IE\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
		WebDriver casemiro =  new InternetExplorerDriver();
		casemiro.manage().window().maximize();
		casemiro.get("http://newtours.demoaut.com/mercuryregister.php");
	
//		casemiro.findElement(By.name("firstName")).sendKeys(nombre);
		int ix=i*60;
		int xix=ix+1;
		int xis=ix+2;
		WebElement element = casemiro.findElement(By.name("register"));
		 ((RemoteWebDriver) casemiro).executeScript("arguments[0].scrollIntoView(true);", element); 
		 Registro_Fotografico.pantallazos(casemiro,ix,directory);
		 Listar_Datos_Del_Prueba.listear(casemiro,nombre,apellido,
				telefono, correo, direccion,ciudad,estado,postal,usuario,contrase);
		 Registro_Fotografico.pantallazos(casemiro,xix,directory);
		Select drpCountry = new Select(casemiro.findElement(By.name("country")));
		 drpCountry.selectByValue(pais);
		 Registro_Fotografico.pantallazos(casemiro,xis,directory);
		 Thread.sleep(1500);
		casemiro.findElement(By.name("register")).click();
	Thread.sleep(500);
		 casemiro.close();
		
	}

	
	
	
}
