package academy.devdojo.maratona_java.javacore.Kenumeracoes.domein;
//explicando o provblema de ter que especificar o uso de uma determinnada string, em um sistema de clientes.

public class Cliente {

    private String nome;
    private TipoCliente tipo_cliente;
    private Tipopagamento tipopagamento;

    public Cliente(String nome, TipoCliente tipo_cliente, Tipopagamento tipopagamento) {
        this.nome = nome;
        this.tipo_cliente = tipo_cliente;
        this.tipopagamento = tipopagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome= '" + nome + '\'' +
                ", tipo_cliente= " + tipo_cliente +
                ", tipo_clienteInt= " + tipo_cliente.VALOR +
                ", tipopagamento= " + tipopagamento +
                '}';
    }
}









 /*

    public Cliente(String nome, TipoCliente tipo_cliente) {
        this.nome = nome;
        this.tipo_cliente = tipo_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo_cliente=" + tipo_cliente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(TipoCliente tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    private String tipo;
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";
    public Cliente(String nome, String tipo) {
        if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)) {
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    } */