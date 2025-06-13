package contas;

import agencia.Agencia;
import pessoas.Pessoa;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numConta, Pessoa titular, Agencia agencia) {
        super(numConta, titular, agencia);
    }
    
    @Override
    public String getTipoConta() {
        return "Conta Poupança";
    }
}
