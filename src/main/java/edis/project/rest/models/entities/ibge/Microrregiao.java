package edis.project.rest.models.entities.ibge;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Microrregiao {
    private Long id;
    private String nome;
    private Estado estado;
}
