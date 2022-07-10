package edis.project.rest.models.entities.ibge;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Municipio {
    private Long id;
    private String nome;
    private Microrregiao microrregiao;
    private RegiaoImediata regiaoImediata;
}
