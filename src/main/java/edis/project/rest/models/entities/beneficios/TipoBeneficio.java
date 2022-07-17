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
public class TipoBeneficio {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("descricao")
    private String descricao;

    @JsonProperty("descricaoDetalhada")
    private String descricaoDetalhada;
}
