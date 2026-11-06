public class Reembolso {
    private final String solicitante;
    private final String descricao;
    private final double valor;

    public Reembolso(String solicitante, String descricao, double valor) {
        this.solicitante = solicitante;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
