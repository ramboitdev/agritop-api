package com.agrisens.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient mlWebClient(org.springframework.core.env.Environment env) {
        String base = env.getProperty("ML_SERVICE_URL", "http://localhost:8000");
        return WebClient.builder().baseUrl(base).build();
    }
}
