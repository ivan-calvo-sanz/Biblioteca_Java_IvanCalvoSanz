package _40_BBDD;

/*
    *************************************************************
    PHPMyAdmin / MySQL - GUÍA DE CONFIGURACIÓN Y CREACIÓN DE BBDD
    *************************************************************

    *************************************************************
    PASOS PRIMERA INSTALACIÓN
    *************************************************************

    Antes de poder entrar en http://localhost/phpmyadmin necesitas:
    1. Instalar un paquete tipo XAMPP, XAMPP incluye:
       - Servidor web (Apache)
       - MariaDB
       - PHP
       - phpMyAdmin
    
    1. Para trabajar con el editor MySQL Workbench hay que instalar MySQL Server (Oracle)

    2. Instalar siguiendo los pasos por defecto. No cambies opciones si no estás seguro.

    3. Arrancar los servicios desde el Panel de Control:
       - Apache → servidor web
       - MySQL → base de datos
       Ambos deben estar activos (verde)

    4. Abrir el navegador y entrar en:
       http://localhost/phpmyadmin
       - Usuario: root
       - Contraseña: vacía por defecto en XAMPP (puedes cambiarla luego)
       ⚠️ Si no arrancas Apache o MySQL, phpMyAdmin no funcionará.

    5. Problemas comunes:
       - Puerto 80 ocupado por otro programa → Apache no arranca
       - Contraseña de root diferente a la que uses en Java → modificar Java o MySQL

    *************************************************************
    PASOS PARA CREAR LA BASE DE DATOS Y TABLA EMPLEADOS
    *************************************************************

    1. Crear la base de datos
       - Menú superior -> "Bases de datos"
       - Nombre: empleados_departamentos
       - Cotejamiento: utf8_general_ci
       - Pulsar "Crear"

    2. Entrar en la base de datos
       - Columna izquierda -> empleados_departamentos

    3. Crear la tabla EMPLEADOS
       - Nombre tabla: EMPLEADOS
       - Número de columnas: 2
       - Pulsar "Continuar"

    4. Definir las columnas
       Columna 1:
          - Nombre: idemp
          - Tipo: INT
          - Longitud: 11
          - Índice: PRIMARY
          - Auto Increment: ✔
       Columna 2:
          - Nombre: nomemp
          - Tipo: VARCHAR
          - Longitud: 50
          - Nulo: ❌ (No permitir nulos)
       - Pulsar "Guardar"

    5. Insertar datos de prueba
       - Seleccionar tabla EMPLEADOS -> "Insertar"
       - Introducir registros:
          nomemp: Juan
          nomemp: María
          nomemp: Pedro
          nomemp: Lucía
       - Pulsar "Continuar" o "Guardar"

    6. Comprobar datos
       - Pulsar "Examinar" en la tabla EMPLEADOS
       - Deben aparecer todos los registros insertados

    *************************************************************
    USUARIO Y CONTRASEÑA POR DEFECTO EN MySQL
    *************************************************************

    Si instalaste XAMPP:
    Usuario: root
    Contraseña: vacía (ninguna)
 */
