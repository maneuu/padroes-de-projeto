public class SetorComercial extends Encaminhador {
    @Override
    public void encaminhar(Chamado chamado) {
        if (chamado.getCategoria().equalsIgnoreCase("comercial")) {
            exibirEncaminhamento(chamado, "Setor comercial");
            return;
        }

        passarAdiante(chamado);
    }
}
