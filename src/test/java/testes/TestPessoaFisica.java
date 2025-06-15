package testes;

import aula.Agencia;
import aula.Conta;
import aula.ContaCorrente;
import aula.PessoaFisica;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPessoaFisica {

    @Test
    public void testConstrutorPessoaFisica() {
        Agencia agencia = new Agencia(1);
        ContaCorrente conta = new ContaCorrente(123, 2500.0, agencia);
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(conta);

        PessoaFisica pessoaFisica = new PessoaFisica("Pedro", contas, "123.456.789-00");

        assertEquals("Pedro", pessoaFisica.getNome());
        assertEquals("123.456.789-00", pessoaFisica.getCpf());
        assertEquals(contas, pessoaFisica.getListaContas());
    }
}
