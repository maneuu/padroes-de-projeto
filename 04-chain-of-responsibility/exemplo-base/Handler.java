public interface Handler {
    // Define a operacao que todos os handlers devem oferecer.
    void tratar(String solicitacao);

    // Define quem sera o proximo handler da cadeia.
    void definirProximo(Handler proximo);
}
