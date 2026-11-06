public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.enviar();
        pedido.pagar();
        pedido.pagar();
        pedido.enviar();
        pedido.enviar();
    }
}
