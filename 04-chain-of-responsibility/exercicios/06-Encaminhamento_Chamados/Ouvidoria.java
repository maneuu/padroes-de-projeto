public class Ouvidoria extends Encaminhador {
    @Override
    public void encaminhar(Chamado chamado) {
        if (chamado.getCategoria().equalsIgnoreCase("ouvidoria")) {
            exibirEncaminhamento(chamado, "Ouvidoria");
            return;
        }

        passarAdiante(chamado);
    }
}
