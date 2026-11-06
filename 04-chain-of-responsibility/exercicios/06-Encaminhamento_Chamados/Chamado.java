public class Chamado {
    private final String protocolo;
    private final String assunto;
    private final String categoria;

    public Chamado(String protocolo, String assunto, String categoria) {
        this.protocolo = protocolo;
        this.assunto = assunto;
        this.categoria = categoria;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getCategoria() {
        return categoria;
    }
}
