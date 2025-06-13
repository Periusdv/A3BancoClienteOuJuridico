package agencia;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Agencia> agencias = new ArrayList<>();
    
    public Banco() {
        agencias.add(new Agencia(101, "Centro"));
        agencias.add(new Agencia(202, "Zona Sul"));
        agencias.add(new Agencia(302, "Zona Norte"));
    }
    
    public List<Agencia> getAgencias() {
        return agencias;
    }
    
    public Agencia buscaAgenciaNum(int num) {
        for (Agencia ag : agencias) {
            if(ag.getNumero() == num) return ag;
        }
        return null;
    } 
}
