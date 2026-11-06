public abstract class HandlerBase implements Handler {
    // Guarda o proximo objeto que tentara tratar a solicitacao.
    protected Handler proximo;

    @Override
    public void definirProximo(Handler proximo) {
        // A cadeia e montada ligando um handler ao seguinte.
        this.proximo = proximo;
    }

    protected void encaminhar(String solicitacao) {
        if (proximo != null) {
            // Se este handler nao tratar, a solicitacao segue adiante.
            proximo.tratar(solicitacao);
        } else {
            // A cadeia terminou sem encontrar um handler.
            System.out.println("Nenhum handler tratou a solicitacao.");
        }
    }
}
