public class Main {
    public static void main(String[] args) {
        // Criamos os handlers concretos da cadeia.
        Handler handlerA = new HandlerConcretoA();
        Handler handlerB = new HandlerConcretoB();

        // A cadeia ficara: Handler A -> Handler B.
        handlerA.definirProximo(handlerB);

        // O cliente conhece apenas o primeiro handler.
        // A solicitacao passa pela cadeia ate ser tratada.
        handlerA.tratar("B");

        // Nenhum handler trata "C", entao a cadeia chega ao fim.
        handlerA.tratar("C");
    }
}
