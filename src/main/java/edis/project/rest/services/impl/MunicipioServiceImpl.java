package edis.project.rest.services.impl;

import edis.project.rest.models.entities.ibge.Municipio;
import edis.project.rest.services.MunicipioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MunicipioServiceImpl implements MunicipioService {
    public int binarySearch(String[] municipios, String m) {
        int low = 0;
        int high = municipios.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (municipios[mid].compareTo(m) < 0) {
                low = mid + 1;
            } else if (municipios[mid].compareTo(m) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public ResponseEntity<Municipio> getMunicipio(@RequestParam String municipio) throws IOException, InterruptedException{
        var cl = HttpClient.newHttpClient();
        var req = HttpRequest.newBuilder(URI.create("https://servicodados.ibge.gov.br/api/v1/localidades/municipios?orderBy=nome")).header(
                "accept", "application/json"
        ).build();

        var res = cl.send(req, HttpResponse.BodyHandlers.discarding());

        return null;
    }
}
