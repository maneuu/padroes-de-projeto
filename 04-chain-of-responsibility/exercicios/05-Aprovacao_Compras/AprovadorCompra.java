public abstract class AprovadorCompra {
    private AprovadorCompra proximo;

    public AprovadorCompra definirProximo(AprovadorCompra proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void aprovar(Compra compra);

    protected void encaminhar(Compra compra) {
        if (proximo == null) {
            System.out.println("Compra sem aprovador disponivel: "
                    + compra.getDescricao());
            return;
        }

        proximo.aprovar(compra);
    }

    protected void exibirAprovacao(Compra compra, String cargo) {
        System.out.printf("%s aprovou: %s (R$ %.2f)%n",
                cargo, compra.getDescricao(), compra.getValor());
    }
}
