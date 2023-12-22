
# Appium Automation

Este repositorio contiene el código para una automatización móvil básica. La automatización se puede usar para probar una aplicación móvil en diferentes dispositivos y versiones del sistema operativo.

# Prerrequisitos

Para usar esta automatización, necesitarás lo siguiente:

- Un dispositivo móvil o un emulador/simulador
- Una computadora con Java JDK 8 o superior
- Maven

# Instalación

Para instalar la automatización, sigue estos pasos:

Clona el repositorio:
- git clone https://github.com/<tu_nombre>/<nombre_del_repositorio>
Cambia al directorio del proyecto:
- cd <nombre_del_proyecto>
Genera el archivo de configuración:
- mvn clean install
Este comando generará un archivo llamado configuration.properties en el directorio src/main/resources. El archivo configuration.properties contiene las configuraciones para la automatización, como los dispositivos y las versiones del sistema operativo que se van a probar.

# Uso

Para ejecutar la automatización, sigue estos pasos:

Configura las propiedades de la automatización en el archivo configuration.properties.
Ejecuta el siguiente comando:
- mvn clean test
Este comando ejecutará la automatización contra todos los dispositivos y versiones del sistema operativo configurados.

# Estructura del proyecto

El proyecto está organizado basado en el patron de diseño POM:

- src/main/java: Contiene el código fuente de la automatización.
- src/main/resources: Contiene el archivo de configuración configuration.properties.
- test/java: Contiene las pruebas unitarias para la automatización.

# Pruebas unitarias

El proyecto incluye pruebas unitarias para probar la automatización. Las pruebas unitarias se pueden ejecutar con el siguiente comando:

- mvn test

# Documentación

La documentación de la automatización se encuentra en el archivo README.md.

