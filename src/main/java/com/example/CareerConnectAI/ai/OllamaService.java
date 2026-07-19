package com.example.CareerConnectAI.ai;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class OllamaService {
    private final RestTemplate restTemplate;
    public OllamaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public String generateRecommendation(String prompt) {
        String url = "http://localhost:11434/api/generate";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> requestBody = Map.of(
                "model", "llama3",
                "prompt", prompt,
                "stream", false
        );

        HttpEntity<Map<String, Object>> request =
                new HttpEntity<>(requestBody, headers);
        try {
            ResponseEntity<Map> response =
                    restTemplate.postForEntity(url, request, Map.class);
            Map responseBody = response.getBody();
            if (responseBody == null || responseBody.get("response") == null) {
                return "AI service returned an empty response.";
            }
            return responseBody.get("response").toString();
        } catch (ResourceAccessException exception) {
            return "AI service is unavailable. Please start Ollama and try again.";
        } catch (RestClientException exception) {
            return "Unable to generate an AI recommendation at the moment.";
        }
    }
}