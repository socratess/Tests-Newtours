package com.demoaut.newtours.Pages_Registrar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**En esta clase se navega en la pagina, de acuerdo al navegador que la invoque,
 * en la cual se buscara los elementos que se reciban ya sea firstname,lastname,etc y se le
 * envian datos ya sea nombre,apellido,etc, ya que este recibe dos string y el webdriver que 
 * es el encargado de navegar por cada elemento y poner los valores.
 * @author Socrates
 *
 */
public class Encontrar_Elementos {
/**
 * Metodo el cual se encarga de recibir 2 string un webdriver, en la cual se buscara un 
 * elementos pasado por parametro y se le enviara un datos tambien pasado por parametro,
 * ademas que el que lo recorre y hace todo esto es un webdriver pasado por parametro.
 * @param casemiro-webdriver, robot
 * @param na-elemento que se buscara
 * @param no-valor que se enviara al parametro
 */
public static void te_encuentro(WebDriver casemiro,String na, String no) {
		
		casemiro.findElement(By.name(na)).sendKeys(no);
		casemiro.manage().timeouts().implicitlyWait(600,TimeUnit.SECONDS);
	}
	
}
