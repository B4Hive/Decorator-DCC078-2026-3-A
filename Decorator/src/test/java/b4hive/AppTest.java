package b4hive;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testPaciente() {
        IPaciente paciente = new Paciente("Paciente 1");
        assertTrue(paciente.getInfo().equals("Paciente 1"));
    }

    @Test 
    public void testPacienteComAlergias() {
        IPaciente paciente = new Alergias(new Paciente("Paciente 2"));
        assertTrue(paciente.getInfo().equals("Paciente 2 - Alergias"));
    }

    @Test 
    public void testPacienteComDiabetes() {
        IPaciente paciente = new Diabetes(new Paciente("Paciente 3"));
        assertTrue(paciente.getInfo().equals("Paciente 3 - Diabetes"));
    }

    @Test 
    public void testPacienteComProblemasCardiacos() {
        IPaciente paciente = new ProblemasCardiacos(new Paciente("Paciente 4"));
        assertTrue(paciente.getInfo().equals("Paciente 4 - Problemas Cardiacos"));
    }

    @Test
    public void testPacienteComAlergiasEDiabetes() {
        IPaciente paciente = new Diabetes(new Alergias(new Paciente("Paciente 5")));
        assertTrue(paciente.getInfo().equals("Paciente 5 - Alergias - Diabetes"));
    }

    @Test 
    public void testPacienteComAlergiasEDiabetesEProblemasCardiacos() {
        IPaciente paciente = new ProblemasCardiacos(new Diabetes(new Alergias(new Paciente("Paciente 6"))));
        assertTrue(paciente.getInfo().equals("Paciente 6 - Alergias - Diabetes - Problemas Cardiacos"));
    }

    @Test 
    public void testPacienteComProblemasCardiacosEDiabetesEAlergias() {
        IPaciente paciente = new Alergias(new Diabetes(new ProblemasCardiacos(new Paciente("Paciente 7"))));
        assertTrue(paciente.getInfo().equals("Paciente 7 - Problemas Cardiacos - Diabetes - Alergias"));
    }

    @Test 
    public void testPacienteComProblemasCardiacosEAlergiasEDiabetes() {
        IPaciente paciente = new Diabetes(new Alergias(new ProblemasCardiacos(new Paciente("Paciente 8"))));
        assertTrue(paciente.getInfo().equals("Paciente 8 - Problemas Cardiacos - Alergias - Diabetes"));
    }

}
