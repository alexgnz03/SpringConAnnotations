package es.pruebaannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// Cargar el xml de configuración
		
			//ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
			
		//Cargar el class de configuración
			
			AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// Pedir un bean al contenedor
				
		/*Empleados empleado=contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());*/
			
		DirectorFinanciero empleado=contexto.getBean("directorFinanciero", DirectorFinanciero.class);
				
		System.out.println("Email del director: " + empleado.getEmail());
		
		System.out.println("Nombre de la empresa: " + empleado.getNombreEmpresa());
				
		// Cerrar el contexto
		contexto.close();

	}

}
