/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samara
 */
public class ContaPoupanca extends Conta {

    private double rendimento;
    private static final Logger LOGGER = Logger.getLogger(ContaPoupanca.class.getName());

    public ContaPoupanca(int numero, double rendimento, Agencia agencia) {
        super(numero, agencia);
        this.rendimento = rendimento;
    }

    @Override
    public void imprimir() {
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info(String.format(
                    "=== Conta Poupança ===%nNúmero: %d%nAgência: %d%nRendimento: R$ %.2f%nSaldo atual: R$ %.2f",
                    getNumero(), 
                    getAgencia().getNumero(), 
                    this.rendimento, 
                    getSaldo()));
        }
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
