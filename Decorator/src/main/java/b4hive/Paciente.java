package b4hive;

public class Paciente implements IPaciente {
    private String info;
    public Paciente(String info) { this.info = info; }
    @Override
    public String getInfo() { return this.info; }
}