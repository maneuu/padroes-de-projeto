public class Main {
    public static void main(String[] args) {
        Desconto desconto5 = new Desconto5();
        Desconto desconto10 = new Desconto10();
        Desconto desconto20 = new Desconto20();

        // Fluxo: desconto de 5% -> desconto de 10% -> desconto de 20%.
        desconto5.definirProximo(desconto10);
        desconto10.definirProximo(desconto20);

        // Menos de R$ 500,00 recebe 5%.
        desconto5.aplicar(new Pedido("Pedido pequeno", 300.00));

        // De R$ 500,00 até menos de R$ 1.000,00 recebe 10%.
        desconto5.aplicar(new Pedido("Pedido medio", 700.00));

        // A partir de R$ 1.000,00 recebe 20%.
        desconto5.aplicar(new Pedido("Pedido grande", 1500.00));
    }
}
