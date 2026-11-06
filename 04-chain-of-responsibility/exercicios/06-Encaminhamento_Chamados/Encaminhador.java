public abstract class Encaminhador {
    private Encaminhador proximo;

    public Encaminhador definirProximo(Encaminhador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void encaminhar(Chamado chamado);

    protected void passarAdiante(Chamado chamado) {
        if (proximo == null) {
            System.out.println("Nenhum setor disponivel para o chamado "
                    + chamado.getProtocolo());
            return;
        }

        proximo.encaminhar(chamado);
    }

    protected void exibirEncaminhamento(Chamado chamado, String setor) {
        System.out.printf("Chamado %s encaminhado para %s: %s%n",
                chamado.getProtocolo(), setor, chamado.getAssunto());
    }
}
