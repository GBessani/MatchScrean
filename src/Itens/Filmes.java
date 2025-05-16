package Itens;

import java.io.InputStream;

public class Filmes {
    private String nomeDoFilme;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double notaDaCritica;
    private double notaDoExpectador;
    private double notaMedia;
    private int estrelas;
    public String sinopse;

    public double getNotaMedia() {
        notaMedia =  (getNotaDaCritica() + getNotaDoExpectador())/2;
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getEstrelas() {
        estrelas =  (int)(getNotaMedia()/2);
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public Filmes(String nomeDoFilme, int anoDelancamento, boolean incluidoNoPlano, double notaDaCritica, double notaDoExpectador) {

        this.nomeDoFilme = nomeDoFilme;
        this.anoDelancamento = anoDelancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.notaDaCritica = notaDaCritica;
        this.notaDoExpectador = notaDoExpectador;
    }

    public Filmes(InputStream in) {
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public int getAnoDelancamento() {
        return anoDelancamento;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public double getNotaDaCritica() {
        return notaDaCritica;
    }

    public void setNotaDaCritica(double notaDaCritica) {
        this.notaDaCritica = notaDaCritica;
    }

    public double getNotaDoExpectador() {
        return notaDoExpectador;
    }

    public void setNotaDoExpectador(double notaDoExpectador) {
        this.notaDoExpectador = notaDoExpectador;
    }

};
