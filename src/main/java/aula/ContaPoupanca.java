/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

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
        LOGGER.info(String.format("Seu rendimento é: %.2f", this.rendimento));
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
