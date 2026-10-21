public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho(250.0, new SemDesconto());
        System.out.println("Sem desconto: R$ " + carrinho.calcularValorFinal());

        carrinho.definirDesconto(new Desconto10Porcento());
        System.out.println("10% de desconto: R$ " + carrinho.calcularValorFinal());

        carrinho.definirDesconto(new Desconto20Porcento());
        System.out.println("20% de desconto: R$ " + carrinho.calcularValorFinal());

        carrinho.definirDesconto(new DescontoClienteVIP());
        System.out.println("Cliente VIP: R$ " + carrinho.calcularValorFinal());
    }
}
