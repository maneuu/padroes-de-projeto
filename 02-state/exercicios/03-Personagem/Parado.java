public class Parado implements EstadoPersonagem {
    @Override
    public void avancar(Personagem personagem) {
        // O contexto recebido e o personagem que deve comecar a correr.
        personagem.definirEstado(new Correndo());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Personagem: Parado");
    }
}
