package edis.project.rest.models.entities.ibge;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class Estado {
    private Long id;
    private String nome;
    private Regiao regiao;

    @Size(max = 2)
    private String sigla;
}
