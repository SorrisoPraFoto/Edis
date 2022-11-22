package edis.project.rest.models.entities.beneficios;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuxEmergencial extends Beneficio {
    @JsonProperty("dataReferencia")
    private String dataReferencia;

    @JsonProperty("quantidadeBeneficiados")
    private int qtdBeneficiados;

    @JsonProperty("tipo")
    private TipoBeneficio metainf;
}
