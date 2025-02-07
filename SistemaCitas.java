public class SistemaCitas {
    private Doctor doctor;
    private Paciente paciente;
    private Cita cita;

    public void registrarDoctor(String id, String nombre, String especialidad) {
        this.doctor = new Doctor(id, nombre, especialidad);
        System.out.println("Doctor registrado: " + doctor);
    }

    public void registrarPaciente(String id, String nombre) {
        this.paciente = new Paciente(id, nombre);
        System.out.println("Paciente registrado: " + paciente);
    }

    public void crearCita(String id, String fechaHora, String motivo) {
        if (doctor == null || paciente == null) {
            System.out.println("Error: Debe registrar un doctor y un paciente antes de crear una cita.");
            return;
        }
        this.cita = new Cita(id, fechaHora, motivo, doctor, paciente);
        System.out.println("Cita creada:\n" + cita);
    }

    public void mostrarInformacion() {
        if (doctor != null) {
            System.out.println(doctor);
        } else {
            System.out.println("No hay doctor registrado.");
        }

        if (paciente != null) {
            System.out.println(paciente);
        } else {
            System.out.println("No hay paciente registrado.");
        }

        if (cita != null) {
            System.out.println(cita);
        } else {
            System.out.println("No hay cita registrada.");
        }
    }
}
