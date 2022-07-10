package edis.project.rest.models.entities.ibge;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
public class Regiao {
    private Long id;
    private String nome;

    @Size(max = 2)
    private String sigla;
}
