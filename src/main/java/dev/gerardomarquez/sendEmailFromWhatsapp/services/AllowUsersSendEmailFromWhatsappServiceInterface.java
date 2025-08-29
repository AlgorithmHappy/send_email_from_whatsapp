package dev.gerardomarquez.sendEmailFromWhatsapp.services;

import org.springframework.data.domain.Pageable;

import dev.gerardomarquez.sendEmailFromWhatsapp.responses.PageResponse;
import dev.gerardomarquez.sendEmailFromWhatsapp.responses.Response;
import dev.gerardomarquez.sendEmailFromWhatsapp.responses.UserNameResponse;

/*
 * Interfaz que define los metodos para Hacer el crud de los datos para el envio y recepcion de
 * correos desde el whatsapp
 */
public interface AllowUsersSendEmailFromWhatsappServiceInterface {

    /*
     * Metodo que devuelve todos los nombres de usuarios de la base de datos
     * @param pageable Datos de paginacion
     * @return Response generico con la lista de nombres de usuarios
     */
    public Response<PageResponse<UserNameResponse>> getAllNamesUsers(Pageable pageable);
}
