package academy.devdojo.maratona_java.Exercicios.domain;

import java.util.Calendar;

public class HealfProfile {
    private String nome;
    private char sexo;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private double peso;



    public HealfProfile(String nome, char sexo, int dia, int mes, int ano, double altura, double peso) {
        this.nome = nome;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
    }

    public int idade() {
        Calendar data = Calendar.getInstance();
        int idadePessoa = data.get(Calendar.YEAR) - getAno();
        int mesAtual = data.get(Calendar.MONTH);
        int diaAtual = data.get(Calendar.DAY_OF_MONTH);

        if(mesAtual<getMes() || (mesAtual == getMes() && diaAtual<getDia())) {
            idadePessoa--;
        }

        return idadePessoa;
    }

    public int frequenciaCardiacaMax() {
        return 220 - idade();
    }

    public void frequenciaCardiacaAlvo() {
        int intervalo1 = 0;
        int intervalo2 = 0;

        intervalo1 = frequenciaCardiacaMax() * 50/100;
        intervalo2 = frequenciaCardiacaMax() * 85/100;

        System.out.println("A Frequencia cardiaca no intercvalo de 50% = "+ intervalo1);
        System.out.println("A Frequencia cardiaca no intercvalo de 85% = "+ intervalo2);
    }

    public double calculoIMC() {
        double valorIMC =  getPeso()/(getAltura()*getAltura());

        return valorIMC;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
