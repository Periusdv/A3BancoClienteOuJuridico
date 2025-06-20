package testes;

import aula.AulaServico;
import aula.PessoaJuridica;
import aula.PessoaFisica;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAulaServico {
    
    @Test
    public void testCriarPessoaJuridicaComContas() {
        AulaServico aulaservico = new AulaServico();
        PessoaJuridica pessoajuridica = aulaservico.criarPessoaJuridica("Bob", "12345678000100", 1, true, 5000.0, true, 0.02);
        
        assertEquals("Bob", pessoajuridica.getNome());
        assertEquals(2, pessoajuridica.getListaContas().size());
    }
    
    @Test
    public void testCriarPessoaFisicaSemContas() {
        AulaServico aulaservico = new AulaServico();
        PessoaFisica pessoafisica = aulaservico.criarPessoaFisica("Claudia", "12345678900", 2, false, 0.0, false, 0.0);
        
        assertEquals("Claudia", pessoafisica.getNome());
        assertEquals(0, pessoafisica.getListaContas().size());
    }
}