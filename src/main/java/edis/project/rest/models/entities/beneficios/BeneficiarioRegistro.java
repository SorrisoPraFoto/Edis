package edis.project.rest.models.entities.beneficios;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BeneficiarioRegistro {
    @JsonProperty("beneficiario")
    private Cadastrado beneficiario;

    @JsonProperty("enquadramentoAuxilioEmergencial")
    private String enquadramento;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("mesDisponibilizacao")
    private String mesDisponibilizacao;

    @JsonProperty("municipio")
    private MunicipioBeneficiado municipio;

    @JsonProperty("numeroParcela")
    private String numeroParcela;

    @JsonProperty("responsavelAuxilioEmergencial")
    private Cadastrado responsavel;

    @JsonProperty("situacaoAuxilioEmergencial")
    private String situacao;

    @JsonProperty("valor")
    private Long valor;
}
