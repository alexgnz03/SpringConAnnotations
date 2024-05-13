package es.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// Cargar el xml de configuración
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir un bean al contenedor
		
		Empleados Antonio=contexto.getBean("ComercialExperimentado", Empleados.class);
		
		// Usar el bean
		
		System.out.println(Antonio.getInforme());
		
		System.out.println(Antonio.getTareas());
		
		// Cerrar el contexto

	}

}
