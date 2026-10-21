public class Main {
    public static void main(String[] args) {
        Pedido pedidoFrete = new Pedido(180.0, 4.5, 35.0, new Jadlog());
        System.out.println("Pedido com Jadlog: R$ " + pedidoFrete.calcularTotal());

        pedidoFrete.definirFrete(new Correios());
        System.out.println("Pedido com Correios: R$ " + pedidoFrete.calcularTotal());

        pedidoFrete.definirFrete(new Loggi());
        System.out.println("Pedido com Loggi: R$ " + pedidoFrete.calcularTotal());

        pedidoFrete.definirFrete(new JTExpress());
        System.out.println("Pedido com J&T Express: R$ " + pedidoFrete.calcularTotal());
    }
}
