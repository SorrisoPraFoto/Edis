package edis.project.rest.controller;

import edis.project.rest.models.entities.ibge.Municipio;
import edis.project.rest.services.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@RequestMapping(value = "/auxilio-emergencial")
public class AuxilioEmergencialController {
    @Autowired
    private MunicipioService municipioService;

    @GetMapping
    public ResponseEntity<Municipio> getMunicipioByNome(@RequestParam("municipio") String municipio) throws IOException, InterruptedException {
        return municipioService.getMunicipio(municipio);
    }
}
