package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Clase que contiene la informacion del mensaje recivido
 */
@Data
@NoArgsConstructor
public class RequestDataMessage implements Serializable{

    /*
     * Objeto que contiene la informacion del que envio el mensaje de whatsapp
     * a evolution api
     */
    private RequestKey key;

    /*
     * Nombre de contacto de como aparece en el whatsapp el que envio el mensaje
     */
    private String pushName;

    /*
     * Informacion sobre el mensaje recivido
     */
    private RequestMessage message;

    /*
     * Tipo de mensaje
     */
    private String messageType;

    /*
     * Fecha de mensaje en formato timestamp
     */
    private Long messageTimestamp;

    /*
     * Id de la instancia
     */
    private String instanceId;

    /*
     * Tipo de dispositivo de quien envio el mensaje
     */
    private String source;
}
