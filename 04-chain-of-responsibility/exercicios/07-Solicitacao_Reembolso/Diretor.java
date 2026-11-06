public class Diretor extends AprovadorReembolso {
    @Override
    public void aprovar(Reembolso reembolso) {
        exibirAprovacao(reembolso, "Diretor");
    }
}
