package edis.project.rest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "api")
public class AuthAPI {
    @Value("${API_KEY}")
    private String apiKey;
    private final String valor = "chave-api-dados";
}
