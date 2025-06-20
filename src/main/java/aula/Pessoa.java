/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.List;

/**
 *
 * @author samara
 */
public abstract class Pessoa {

    private String nome;
    private List<Conta> listacontas;

    protected Pessoa(String nome, List<Conta> listacontas) {
        this.nome = nome;
        this.listacontas = listacontas;
    }

    public List<Conta> getListaContas() {
        return this.listacontas;
    }

    public void setListaContas(Conta conta) {
        this.listacontas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
