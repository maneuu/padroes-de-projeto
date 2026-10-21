// A interface Strategy define o contrato que todas as estratégias devem seguir.
// Ela representa a "operação" que pode mudar de acordo com o algoritmo escolhido.
//
// Essa interface centraliza a ideia do padrão: o Contexto não precisa saber como
// cada comportamento funciona; ele apenas sabe que existe um método comum.
public interface Estrategia {
    // O método executar() é o ponto de variação do comportamento.
    // Cada estratégia concreta implementa este método de sua própria forma.
    String executar(String texto);
}
