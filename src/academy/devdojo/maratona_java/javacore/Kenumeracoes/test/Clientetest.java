package academy.devdojo.maratona_java.javacore.Kenumeracoes.test;

import academy.devdojo.maratona_java.javacore.Kenumeracoes.domein.Cliente;
import academy.devdojo.maratona_java.javacore.Kenumeracoes.domein.TipoCliente;
import academy.devdojo.maratona_java.javacore.Kenumeracoes.domein.Tipopagamento;

public class Clientetest {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Rafael", TipoCliente.PESSOA_FISICA, Tipopagamento.CREDITO);
        Cliente cliente02 = new Cliente("Paz", TipoCliente.PESSOA_FISICA, Tipopagamento.CREDITO);
        Cliente cliente03 = new Cliente("Paz", TipoCliente.PESSOA_JURIDICA, Tipopagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(Tipopagamento.DEBITO.calcular_desconto(100));
        TipoCliente tipocliente =  TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipocliente.getNomeRelatiro());
        TipoCliente tipocliente2 = TipoCliente.TipoCLientePorNomeRelatorio("Pessoa_Fisica");
        System.out.println(tipocliente2);
    }
}
