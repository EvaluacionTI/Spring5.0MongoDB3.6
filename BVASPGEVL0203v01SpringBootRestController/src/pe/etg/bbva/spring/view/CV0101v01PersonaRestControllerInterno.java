package pe.etg.bbva.spring.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.spring.entity.CEPersona;

/*
 *  
 */
@SpringBootApplication
@RestController
public class CV0101v01PersonaRestControllerInterno {

	public static void main(String[] args) {
		System.out.println("1. Para iniciar el servicio Rest se requieres @RestController");
		System.out.println("2. El mapping @RequestMapping para el url est� en la clase principal del m�tod listadoPersonas");
		SpringApplication.run(CV0101v01PersonaRestControllerInterno.class, args);
		System.out.println("3. Ejecutar en la url : localhost:8005/todos");		
	}
	
	@RequestMapping("/todos")
	public List<CEPersona> listadoPersonas(){
		ArrayList<CEPersona> oaListaPersonas = new ArrayList<>();
		
		oaListaPersonas.add(new CEPersona(1L, "Alex", "San Luis", 48, true));
		oaListaPersonas.add(new CEPersona(2L, "Esteban", "Zárate", 16, true));
		oaListaPersonas.add(new CEPersona(3L, "Illari", "Chilca", 3, false));
		oaListaPersonas.add(new CEPersona(4L, "Luis", "Chilca", 1, true));
		
		return oaListaPersonas;
	}

}
