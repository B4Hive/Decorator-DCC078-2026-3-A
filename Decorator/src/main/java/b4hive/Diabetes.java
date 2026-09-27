package b4hive;

public class Diabetes extends PacienteDecorator {
    public Diabetes(IPaciente paciente) { super(paciente); }
    @Override
    public String getInfo() { return paciente.getInfo() + " - Diabetes"; }
}
