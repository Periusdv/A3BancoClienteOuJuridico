package contas;

import agencia.Agencia;
import pessoas.Pessoa;

public abstract class ContaBancaria {
    protected String numConta;
    protected double saldo;
    protected Pessoa titular;
    protected Agencia agencia;
    
    public ContaBancaria(String numConta, Pessoa titular, Agencia agencia) {
        this.numConta = numConta;
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = 0.0;
    }
    
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public abstract String getTipoConta();
    
    public void exibirInformacoes() {
        System.out.println("Tipo de Conta: " + getTipoConta());
        System.out.println("Titular: " + titular.getNome() + " (" + titular.getTipoPessoa() + ")" );
        System.out.println("Documento: " + titular.getNumDocumento());
        System.out.println("Agência: " + agencia.getNome());
        System.out.println("Número da Conta " + numConta);
        System.out.println("Saldo R$ " + saldo);
    }
}
