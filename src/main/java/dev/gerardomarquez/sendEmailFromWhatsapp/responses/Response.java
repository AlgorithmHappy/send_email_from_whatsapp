package dev.gerardomarquez.sendEmailFromWhatsapp.responses;

import java.io.Serializable;

import lombok.Data;

/*
 * Clase de respuesta del servicio REST generica
 */
@Data
public class Response<T> implements Serializable {

    /*
     * Si el proceso fue exitoso o no
     */
    private Boolean success;

    /*
     * Mensaje de exito o error
     */
    private String message;

    /*
     * Objeto de respuesta
     */
    private T data;

    /*
     * Constructor obligando al programador a llenar todos los campos
     * @param success Si el proceso fue exitoso
     * @param message Mensaje de exito o error
     * @param data Objeto de respuesta
     */
    public Response(Boolean success, String message, T data){
        this.success = success;
        this.message = message;
        this.data = data;
    }
}
