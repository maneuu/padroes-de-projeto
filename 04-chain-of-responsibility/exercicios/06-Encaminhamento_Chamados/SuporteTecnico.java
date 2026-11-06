public class SuporteTecnico extends Encaminhador {
    @Override
    public void encaminhar(Chamado chamado) {
        if (chamado.getCategoria().equalsIgnoreCase("tecnico")) {
            exibirEncaminhamento(chamado, "Suporte tecnico");
            return;
        }

        passarAdiante(chamado);
    }
}
