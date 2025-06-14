/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.ArrayList;

/**
 *
 * @author samara
 */
public class PessoaFisica extends Pessoa {

    private String cpf;

    PessoaFisica(String nome, ArrayList<Conta> listacontas, String cpf) {
        super(nome, listacontas);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
