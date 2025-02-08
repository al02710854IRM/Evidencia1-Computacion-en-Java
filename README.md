### **Explicación del Contenido**

1. **Instalación y Configuración:**
       ## Requisitos
    1. **Java Development Kit (JDK) 8 o superior.**
    2. **Git** (para clonar y gestionar el repositorio).
    3. **Terminal o línea de comandos** (para ejecutar comandos).
    
    ---
    
    ## Pasos para Clonar, Compilar y Ejecutar
    
    1. **Clonar el Repositorio:**
       - Abre una terminal y ejecuta:
         ```
         git clone https://github.com/al02710854IRM/Evidencia1-Computacion-en-Java.git
         cd Evidencia1-Computacion-en-Java
         ```
    
    2. **Compilar el Proyecto:**
       - Navega al directorio del proyecto y compila los archivos Java:
         ```
         javac *.java
         ```
    
    3. **Ejecutar el Programa:**
       - Ejecuta la clase principal (`Main`):
         ```
         java Main
         ```
    
    ---
    
    ## Trabajar sobre las Dos Versiones (Ramas `master` y `develop`)
    
    ### 1. Cambiar a la Rama `develop`
       - Para trabajar en la versión de desarrollo, cambia a la rama `develop`:
         ```
         git checkout develop
         ```
    
    ### 2. Crear una Nueva Rama de Funcionalidad
       - Crea una rama para una nueva funcionalidad (por ejemplo, `crear_cita`):
         ```
         git checkout develop
         git branch crear_cita
         git checkout crear_cita
         ```
    
    ### 3. Hacer Cambios y Commits
       - Realiza los cambios necesarios en la rama de funcionalidad.
       - Añade los cambios y haz un commit:
         ```
         git add .
         git commit -m "Implementada funcionalidad de crear cita"
         ```
    
    ### 4. Fusionar con `develop`
       - Fusiona la rama de funcionalidad con `develop`:
         ```
         git checkout develop
         git merge crear_cita
         ```
    
    ### 5. Cambiar a la Rama `master`
       - Para trabajar en la versión estable, cambia a la rama `master`:
         ```
         git checkout master
         ```
    
    ### 6. Fusionar `develop` con `master`
       - Cuando `develop` esté lista para producción, fusiona los cambios en `master`:
         ```
         git checkout master
         git merge develop
         ```
    
    ### 7. Crear un Tag para la Versión Estable
       - Crea un tag para marcar la versión estable (por ejemplo, `v1.0`):
         ```
         git tag v1.0
         git push origin v1.0
         ```
    
    ### 8. Subir Cambios al Repositorio Remoto
       - Sube todas las ramas al repositorio remoto:
         ```
         git push origin master
         git push origin develop
         git push origin crear_cita

2. **Uso y Funciones del Programa:**
   - El programa simula un sistema de administración de citas médicas, permitiendo registrar 1 doctor, paciente y crear cita asociada sin el uso de archivos de texto externos.

      Funcionalidades:
      - Registrar un Doctor (ID, Nombre, Especialidad).
      - Registrar un Paciente (ID, Nombre).
      - Crear una Cita (ID, Fecha y Hora, Motivo, Doctor, Paciente).
      - Mostrar información de registros.
      
      Estructura del Proyecto:
      - Doctor.java: Clase para registrar doctores.
      - Paciente.java: Clase para registrar pacientes.
      - Cita.java: Clase que almacena datos de la cita.
      - SistemaCitas.java: Gestiona la lógica del sistema.
      - Main.java: Punto de entrada del programa.
      
      Cómo Usarlo:
      1. Ejecutar Main.java.
      2. Ingresar datos que solicita el sistema.
      3. Se muestra la información registrada.
      

3. **Créditos:**
   - Este proyecto fue desarrollado en el contexto académico para la Universidad TecMilenio

4. **Licencia:**
   - No se requiere licencia para usar, modificar o distribuir el proyecto. (IDE recomendado: IntelliJ IDEA Comunnity)
