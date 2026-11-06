public class HandlerConcretoB extends HandlerBase {
    @Override
    public void tratar(String solicitacao) {
        if (consegueTratar(solicitacao)) {
            // Este handler encerra o fluxo quando consegue tratar.
            System.out.println("Handler B tratou a solicitacao.");
        } else {
            // Caso contrario, passa a solicitacao para o proximo.
            encaminhar(solicitacao);
        }
    }

    private boolean consegueTratar(String solicitacao) {
        // Esta regra existe apenas para demonstrar a estrutura.
        return "B".equals(solicitacao);
    }
}
