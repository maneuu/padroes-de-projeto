public class Contexto {
    private Estado estado;

    public Contexto() {
        this.estado = new EstadoConcretoA();
        estado.exibirStatus();
    }

    public void operar() {
        // "this" representa este contexto, que solicitou a operacao.
        // O estado atual recebe o contexto para poder trocar seu estado.
        estado.operar(this);
    }

    public void definirEstado(Estado estado) {
        this.estado = estado;
        estado.exibirStatus();
    }
}
