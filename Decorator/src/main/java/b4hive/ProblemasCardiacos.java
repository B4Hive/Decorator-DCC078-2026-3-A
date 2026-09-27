package b4hive;

public class ProblemasCardiacos extends PacienteDecorator {
    public ProblemasCardiacos(IPaciente paciente) { super(paciente); }
    @Override
    public String getInfo() { return paciente.getInfo() + " - Problemas Cardiacos"; }
}
