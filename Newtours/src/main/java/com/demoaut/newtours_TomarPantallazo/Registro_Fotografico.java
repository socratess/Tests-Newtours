
package com.demoaut.newtours_TomarPantallazo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/** Esta clase permite realizar 
 * y guardar los pantallazos
 *  de este proyecto llamado Newtours
 * @author Socrates
 *
 */

public class Registro_Fotografico {
/**
 * Este metodo es el encargado de realizar el pantallazo cuando se llama, 
 * ademas de guardar dicho pantallazo en la ruta guardada en la variable File.
 * @param casemiro-Webdriver el encargado de navegar en el navegador
 * @param in, Entero que me permite ponerle numero de identificación a los pantallazos
 * @param directory- Donde guardaremos los pantallazos
 */
	public static void pantallazos(WebDriver casemiro, int in, File directory) {
		
		try {
			if(directory.isDirectory()) {
				File imagen = ((TakesScreenshot) casemiro).getScreenshotAs(OutputType.FILE);
	            //Mueve el archivo a la carga especificada con el respectivo nombre
	            FileUtils.copyFile(imagen, new File(directory.getAbsolutePath()   + "\\" + "foto numero"+ in + ".png"));
	         } else {
	            //Se lanza la excepcion cuando no encuentre el directorio
	            throw new IOException("ERROR : La ruta especificada no es un directorio!");
	         
				
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		

	}
}
