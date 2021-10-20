package es.proyecto1.spring.mvc.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CPostalMadridValidacion.class) //futura clase que contendr� la l�gica de la validaci�n 
@Target( { ElementType.METHOD, ElementType.FIELD}) //destino de nuestra validaci�n a m�todos o campos 
@Retention(RetentionPolicy.RUNTIME)//chuquea la anotaci�n en tiempo de ejecuci�n 
public @interface CPostalMadrid {

	//definir el c�digo postal por defecto 
	
	public String value() default "28";
	
	//definir el mensaje de error 
	
	public String message() default "El c�digo postal debe comenzar por 28";
	
	//definir los grupos 
	
	Class<?>[] groups() default {};
	
	//definir los payloads 
	
	 Class<? extends Payload>[] payload() default {};
}
