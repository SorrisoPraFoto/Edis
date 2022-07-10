package edis.project.rest.models.entities.ibge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegiaoImediata {
    private Long id;
    private String nome;
    private RegiaoIntermediaria regiaoIntermediaria;
}
