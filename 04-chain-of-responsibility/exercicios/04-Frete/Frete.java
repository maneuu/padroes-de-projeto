public abstract class Frete {
    private Frete proximo;

    public Frete definirProximo(Frete proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void calcular(Pedido pedido);

    protected void encaminhar(Pedido pedido) {
        if (proximo == null) {
            System.out.println("Nenhuma transportadora disponivel para: "
                    + pedido.getDescricao());
            return;
        }

        proximo.calcular(pedido);
    }

    protected void exibirFrete(Pedido pedido, String transportadora,
            double valorFrete) {
        double total = pedido.getValorProdutos() + valorFrete;
        System.out.printf("%s: %s - frete R$ %.2f - total R$ %.2f%n",
                pedido.getDescricao(), transportadora, valorFrete, total);
    }
}
