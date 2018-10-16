package com.demoaut.newtours.Pages_Registrar;

import java.util.List;



/**Esta clase permite escoger el navegador ya sea chrome, 
 * Firefox ó Internet explore.
 * @author Socrates
 * 
 *
 */
public class Ingresando_Navegadores_Registrar {

	/**Este metodo recibe una variable tipo string la cual nos permitira saber
 * que navegador se va a usar para realizar las pruebas, ademas de los vectores 
 * que contiene los datos del excel, estos datos pasan por este metodo ya que con ellos 
 * se realizara un ciclo for para enviar estos datos al navegador para realizar las pruebas.
	 * 
	 * @param Firstname-lista con todos los nombres del excel
	 * @param Lastname-lista con todos los apellidos del excel
	 * @param Telefonos-lista con todos los telefonos del excel
	 * @param Email-lista con todos los correos del excel
	 * @param Address-lista con todos las direcciones del excel
	 * @param City-lista con todos las ciudades del excel
	 * @param State-lista con todos los estados del excel
	 * @param PostalCode-lista con todos los códigos postales del excel
	 * @param Country-lista con todos los países del excel
	 * @param Usernames-lista con todos los username del excel
	 * @param Passwords-lista con todos los password del excel
	 * @param navegador- variable tipo string que nos define el navegador a usar
	 * @throws InterruptedException-Se lanza cuando un hilo está esperando, 
     * durmiendo u ocupado de otra manera,
     * y el hilo se interrumpe, ya sea antes o durante la actividad.
	 */
public static void navegando(List<String>Firstname,List<String> Lastname,List<String>Telefonos,List<String>Email,List<String>Address,List<String>City,List<String>State,List<String>PostalCode,List<String>Country,List<String>Usernames,List<String>Passwords,String navegador) throws InterruptedException {
	for (int i=0; i< ((int)Firstname.size()) ;i++) {
		String nombre=Firstname.get(i);
	     String apellido=Lastname.get(i);
	     String telefono=Telefonos.get(i);
	     String correo=Email.get(i);
	     String direccion= Address.get(i);
	     String ciudad=City.get(i);
	     String estado=State.get(i);
	     String postal=PostalCode.get(i);
	     String pais=Country.get(i);
	     String usuario=Usernames.get(i);
	     String contrase=Passwords.get(i);		

		if(navegador=="chrome") {
			Navegador_Chromee.navegando_chromee(nombre,apellido,telefono,correo,direccion,
					ciudad,estado,postal,pais,usuario,contrase,i);
			
		}
		else if (navegador=="firefox") {
			Navegador_FireFoxx.navegando_FireFoxx(nombre,apellido,telefono,correo,direccion,
					ciudad,estado,postal,pais,usuario,contrase,i);
		}
		else {
		   System.out.println("explore");
		 Navegador_InternetExploree.navegando_Internetexploree(nombre,apellido,telefono,correo,direccion,
					ciudad,estado,postal,pais,usuario,contrase,i);
		}
	}

	}

	
	
	
}
