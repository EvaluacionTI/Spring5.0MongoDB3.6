package pe.etg.bbva.evalua.spring5.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.etg.bbva.evalua.spring5.entity.CE0301v01Mascota;
import pe.etg.bbva.evalua.spring5.service.CS0301v01PetService;

@RestController
public class CC0301v01PetController {

	@Autowired
	CS0301v01PetService oCSPetService;
	
	@RequestMapping(value="/mascota", method= {RequestMethod.GET}, produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<CE0301v01Mascota> findAll(){
		return oCSPetService.findAll();
	}
	
	@RequestMapping(value="/mascota/{id}", method= {RequestMethod.GET}, produces= {MediaType.APPLICATION_JSON_VALUE})
	public CE0301v01Mascota findById(@PathVariable("id") int pId) {
		return oCSPetService.findById(pId);
	}
}
