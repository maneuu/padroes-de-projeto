public class Coordenador extends AprovadorReembolso {
    @Override
    public void aprovar(Reembolso reembolso) {
        if (reembolso.getValor() <= 500.00) {
            exibirAprovacao(reembolso, "Coordenador");
            return;
        }

        encaminhar(reembolso);
    }
}
