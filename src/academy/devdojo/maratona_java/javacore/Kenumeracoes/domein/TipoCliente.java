package academy.devdojo.maratona_java.javacore.Kenumeracoes.domein;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa_Fisica"), PESSOA_JURIDICA(2, "Pessoa_Juridica");

    public final int VALOR;
    private String NomeRelatiro;

    TipoCliente(int VALOR, String NomeRelatorio) {
        this.VALOR = VALOR;
        this.NomeRelatiro = NomeRelatorio;
    }

    public static TipoCliente TipoCLientePorNomeRelatorio(String NomeRelatiro) {
        for (TipoCliente tipo_Cliete : values()) {
            if(tipo_Cliete.getNomeRelatiro().equals(NomeRelatiro)) {
                return tipo_Cliete;
            }
        }
        return null;
    }

    public String getNomeRelatiro() {
        return NomeRelatiro;
    }

    public void setNomeRelatiro(String nomeRelatiro) {
        NomeRelatiro = nomeRelatiro;
    }
}
