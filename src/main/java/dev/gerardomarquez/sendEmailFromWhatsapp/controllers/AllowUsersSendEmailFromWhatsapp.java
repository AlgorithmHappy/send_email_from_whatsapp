package dev.gerardomarquez.sendEmailFromWhatsapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import dev.gerardomarquez.sendEmailFromWhatsapp.responses.PageResponse;
import dev.gerardomarquez.sendEmailFromWhatsapp.responses.Response;
import dev.gerardomarquez.sendEmailFromWhatsapp.responses.UserNameResponse;
import dev.gerardomarquez.sendEmailFromWhatsapp.services.AllowUsersSendEmailFromWhatsappServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/*
 * Controlador que estara en comunicacion con el front end para gestionar a los usuarios
 * que puedan mandar correo por whatsapp
 */
@RestController
public class AllowUsersSendEmailFromWhatsapp {

    /*
     * Servicio para manejar el crud y gestionar a los usuarios
     */
    @Autowired
    private AllowUsersSendEmailFromWhatsappServiceImplementation service;

    /*
     * Endpoint que devuelve a todos los usuarios por paginado
     * @param pageable Paginado
     * @return Devuelve una pagina de todos los usuarios
     */
    @GetMapping("/users")
    public ResponseEntity<Response<PageResponse<UserNameResponse>>> getMethodName(Pageable pageable) {
        Response<PageResponse<UserNameResponse>> response = service.getAllNamesUsers(pageable);
        return ResponseEntity.ok().body(response);
    }
    
}
