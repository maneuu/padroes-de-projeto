public class Semaforo {
    private EstadoSemaforo estado;

    public Semaforo() {
        this.estado = new Vermelho();
        estado.exibirStatus();
    }

    public void avancar() {
        // "this" representa este semaforo, que solicitou a mudanca de estado.
        // O estado atual recebe o contexto para poder definir a proxima cor.
        estado.avancar(this);
    }

    public void definirEstado(EstadoSemaforo estado) {
        this.estado = estado;
        estado.exibirStatus();
    }
}
