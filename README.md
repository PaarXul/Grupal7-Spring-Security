# README - Proyecto con Spring Boot, Angular y Tecnologías Relacionadas

Este README proporciona una descripción general del proyecto y los pasos necesarios para configurar y ejecutar la aplicación basada en tecnologías como Spring Boot, Angular, Spring Security, Spring Data JPA, Lombok y MySQL.

## Descripción del Proyecto

El objetivo de este proyecto es crear una aplicación web utilizando las tecnologías mencionadas anteriormente. La aplicación consta de un backend construido con Spring Boot que utiliza Spring Security para la autenticación y autorización de usuarios, Spring Data JPA para la interacción con la base de datos MySQL, y Lombok para simplificar la generación de código repetitivo. El frontend está desarrollado en Angular para crear una interfaz de usuario interactiva y atractiva.

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes componentes:

- Java Development Kit (JDK)
- Node.js y npm (Node Package Manager)
- Angular CLI
- MySQL Server
- Git

## Configuración

Sigue estos pasos para configurar el proyecto en tu máquina local:

1. Clona este repositorio en tu máquina local utilizando el siguiente comando:

   ```bash
   git clone https://github.com/tu_usuario/tu_repositorio.git

## 1. Backend (Spring Boot):

- Abrir la carpeta del proyecto backend en tu IDE favorito compatible con Java y Spring Boot.
- Configurar la conexión a la base de datos MySQL en src/main/resources/application.properties.
- Ejecutar la aplicación Spring Boot.


## 2. Frontend (Angular):
- Abrir la carpeta del proyecto frontend en tu terminal.
- Instalar las dependencias utilizando el comando: npm install
- Configurar la URL base para la comunicación con el backend en src/environments/environment.ts.
- Iniciar el servidor de desarrollo de Angular con: ng serve


## Uso
Una vez que hayas configurado correctamente el proyecto, accede a la aplicación en tu navegador usando: http://localhost:4200.
La aplicación te presentará la interfaz de usuario desarrollada en Angular, permitiéndote interactuar con el backend construido en Spring Boot.

## Contribución
Si deseas contribuir al proyecto, sigue estos pasos:

- Hacer un fork de este repositorio.
- Clonar tu fork en tu máquina local.
- Crear una nueva rama para tu función o corrección: git checkout -b nueva-funcion
- Realizar tus modificaciones y commits: git commit -m "Agregada nueva función"
- Subir tus cambios a tu fork: git push origin nueva-funcion
- Crear un Pull Request en este repositorio.

## Licencia
Este proyecto está bajo la Licencia XYZ. Consultar el archivo LICENSE para más información.
