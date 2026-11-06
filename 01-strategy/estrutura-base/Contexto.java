// O Contexto conhece apenas a interface Estrategia.
// Ele não precisa conhecer cada implementação concreta.
public class Contexto {
    private Estrategia estrategia;

    public Contexto(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void definirEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public String executar() {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estratégia foi definida.");
        }

        return estrategia.executar();
    }
}
