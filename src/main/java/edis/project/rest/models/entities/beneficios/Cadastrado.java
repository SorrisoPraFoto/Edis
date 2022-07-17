package edis.project.rest.models.entities.beneficios;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cadastrado {
    private String cpfFormatado;
    private String nis;
    private String nome;
}
