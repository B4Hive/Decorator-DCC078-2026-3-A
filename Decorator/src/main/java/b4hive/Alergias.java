package b4hive;

public class Alergias extends PacienteDecorator {
    public Alergias(IPaciente paciente) { super(paciente); }
    @Override
    public String getInfo() { return paciente.getInfo() + " - Alergias"; }
}
