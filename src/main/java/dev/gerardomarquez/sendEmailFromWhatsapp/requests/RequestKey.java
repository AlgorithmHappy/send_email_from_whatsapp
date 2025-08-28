package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Clase que contiene los datos de la persona que envio el mensaje
 */
@Data
@NoArgsConstructor
public class RequestKey implements Serializable {

    /*
     * Numero de telefono de quien envio el mensaje
     */
    private String remoteJid;

    /*
     * Verificar si se envio y recivio evolution api el mensaje
     */
    private boolean fromMe;

    /*
     * Identificador del numero
     */
    private String id;
}
