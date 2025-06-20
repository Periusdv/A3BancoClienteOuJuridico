package testes;

import aula.Agencia;
import aula.Conta;
import aula.ContaCorrente;
import aula.PessoaJuridica;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class TestPessoaJuridica {
    
    @Test
    void testConstrutorPessoaJuridica() {
        Agencia agencia = new Agencia(1);
        ContaCorrente conta = new ContaCorrente(111, 5000, agencia);
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(conta);
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Amanda", contas, "12.345.678/0000-00");
        
        assertEquals("Amanda", pessoaJuridica.getNome());
        assertEquals(contas, pessoaJuridica.getListaContas());
        assertEquals("12.345.678/0000-00", pessoaJuridica.getCnpj());
    }
    
    @Test
    void testSetCnpj() {
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Amanda", new ArrayList<>(), "00.000.000/0000-00");
        
        pessoaJuridica.setCnpj("12.345.678/0000-00");
        assertEquals("12.345.678/0000-00", pessoaJuridica.getCnpj());
    }
}
