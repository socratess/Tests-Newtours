package com.demoaut.newtours.TestCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**Este es un Suite Teste en el cual se procede a correr 
 * los test de iniciar sesión y el de registrar.
 * @author Socrates
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ Validar_Inicio.class, Validar_Registro.class })
public class Validar_IniciarSesion_Y_Registrar {

}
