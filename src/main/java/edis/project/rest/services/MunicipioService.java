package edis.project.rest.services;

import edis.project.rest.models.entities.ibge.Municipio;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Service
public interface MunicipioService {
    public ResponseEntity<Municipio> getMunicipio(@RequestParam String municipio) throws IOException, InterruptedException;
}
