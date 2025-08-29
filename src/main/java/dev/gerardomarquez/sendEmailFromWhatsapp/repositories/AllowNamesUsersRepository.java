package dev.gerardomarquez.sendEmailFromWhatsapp.repositories;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.gerardomarquez.sendEmailFromWhatsapp.entities.AllowNamesUsersEntity;
import dev.gerardomarquez.sendEmailFromWhatsapp.projections.OnlyNameUserProjection;

/*
 * Repositorio que se conecta a la base de datos para la tabla "AllowNamesUsersEntity"
 */
@Repository
public interface AllowNamesUsersRepository extends JpaRepository<AllowNamesUsersEntity, UUID> {
    /*
     * Devuelve la pagina de todos los usuarios
     * @param pageable Parametros de paginado
     */
    public Page<OnlyNameUserProjection> findAllBy(Pageable pageable);
}

