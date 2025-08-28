package dev.gerardomarquez.sendEmailFromWhatsapp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import dev.gerardomarquez.sendEmailFromWhatsapp.requests.RequestMessagesUpsert;

/*
 * Controlador que recive los request de evolution api cada vez que recive un mensaje
 */
@RestController
public class WebHookEvolutionApi {

    /*
     * Metodo que recive el request en el evento "messages-upsert" de evolution api
     * @param request Objeto en clase java que envia evolution api
     */
    @PostMapping("/webhook/evolutionapi/messages-upsert")
    public void handleChatsUpsert(@RequestBody RequestMessagesUpsert request) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(request);
            System.out.println("Evento recibido: " + json);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            System.err.println("Error serializando el payload: " + e.getMessage());
        }
    }
}
