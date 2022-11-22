package edis.project.rest.controller;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import edis.project.rest.models.entities.beneficios.AuxEmergencial;
import edis.project.rest.models.entities.beneficios.BeneficiarioRegistro;
import edis.project.rest.models.entities.beneficios.Beneficio;
import edis.project.rest.models.entities.ibge.Municipio;
import edis.project.rest.services.BeneficioService;
import edis.project.rest.services.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
@RequestMapping(value = "/bolsa-familia")
public class BolsaFamiliaController {
    @Autowired
    private MunicipioService municipioService;

    @Autowired
    private BeneficioService beneficioService;

    @Autowired
    private ObjectMapper mapper;

    @GetMapping
    public ResponseEntity<Beneficio> getByMunicipio(@RequestParam("municipio") String municipio,
                                                    @RequestParam("mesAno") int mesAno,
                                                    @RequestParam("pagina") int pagina) throws IOException, InterruptedException {
        ResponseEntity<Municipio> municipioEncontrado = municipioService.getMunicipio(municipio);
        JavaType type = mapper.getTypeFactory().constructArrayType(Beneficio.class);
        return beneficioService.getByMunicipio(type, municipioEncontrado.getBody(), "bolsa-familia-disponivel-beneficiario-por-municipio", mesAno, pagina);
    }

    @GetMapping(path = "beneficiarios")
    public ResponseEntity<BeneficiarioRegistro> getBeneficiariosByMunicipio(@RequestParam("municipio") String municipio,
                                                                            @RequestParam("mesAno") int mesAno,
                                                                            @RequestParam("pagina") int pagina) throws IOException, InterruptedException {
        ResponseEntity<Municipio> municipioEncontrado = municipioService.getMunicipio(municipio);
        return beneficioService.getBeneficiariosByMunicipio(municipioEncontrado.getBody(), "auxilio-emergencial-beneficiario-por-municipio", mesAno, pagina);
    }

    @GetMapping(path = "beneficiarios-por-codigo")
    public ResponseEntity<BeneficiarioRegistro> getBeneficiariosByCodigo(@RequestParam(name = "codigoBeneficiario") String codigoBeneficiario,
                                                                         @RequestParam(name = "codigoBeneficiario", required = false) String codigoResponsavelFamiliar,
                                                                         @RequestParam("mesAno") int mesAno,
                                                                         @RequestParam("pagina") int pagina) throws IOException, InterruptedException {
        return beneficioService.getBeneficiariosByCodigo(codigoBeneficiario, codigoResponsavelFamiliar, "auxilio-emergencial-por-cpf-ou-nis", mesAno, pagina);
    }
}
