/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.sistemadenavegacao.model;

/**
 *
 * @author Gustavo
 */
public interface Navegacao {
    public Navegacao next();
    public void pesquisa(String pesquisa);
    public void addProximo(Navegacao prox);
}
