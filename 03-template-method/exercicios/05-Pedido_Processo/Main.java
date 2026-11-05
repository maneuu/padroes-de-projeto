public class Main {
    public static void main(String[] args) {
        ProcessamentoPedido pedidoOnline = new PedidoOnline();
        ProcessamentoPedido pedidoLoja = new PedidoLoja();
        ProcessamentoPedido pedidoAssinatura = new PedidoAssinatura();

        System.out.println("Processando pedido online:");
        pedidoOnline.processarPedido();

        System.out.println();

        System.out.println("Processando pedido da loja:");
        pedidoLoja.processarPedido();

        System.out.println();

        System.out.println("Processando pedido de assinatura:");
        pedidoAssinatura.processarPedido();
    }
}
