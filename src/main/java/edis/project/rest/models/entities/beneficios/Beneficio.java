package edis.project.rest.models.entities.beneficios;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beneficio {
    @JsonProperty("dataReferencia")
    private String dataReferencia;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("municipio")
    private MunicipioBeneficiado municipio;

    @JsonProperty("quantidadeBeneficiados")
    private int qtdBeneficiados;

    @JsonProperty("tipo")
    private TipoBeneficio metainf;

    @JsonProperty("valor")
    private Long gastoTotal;
}
