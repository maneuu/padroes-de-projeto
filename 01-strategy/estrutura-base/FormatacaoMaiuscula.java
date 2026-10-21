// Estratégia concreta 1:
// A classe abaixo implementa a interface Strategy e define uma regras específica.
// Neste caso, a regra é converter o texto para maiúsculas.
public class FormatacaoMaiuscula implements Estrategia {
    @Override
    public String executar(String texto) {
        // A lógica da estratégia é simples e bem isolada.
        // Ela não depende de qualquer outra classe para funcionar.
        return texto.toUpperCase();
    }
}
