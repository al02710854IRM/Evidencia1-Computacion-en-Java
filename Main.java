import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaCitas sistema = new SistemaCitas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Sistema de Citas Médicas");

        // Registrar Doctor
        System.out.println("\nRegistrar Doctor:");
        System.out.print("ID del Doctor: ");
        String idDoctor = scanner.nextLine();
        System.out.print("Nombre del Doctor: ");
        String nombreDoctor = scanner.nextLine();
        System.out.print("Especialidad del Doctor: ");
        String especialidadDoctor = scanner.nextLine();
        sistema.registrarDoctor(idDoctor, nombreDoctor, especialidadDoctor);

        // Registrar Paciente
        System.out.println("\nRegistrar Paciente:");
        System.out.print("ID del Paciente: ");
        String idPaciente = scanner.nextLine();
        System.out.print("Nombre del Paciente: ");
        String nombrePaciente = scanner.nextLine();
        sistema.registrarPaciente(idPaciente, nombrePaciente);

        // Crear Cita
        System.out.println("\nCrear Cita:");
        System.out.print("ID de la Cita: ");
        String idCita = scanner.nextLine();
        System.out.print("Fecha y Hora (YYYY-MM-DD HH:MM): ");
        String fechaHora = scanner.nextLine();
        System.out.print("Motivo de la Cita: ");
        String motivo = scanner.nextLine();
        sistema.crearCita(idCita, fechaHora, motivo);

        // Mostrar Información
        System.out.println("\nInformación del Sistema:");
        sistema.mostrarInformacion();

        scanner.close();
    }
}