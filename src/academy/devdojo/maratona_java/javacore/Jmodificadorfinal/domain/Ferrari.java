package academy.devdojo.maratona_java.javacore.Jmodificadorfinal.domain;

public class Ferrari {
    Carro carro = new Carro();

    public void imprime(){
        System.out.println(getCarro());
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
