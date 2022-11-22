package edis.project.rest.models.entities.beneficios;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Beneficio {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("municipio")
    private MunicipioBeneficiado municipio;

    @JsonProperty("valor")
    private Long gastoTotal;
}
