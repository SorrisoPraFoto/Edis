package edis.project.rest.services;

import com.fasterxml.jackson.databind.JavaType;
import edis.project.rest.models.entities.beneficios.BeneficiarioRegistro;
import edis.project.rest.models.entities.beneficios.Beneficio;
import edis.project.rest.models.entities.ibge.Municipio;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface BeneficioService {
    public ResponseEntity<Beneficio> getByMunicipio(JavaType tipoBeneficio, Municipio municipio, String beneficioPath, int mesAno, int pagina);
    public ResponseEntity<BeneficiarioRegistro> getBeneficiariosByMunicipio(Municipio municipio, String beneficioPath, int mesAno, int pagina);
    public ResponseEntity<BeneficiarioRegistro> getBeneficiariosByCodigo(String codigoBeneficiario, String codigoResponsavelFamiliar, String beneficioPath, int mesAno, int pagina);
}
