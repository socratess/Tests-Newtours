package com.demoaut.newtours.TestCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**Este es un Suite Teste en el cual se procede a correr 
 * los test de iniciar sesión, el de registrar y navegar cuando se esta
 * dentro de la página.
 * @author Socrates
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ Validar_Inicio.class, Validar_Registro.class, Validar_Navegacion.class })
public class Validacion_Pagina_Iniciar_Registrar_Reservar_Newtours {

}
