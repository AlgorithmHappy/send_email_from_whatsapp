package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestDataMessage implements Serializable{
    private RequestKey key;
    private String pushName;
    private RequestMessage message;
    private String messageType;
    private long messageTimestamp;
    private String instanceId;
    private String source;
}
