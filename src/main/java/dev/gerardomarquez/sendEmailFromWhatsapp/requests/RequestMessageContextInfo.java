package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Clase que contiene datos del contexto
 */
@Data
@NoArgsConstructor
public class RequestMessageContextInfo implements Serializable {

    /*
     * Contiene datos de fecha y keyHash
     */
    private RequestDeviceListMetadata deviceListMetadata;

    /*
     * Version
     */
    private Integer deviceListMetadataVersion;

    /*
     * Mensaje encriptado
     */
    private String messageSecret;
}
