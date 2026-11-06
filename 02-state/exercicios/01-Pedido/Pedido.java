public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        this.estado = new Pendente();
        estado.exibirStatus();
    }

    public void pagar() {
        estado.pagar(this);
    }

    public void enviar() {
        estado.enviar(this);
    }

    public void definirEstado(EstadoPedido estado) {
        this.estado = estado;
        estado.exibirStatus();
    }
}
