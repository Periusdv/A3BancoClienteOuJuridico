package contas;

import agencia.Agencia;
import pessoas.Pessoa;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String numConta, Pessoa titular, Agencia agencia) {
        super(numConta, titular, agencia);
    }
    
    @Override
    public String getTipoConta() {
        return "Conta Corrente";
    }
}
