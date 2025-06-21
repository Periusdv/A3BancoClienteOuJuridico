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
public class ContaCorrente extends Conta {

    private double salario;
    private static final Logger LOGGER = Logger.getLogger(ContaCorrente.class.getName());

    public ContaCorrente(int numero, double salario, Agencia agencia) {
        super(numero, agencia);
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        if (LOGGER.isLoggable(Level.INFO)) {
            LOGGER.info(String.format(
                    "=== Conta Corrente ===%nNúmero: %d%nAgência: %d%nSalário: R$ %.2f%nSaldo atual: R$ %.2f", 
                    getNumero(), 
                    getAgencia().getNumero(), 
                    this.salario, 
                    getSaldo()));
        }
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
