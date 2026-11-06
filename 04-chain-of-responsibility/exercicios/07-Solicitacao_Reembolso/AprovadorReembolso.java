public abstract class AprovadorReembolso {
    private AprovadorReembolso proximo;

    public AprovadorReembolso definirProximo(AprovadorReembolso proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void aprovar(Reembolso reembolso);

    protected void encaminhar(Reembolso reembolso) {
        if (proximo == null) {
            System.out.println("Reembolso sem aprovador disponivel: "
                    + reembolso.getDescricao());
            return;
        }

        proximo.aprovar(reembolso);
    }

    protected void exibirAprovacao(Reembolso reembolso, String responsavel) {
        System.out.printf("%s aprovou o reembolso de %s: %s (R$ %.2f)%n",
                responsavel, reembolso.getSolicitante(),
                reembolso.getDescricao(), reembolso.getValor());
    }
}
