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
public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(String nome, ArrayList<Conta> listacontas, String cnpj) {
        super(nome, listacontas);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
