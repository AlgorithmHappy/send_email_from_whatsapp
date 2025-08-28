package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Clase que contiene los datos del mensaje recivido
 */
@Data
@NoArgsConstructor
public class RequestMessage implements Serializable {
    
    /*
     * Cuerpo del mensaje recivido
     */
    private String conversation;

    /*
     * Informacion del contexto
     */
    private RequestMessageContextInfo messageContextInfo;
}
