public class HandlerConcretoA extends HandlerBase {
    @Override
    public void tratar(String solicitacao) {
        if (consegueTratar(solicitacao)) {
            // Este handler encerra o fluxo quando consegue tratar.
            System.out.println("Handler A tratou a solicitacao.");
        } else {
            // Caso contrario, deixa o handler base encaminhar.
            encaminhar(solicitacao);
        }
    }

    private boolean consegueTratar(String solicitacao) {
        // Esta regra existe apenas para demonstrar a estrutura.
        return "A".equals(solicitacao);
    }
}
