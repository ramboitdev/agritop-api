package com.agrisens.infrastructure.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Map;

@Service
public class MlClientService {
    private final WebClient client;

    public MlClientService(WebClient client) {
        this.client = client;
    }

    public Map<String, Object> predict(Map<String, Object> payload) {
        try {
            return client.post()
                    .uri("/predict")
                    .bodyValue(payload)
                    .retrieve()
                    .bodyToMono(Map.class)
                    .block();
        } catch (Exception e) {
            throw new RuntimeException("ML service error: " + e.getMessage(), e);
        }
    }
}
