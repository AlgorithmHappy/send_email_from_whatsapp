package dev.gerardomarquez.sendEmailFromWhatsapp.entities;

import java.util.UUID;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "allow_emails_answers")
@Comment("Tabla que almacena los correos electronicos que de los que se pueden recivir mensajes de whatsapp")
@NoArgsConstructor
@Data
public class AllowEmailsAnswersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Comment("Columna de id para identificar uniquivocamente al correo del usuario")
    private UUID id;

    @Column(name = "email", length = 40, nullable = false)
    @Comment("Columna que contiene el correo electronico desde el que se puede recivir mensajes de whatsapp")
    private String email;

    @ManyToOne
    @JoinColumn(name = "allow_name_user_id", nullable = false)
    @Comment("Columna que relaciona al usuario")
    private AllowNamesUsersEntity allowNameUserId;
}
