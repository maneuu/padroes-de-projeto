public class Personagem {
    private EstadoPersonagem estado;

    public Personagem() {
        this.estado = new Parado();
        estado.exibirStatus();
    }

    public void avancar() {
        // "this" representa este personagem, que solicitou a mudanca de estado.
        // O estado atual recebe o contexto para decidir a proxima acao.
        estado.avancar(this);
    }

    public void definirEstado(EstadoPersonagem estado) {
        this.estado = estado;
        estado.exibirStatus();
    }
}
