public class DiretorFinanceiro extends AprovadorCompra {
    @Override
    public void aprovar(Compra compra) {
        exibirAprovacao(compra, "Diretor financeiro");
    }
}
