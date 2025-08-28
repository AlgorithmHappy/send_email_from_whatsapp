package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestMessage implements Serializable {
    private String conversation;
    private RequestMessageContextInfo messageContextInfo;
}
