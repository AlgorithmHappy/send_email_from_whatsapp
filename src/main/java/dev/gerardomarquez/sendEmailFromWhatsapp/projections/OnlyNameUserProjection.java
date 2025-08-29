package dev.gerardomarquez.sendEmailFromWhatsapp.projections;

/*
 * Proyeccion para devolver solo el nombre de usuario en el repositorio de los usuarios
 */
public interface OnlyNameUserProjection {

    /*
     * Devuelve solo el nombre completo de la entidad AllowNamesUsersEntity
     */
    public String getFullName();
}
