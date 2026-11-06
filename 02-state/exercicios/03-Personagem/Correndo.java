public class Correndo implements EstadoPersonagem {
    @Override
    public void avancar(Personagem personagem) {
        // O contexto recebido e o personagem que deve iniciar um pulo.
        personagem.definirEstado(new Pulando());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Personagem: Correndo");
    }
}
