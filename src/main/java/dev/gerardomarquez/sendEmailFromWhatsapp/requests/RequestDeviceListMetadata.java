package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestDeviceListMetadata implements Serializable {
    private String senderKeyHash;
    private long senderTimestamp;
    private String recipientKeyHash;
    private long recipientTimestamp;
}
