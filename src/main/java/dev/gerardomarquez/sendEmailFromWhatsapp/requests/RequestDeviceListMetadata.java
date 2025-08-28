package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Clase que contiene los datos de fechas y hash
 */
@Data
@NoArgsConstructor
public class RequestDeviceListMetadata implements Serializable {

    /*
     * Hash de envio
     */
    private String senderKeyHash;

    /*
     * Fecha de envio
     */
    private Long senderTimestamp;

    /*
     * Hash de recivido
     */
    private String recipientKeyHash;

    /*
     * Fecha de recivido
     */
    private Long recipientTimestamp;
}
