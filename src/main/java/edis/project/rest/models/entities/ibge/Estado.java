package edis.project.rest.models.entities.ibge;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class Estado {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("regiao")
    private Regiao regiao;

    @JsonProperty("sigla")
    @Size(max = 2)
    private String sigla;
}
