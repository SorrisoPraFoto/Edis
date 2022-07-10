package edis.project.rest.services;

import edis.project.rest.models.entities.ibge.Municipio;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

public interface MunicipioService {
    /*
        Função bsearch básica com string para buscar no JSON de municípios
     */
    public int binarySearch(String[] municipios, String m);
    public ResponseEntity<Municipio> getMunicipio(@RequestParam String municipio) throws IOException, InterruptedException;
}
