package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestKey implements Serializable {
    private String remoteJid;
    private boolean fromMe;
    private String id;
}
