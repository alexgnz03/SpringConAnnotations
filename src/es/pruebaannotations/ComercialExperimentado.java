package es.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
@Scope("singleton")
public class ComercialExperimentado implements Empleados {
	
	//Ejecución de código después de creación del Bean
	
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creación de Bean");
	}
	
	//Ejecución de código después de apagado contenedor Spring
	
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutado antes de la destrucción");
	}
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoinforme) {
		super();
		this.nuevoinforme = nuevoinforme;
	}*/
	
	/*@Autowired
	public void setNuevoinforme(CreacionInformeFinanciero nuevoinforme) {
		this.nuevoinforme = nuevoinforme;
	}*/

	@Override
	public String getTareas() {
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInforme() {
		//return "Informe generado por el comercial";
		
		return nuevoinforme.getInformeFinanciero();
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrim1")
	private CreacionInformeFinanciero nuevoinforme;

	
	

}
