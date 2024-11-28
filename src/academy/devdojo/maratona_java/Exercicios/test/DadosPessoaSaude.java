package academy.devdojo.maratona_java.Exercicios.test;

import academy.devdojo.maratona_java.Exercicios.domain.HealfProfile;

public class DadosPessoaSaude {
    public static void main(String[] args) {
        HealfProfile p1 = new HealfProfile("Rafael", 'M', 4, 12, 2003,1.63, 57);

        System.out.println("Nome: "+p1.getNome());
        System.out.println("Sexo: "+p1.getSexo());
        System.out.println("Data nacimento: "+p1.getDia()+"/"+p1.getMes()+"/"+p1.getAno());
        System.out.println("Idade: "+p1.idade());
        System.out.println("Altura: "+p1.getAltura());
        System.out.println("Peso: "+ p1.getPeso());
        System.out.printf("O IMC da pessoa %s é %.2f\n", p1.getNome(), p1.calculoIMC());
        System.out.println("A frequemcia cardiaca é " + p1.frequenciaCardiacaMax());
        p1.frequenciaCardiacaAlvo();
    }
}
