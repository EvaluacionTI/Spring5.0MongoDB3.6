package pe.bbva.architecture.service.impl;

import java.util.ArrayList;
import java.util.List;

import pe.bbva.architecture.service.CI0101v01ProductoServicio;
import pe.etg.bbva.spring.entity.CE0101v01Producto;

//@Service
// 1. Al implementar esta clase y si deseamos utilizar anotaciones y usarlo como servicio no es necesario asignar la etiqueta @Service 
public class CM0101v01ProductoServicioImplementar implements CI0101v01ProductoServicio{

	@Override
	public List<CE0101v01Producto> listaProductos() {
		ArrayList<CE0101v01Producto> oListProduct = new ArrayList<>();
		oListProduct.add(new CE0101v01Producto(1, "Cuenta Sueldo MN"));
		oListProduct.add(new CE0101v01Producto(2, "Carta Fianza"));
		oListProduct.add(new CE0101v01Producto(3, "Factoring"));
		oListProduct.add(new CE0101v01Producto(4, "Cuenta a Plazo"));
		
		return oListProduct;
	}

}
