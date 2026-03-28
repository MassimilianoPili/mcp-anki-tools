package io.github.massimilianopili.mcp.anki;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AnkiConfig {

    @Bean("ankiWebClient")
    public WebClient ankiWebClient(
            @Value("${mcp.anki.base-url:http://anki-api:8096}") String baseUrl) {
        return WebClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("Accept", "application/json")
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}
