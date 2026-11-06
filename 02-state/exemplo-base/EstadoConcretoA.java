public class EstadoConcretoA implements Estado {
    @Override
    public void operar(Contexto contexto) {
        // O estado A decide que o proximo estado sera o estado B.
        contexto.definirEstado(new EstadoConcretoB());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Estado atual: A");
    }
}
