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
@Table(name = "allow_phones_numbers")
@Comment("Tabla que almacena los numeros de telefono que pueden eviar y recivir correos electronicos desde el whatsapp")
@NoArgsConstructor
@Data
public class AllowPhonesNumbersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Comment("Columna de id para identificar uniquivocamente al numero de telefono")
    private UUID id;

    @Column(name = "phone_number", length = 13, nullable = false)
    @Comment("Columna que contiene el numero de telefono con el 521 y su lada por ejemplo 55")
    private String phoneNumber;

}
