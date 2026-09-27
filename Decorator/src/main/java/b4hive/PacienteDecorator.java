package b4hive;

public abstract class PacienteDecorator implements IPaciente {
    protected IPaciente paciente;
    public PacienteDecorator(IPaciente paciente) { this.paciente = paciente; }
    @Override
    public abstract String getInfo();
}
