package dev.gerardomarquez.sendEmailFromWhatsapp.responses;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Nombres de usuario
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserNameResponse implements Serializable{

    /*
     * Nombre de usuario completo
     */
    private String fullName;
}
