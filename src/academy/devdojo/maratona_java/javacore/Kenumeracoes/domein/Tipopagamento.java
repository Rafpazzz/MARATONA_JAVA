package academy.devdojo.maratona_java.javacore.Kenumeracoes.domein;

public enum Tipopagamento {
    DEBITO{
        @Override
        public double calcular_desconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcular_desconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcular_desconto(double valor);


}