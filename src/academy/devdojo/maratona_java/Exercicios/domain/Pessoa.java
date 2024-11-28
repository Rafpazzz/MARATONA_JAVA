package academy.devdojo.maratona_java.Exercicios.domain;


import java.util.Calendar;

public class Pessoa {
    private String nome;
    private double altura;
    private char sexo;
    private int dia;
    private int mes;
    private int ano;
    Calendar data = Calendar.getInstance();

    public Pessoa(String nome, double altura, char sexo) {
        this.nome = nome;
        this.altura = altura;
        this.sexo = sexo;
    }

    public Pessoa(int dia, int mes, int ano, String nome) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nome = nome;
    }

    public int idade() {
        int idadePessoa = 0;
        idadePessoa = data.get(Calendar.YEAR) - getAno();

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

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public char getSexo() {
        return sexo;
    }

    public int getDia() {
        return dia;
    }


    public int getMes() {
        return mes;
    }


    public int getAno() {
        return ano;
    }

}
