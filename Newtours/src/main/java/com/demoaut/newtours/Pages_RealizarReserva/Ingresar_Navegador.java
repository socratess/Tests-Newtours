package com.demoaut.newtours.Pages_RealizarReserva;

import java.util.List;

//import com.codoid.products.exception.FilloException;


public class Ingresar_Navegador {

	public static void navegando(List<String> username, List<String> password,String navegador) throws Exception {
		Tomar_Video.videopantallazo();
		for (int i=0; i< ((int)username.size()) ;i++) {
			
			String userName= (String) username.get(i);
			String passWord= (String)password.get(i);
			System.out.println(userName);
			
			if(navegador=="chrome") {
				Navegar_Chrome.navegar_chrome(userName, passWord,i);
			}
			else if (navegador=="firefox") {
				Navegar_FireFox.navegar_FireFox(userName, passWord,i);
			}
			else {
			   System.out.println("explore");
			   Navegar_InternetExplore.navegar_InternetExplore(userName, passWord,i);
			
			}
		}
	}

}
