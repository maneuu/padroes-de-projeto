public class Main {
    public static void main(String[] args) {
        Frete loggi = new Loggi();
        Frete jadlog = new Jadlog();
        Frete correios = new Correios();
        Frete jtExpress = new JTExpress();

        // Fluxo: Loggi -> Jadlog -> Correios -> J&T Express.
        // J&T Express é o último da cadeia sem condição de parada, então ele sempre será chamado caso nenhum outro frete seja aplicável.
        loggi.definirProximo(jadlog)
                .definirProximo(correios)
                .definirProximo(jtExpress);

        loggi.calcular(new Pedido("Entrega local", 120.00, 3.0, 35.0));
        loggi.calcular(new Pedido("Entrega regional", 350.00, 12.0, 180.0));
        loggi.calcular(new Pedido("Caixa pesada", 500.00, 25.0, 500.0));
        loggi.calcular(new Pedido("Carga especial", 800.00, 40.0, 700.0));
    }
}
