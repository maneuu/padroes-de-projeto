public class Pulando implements EstadoPersonagem {
    @Override
    public void avancar(Personagem personagem) {
        // Depois de pular, o personagem volta ao estado parado.
        personagem.definirEstado(new Parado());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Personagem: Pulando");
    }
}
