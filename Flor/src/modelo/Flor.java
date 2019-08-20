/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Flor {
    private int codigo;
    private int ano;
    private String nome_cientifico;
    private String nome_popular;
    private Double tamanho_petala;
    private Double tamanho_sepala;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome_cientifico() {
        return nome_cientifico;
    }

    public void setNome_cientifico(String nome_cientifico) {
        this.nome_cientifico = nome_cientifico;
    }

    public String getNome_popular() {
        return nome_popular;
    }

    public void setNome_popular(String nome_popular) {
        this.nome_popular = nome_popular;
    }

    public Double getTamanho_petala() {
        return tamanho_petala;
    }

    public void setTamanho_petala(Double tamanho_petala) {
        this.tamanho_petala = tamanho_petala;
    }

    public Double getTamanho_sepala() {
        return tamanho_sepala;
    }

    public void setTamanho_sepala(Double tamanho_sepala) {
        this.tamanho_sepala = tamanho_sepala;
    }

    

    @Override
    public String toString() {
        return nome_popular;
    }
}
