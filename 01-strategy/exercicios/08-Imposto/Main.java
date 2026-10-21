public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1000.0, new ICMS());
        System.out.println("Com ICMS: R$ " + pedido.calcularValorComImposto());

        pedido.definirImposto(new ISS());
        System.out.println("Com ISS: R$ " + pedido.calcularValorComImposto());

        pedido.definirImposto(new PIS());
        System.out.println("Com PIS: R$ " + pedido.calcularValorComImposto());
    }
}
