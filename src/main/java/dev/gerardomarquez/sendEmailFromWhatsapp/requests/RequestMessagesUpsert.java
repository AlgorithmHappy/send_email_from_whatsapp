package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Clase principal que mapea el request que envia evolution API
 */
@Data
@NoArgsConstructor
public class RequestMessagesUpsert implements Serializable{

    /*
     * Tipo de evento de evolution api
     */
    private String event;

    /*
     * Instancia que se creo para el whatsapp web del telefono que se ligo
     * a evolution api
     */
    private String instance;

    /*
     * Objeto que contiene informacion sobre el mensaje recivido
     */
    private RequestDataMessage data;

    /*
     * URL que de este servicio
     */
    private String destination;

    /*
     * Fecha actual
     */
    private String date_time;

    /*
     * Numero de telefono que esta ligado a evolution api
     */
    private String sender;

    /*
     * Dominio de donde se eta corriendo evolution api
     */
    private String server_url;

    /*
     * Api key de la instancia de la relacion entre el whatsapp web de evolution
     * api y el del telefono
     */
    private String apikey;

}
