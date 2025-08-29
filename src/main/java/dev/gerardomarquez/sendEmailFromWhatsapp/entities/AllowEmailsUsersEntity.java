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
@Table(name = "allow_emails_users")
@Comment("Tabla que almacena los correos electronicos que pueden enviar correos a partir del mensaje de whatsapp recivido")
@NoArgsConstructor
@Data
public class AllowEmailsUsersEntity {

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

    @Column(name = "auth", nullable = false)
    @Comment("Columna que indica si activa la autenticación SMTP. El servidor requerirá usuario y contraseña para enviar correos")
    private Boolean auth;

    @Column(name = "ttls_enable", nullable = false)
    @Comment("Columna que habilita o deshabilita el protocolo STARTTLS, que permite cifrar la conexión SMTP usando TLS")
    private Boolean ttlsEnable;

    @Column(name = "ttls_required", nullable = false)
    @Comment("Columna que habilita o deshabilita la obligación de la conexión SMTP que use STARTTLS. Si el servidor no soporta STARTTLS, la conexión falla")
    private Boolean ttlsRequired;

    @Column(name = "ssl_trus", nullable = false)
    @Comment("Dominio el que deberia confíar en el certificado SSL")
    private String sslTrust;

    @ManyToOne
    @JoinColumn(name = "allow_name_user_id", nullable = false)
    @Comment("Columna que relaciona al usuario")
    private AllowNamesUsersEntity allowNameUserId;
}
