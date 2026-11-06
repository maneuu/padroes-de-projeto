public class Gerente extends AprovadorReembolso {
    @Override
    public void aprovar(Reembolso reembolso) {
        if (reembolso.getValor() <= 3000.00) {
            exibirAprovacao(reembolso, "Gerente");
            return;
        }

        encaminhar(reembolso);
    }
}
