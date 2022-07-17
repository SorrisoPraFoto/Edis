package edis.project.rest.models.entities.beneficios;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class EstadoBeneficiado {
    @JsonProperty("nome")
    private String nome;

    @JsonProperty("sigla")
    @Size(max = 2)
    private String sigla;
}
