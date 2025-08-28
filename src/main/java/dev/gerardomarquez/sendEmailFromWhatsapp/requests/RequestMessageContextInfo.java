package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestMessageContextInfo implements Serializable {
    private RequestDeviceListMetadata deviceListMetadata;
    private int deviceListMetadataVersion;
    private String messageSecret;
}
