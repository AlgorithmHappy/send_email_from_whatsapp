package dev.gerardomarquez.sendEmailFromWhatsapp.entities;

import java.util.UUID;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "allow_names_users")
@Comment("Tabla que contiene los nombres de los familiares quepueden enviar correos desde su whatsapp")
@NoArgsConstructor
@Data
public class AllowNamesUsersEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Comment("Columna de id para identificar uniquivocamente al usuario")
    private UUID id;

    @Column(name = "full_name", length = 40, nullable = false)
    @Comment("Columna que contiene el nombre completo del familiar")
    private String fullName;
}
