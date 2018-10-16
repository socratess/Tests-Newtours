package com.demoaut.newtours.Pages_Registrar;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebDriver;



/**En esta clase se listan tantos los datos de el excel de forma idonea para ser 
 * luego enviadas para su mejor uso,ademas de poner en vectores identificadores
 * de la pagina a usar por ejemplo : donde va el nombre(firstname), asi sucesivamente.
 * @author Socrates
 *
 */
public class Listar_Datos_Del_Prueba {


	/**
	 * Metodo en el cual se agregan a vectores tanto los datos provenientes del excel, 
	 * como los elementos identificados por sus nombres, ya sea firstname, lastname, asi 
	 * sucesivamente, ademas de recibir un controlador que en este metodo no se usara 
	 * pero si enviara al siguiente metodo que se invoca.
	 * @param casemiro-WebDriver , navegador que navega en la pagina a probar y sus
	 * herramientas
	 * @param nombre- variable que contiene el nombre que proviene del excel
	 * @param apellido- variable que contiene el apellido que proviene del excel
	 * @param telefono- variable que contiene el telefono que proviene del excel
	 * @param correo- variable que contiene el correo que proviene del excel
	 * @param direccion- variable que contiene el direccion que proviene del excel
	 * @param ciudad- variable que contiene el ciudad que proviene del excel
	 * @param estado- variable que contiene el estado que proviene del excel
	 * @param postal- variable que contiene el codigo postal que proviene del excel
	 * @param usuario- variable que contiene el username que proviene del excel
	 * @param contrase- variable que contiene el password que proviene del excel
	 */
	
	public static void listear(WebDriver casemiro,String nombre,String apellido,
			String telefono,String correo,String direccion,
			String ciudad,String estado,String postal,
			String usuario,String contrase) {
		
		List<String> nombres_pagina= new ArrayList<>();
		nombres_pagina.add("firstName");
		nombres_pagina.add("lastName");
		nombres_pagina.add("phone");
		nombres_pagina.add("userName");
		nombres_pagina.add("address1");
		nombres_pagina.add("address2");
		nombres_pagina.add("city");
		nombres_pagina.add("state");
		nombres_pagina.add("postalCode");
		nombres_pagina.add("email");
		nombres_pagina.add("password");
		nombres_pagina.add("confirmPassword");
		List<String> datos_lista= new ArrayList<>();
		datos_lista.add(nombre);
		datos_lista.add(apellido);
		datos_lista.add(telefono);
		datos_lista.add(correo);
		datos_lista.add(direccion);
		datos_lista.add(direccion);
		datos_lista.add(ciudad);
		datos_lista.add(estado);
		datos_lista.add(postal);
		datos_lista.add(usuario);
		datos_lista.add(contrase);
		datos_lista.add(contrase);
		
		for (int i=0; i<(int)nombres_pagina.size();i++) {
			String pagina=nombres_pagina.get(i);
			String excel=datos_lista.get(i);
			
		Encontrar_Elementos.te_encuentro(casemiro,pagina, excel);
		}
	}
	
}
