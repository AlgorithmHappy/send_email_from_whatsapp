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
@Table(name = "emails_users")
@Comment("Tabla que almacena los numeros de telefono que pueden eviar y recivir correos electronicos desde el whatsapp")
@NoArgsConstructor
@Data
public class EmailsUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Comment("Columna de id para identificar uniquivocamente al correo del usuario")
    private UUID id;

    @Column(name = "email", length = 40, nullable = false)
    @Comment("Columna que contiene el correo electronico desde donde se va enviar")
    private String email;

    @Column(name = "key", length = 256, nullable = true)
    @Comment("Columna de contraseña o token o key para poder enviar correos electronicos")
    private String key;

    @Column(name = "level_priority", nullable = false)
    @Comment("Columna que indica el nivel de prioridad si el usuario no manda desde que correo se va envia el correo, no puede haber un numero repetido por cada usuario")
    private Short levelPriority;

    @Column(name = "host", nullable = false)
    @Comment("Columna que indica el dominio del correo")
    private String host;

    @Column(name = "port", nullable = false)
    @Comment("Columna que indica el puerto que permite el envio del correo")
    private Short port;
}
