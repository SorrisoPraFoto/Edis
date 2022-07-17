package edis.project.rest.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edis.project.rest.models.entities.beneficios.BeneficiarioRegistro;
import edis.project.rest.models.entities.beneficios.Beneficio;
import edis.project.rest.models.entities.ibge.Municipio;
import edis.project.rest.services.BeneficioService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static edis.project.rest.EdisApplication.chave;

@Service
public class BeneficioServiceImpl implements BeneficioService {
    public ResponseEntity<Beneficio> getByMunicipio(Municipio municipio, String beneficioPath, int mesAno, int pagina) {
        try {
            var cl = HttpClient.newHttpClient();
            StringBuilder buffer = new StringBuilder();
            buffer.append("?codigoIbge=").append(municipio.getId());
            buffer.append("&mesAno=").append(mesAno);
            buffer.append("&pagina=").append(pagina);

            var req = HttpRequest.newBuilder(URI.create("https://api.portaldatransparencia.gov.br/api-de-dados/" + beneficioPath + buffer)).setHeader("chave-api-dados", chave).build();
            var res = cl.send(req, HttpResponse.BodyHandlers.ofString());
            Beneficio[] beneficio = new ObjectMapper().readValue(res.body(), Beneficio[].class);
            return ResponseEntity.ok(beneficio[0]);
        } catch (IOException e){
            System.out.println(e.toString());
            return ResponseEntity.badRequest().build();
        } catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    public ResponseEntity<BeneficiarioRegistro> getBeneficiariosByMunicipio(Municipio municipio, String beneficioPath, int mesAno, int pagina) {
        try {
            var cl = HttpClient.newHttpClient();
            StringBuilder buffer = new StringBuilder();
            buffer.append("?codigoIbge=").append(municipio.getId());
            buffer.append("&mesAno=").append(mesAno);
            buffer.append("&pagina=").append(pagina);

            var req = HttpRequest.newBuilder(URI.create("https://api.portaldatransparencia.gov.br/api-de-dados/" + beneficioPath + buffer)).setHeader("chave-api-dados", chave).build();
            var res = cl.send(req, HttpResponse.BodyHandlers.ofString());
            BeneficiarioRegistro[] beneficiarioRegistros = new ObjectMapper().readValue(res.body(), BeneficiarioRegistro[].class);
            return ResponseEntity.ok(beneficiarioRegistros[0]);
        } catch (IOException e){
            System.out.println(e.toString());
            return ResponseEntity.badRequest().build();
        } catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
}
