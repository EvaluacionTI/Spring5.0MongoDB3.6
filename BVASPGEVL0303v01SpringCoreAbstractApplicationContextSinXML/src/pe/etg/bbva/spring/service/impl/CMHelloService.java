package pe.etg.bbva.spring.service.impl;

import pe.etg.bbva.spring.service.CIHelloService;

public class CMHelloService implements CIHelloService {

	@Override
	public void saludar() {
		System.out.println("Arquitectura Host - Rest");
	}

	public void mensajeEntelgy() {
		System.out.println("Factory - Rest");
	}

	public void mensajeBbva() {
		System.out.println("BBVA - CICS");
	}
	
}
