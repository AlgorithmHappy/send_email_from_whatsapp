package dev.gerardomarquez.sendEmailFromWhatsapp.responses;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/*
 * Response con paginacion
 */
@Data
@Builder
public class PageResponse<T> {

    /*
     * Lista con el contenido
     */
    private List<T> content;

    /*
     * Numero de pagina actual
     */
    private Integer pageNumber;

    /*
     * Tamaño de pagina actual
     */
    private Integer pageSize;

    /*
     * Cantidad total de todos los elementos
     */
    private Long totalElements;
}
