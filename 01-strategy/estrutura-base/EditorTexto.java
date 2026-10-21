// O Contexto representa a classe principal que usa a estratégia.
// Ele não precisa conhecer cada implementação específica.
//
// O importante aqui é que o Contexto conhece apenas a interface Strategy.
// Isso reduz o acoplamento e permite usar qualquer estratégia sem mexer na
// lógica principal.
public class EditorTexto {
    // Atributo que guarda a estratégia ativa.
    // Como ele é do tipo interface Strategy, qualquer implementação pode ser
    // atribuída aqui.
    private Estrategia estrategia;

    // Construtor que define a estratégia inicial.
    public EditorTexto(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    // Método que troca a estratégia em tempo de execução.
    // Isso é uma das grandes vantagens do padrão Strategy:
    // o comportamento pode variar dinamicamente.
    public void definirEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    // Método principal do contexto.
    // Ele delega a execução para a estratégia atual.
    public String formatar(String texto) {
        // Se a estratégia for nula, a execução não pode continuar.
        // Em sistemas reais, esse caso costuma ser tratado com validação.
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estratégia foi definida.");
        }

        // O Contexto simplesmente chama o algoritmo escolhido.
        return estrategia.executar(texto);
    }
}
