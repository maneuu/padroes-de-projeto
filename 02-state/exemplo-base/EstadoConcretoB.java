public class EstadoConcretoB implements Estado {
    @Override
    public void operar(Contexto contexto) {
        // O estado B decide que o contexto deve voltar para o estado A.
        contexto.definirEstado(new EstadoConcretoA());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Estado atual: B");
    }
}
