# Envio y recepcion de correos por Whatsapp (send_email_from_whatsapp)

Proyecto en el que se realizara un **Gateway** con **"Spring"** y **"Java"** para que se puedan enviar y recivir correos mediante whatsapp.
Por el momento solo se desarrollara para *Gmail*.

## Arquitectura

Se estara utilizando la herramienta de **"Evolution API** para la recepcion y envio de mensajes por whatsapp,
una base de datos en **"Postgresql"** que contendra la informacion de acceso a los correos, tambien, numeros de telefonos permitidos que podran enviar whatsapp.

**El diagrama es el siguiente**:

architecture-beta
    service db(database)[Correos y telefonos]
    service whatsapp(internet)[Recivir mensaje en Evolution API Whatasapp]
    service miservicio(server)[Mi servicio RESTfull API Spring]
    service email(internet)[Gmail]
    service whatsapp2(internet)[Enviar mensaje en Evolution API Whatsapp]

    whatsapp:R --> L:miservicio
    miservicio:T <--> B:db
    miservicio:B <--> T:email
    miservicio:R --> L:whatsapp2

## Flujo