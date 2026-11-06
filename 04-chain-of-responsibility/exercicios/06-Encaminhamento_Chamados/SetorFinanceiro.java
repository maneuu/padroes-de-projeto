public class SetorFinanceiro extends Encaminhador {
    @Override
    public void encaminhar(Chamado chamado) {
        if (chamado.getCategoria().equalsIgnoreCase("financeiro")) {
            exibirEncaminhamento(chamado, "Setor financeiro");
            return;
        }

        passarAdiante(chamado);
    }
}
