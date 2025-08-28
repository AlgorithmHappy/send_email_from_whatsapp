package dev.gerardomarquez.sendEmailFromWhatsapp.requests;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestMessagesUpsert implements Serializable{
    private String event;
    private String instance;
    private RequestDataMessage data;
    private String destination;
    private String date_time;
    private String sender;
    private String server_url;
    private String apikey;

}
