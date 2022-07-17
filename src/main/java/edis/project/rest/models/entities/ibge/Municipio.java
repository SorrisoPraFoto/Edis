package edis.project.rest.models.entities.ibge;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Municipio {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("microrregiao")
    private Microrregiao microrregiao;

    @JsonProperty("regiao-imediata")
    private RegiaoImediata regiaoImediata;
}
