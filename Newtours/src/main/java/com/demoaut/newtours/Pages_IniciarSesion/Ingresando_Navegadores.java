package com.demoaut.newtours.Pages_IniciarSesion;

import java.util.List;
import com.codoid.products.exception.FilloException;

/**Esta clase permite escoger el navegador ya sea chrome, 
 * Firefox ó Internet explore.
 * @author Socrates
 * 
 *
 */
public class Ingresando_Navegadores {
/**
 * Este metodo recibe una variable tipo string la cual nos permitira saber
 * que navegador se va a usar para realizar las pruebas, ademas de los vectores 
 * que contiene los datos del excel, estos datos pasan por este metodo ya que con ellos 
 * se realizara un ciclo for para enviar estos datos al navegador para realizar las pruebas.
 * @param username-lista con todos los username del excel
 * @param password-lista con todos los password del excel
 * @param navegador- variable tipo string que nos define el navegador a usar
 * @throws FilloException- excepción para poder usar todas las herramientas de fillo
 * que nos permite usar sql 
 */
	public static void navegando(List<String> username, List<String> password,String navegador) throws FilloException {
for (int i=0; i< ((int)username.size()) ;i++) {
			
			String userName= (String) username.get(i);
			String passWord= (String)password.get(i);
			System.out.println(userName);
			
			if(navegador=="chrome") {
				Navegador_Chrome.navegando_chrome(userName, passWord,i);
			}
			else if (navegador=="firefox") {
				Navegador_FireFox.navegando_FireFox(userName, passWord,i);
			}
			else {
			   System.out.println("explore");
			   Navegador_InternetExplore.navegando_Internetexplore(userName, passWord,i);
			
			}
		}
	}
}
