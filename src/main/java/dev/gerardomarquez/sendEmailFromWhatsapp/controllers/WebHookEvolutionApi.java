package dev.gerardomarquez.sendEmailFromWhatsapp.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import dev.gerardomarquez.sendEmailFromWhatsapp.requests.RequestMessagesUpsert;

@RestController
public class WebHookEvolutionApi {
    @PostMapping("/webhook/evolutionapi/chats/upsert/messages-upsert")
    public void handleChatsUpsert(@RequestBody RequestMessagesUpsert payload) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(payload);
            System.out.println("Evento recibido: " + json);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            System.err.println("Error serializando el payload: " + e.getMessage());
        }
    }
}
