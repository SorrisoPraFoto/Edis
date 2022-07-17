package edis.project.rest.services;

import edis.project.rest.models.entities.beneficios.Beneficio;
import edis.project.rest.models.entities.ibge.Municipio;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BeneficioService {
    public ResponseEntity<Beneficio> getByMunicipio(Municipio municipio, String beneficioPath, int mesAno, int pagina);
}
