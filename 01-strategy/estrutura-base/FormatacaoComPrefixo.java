// Estratégia concreta 3:
// Esta estratégia exemplifica uma regra diferente: adicionar um prefixo ao texto.
// Esse tipo de implementação mostra que cada estratégia pode ser completamente
// independente e ter uma lógica diferente, mesmo trabalhando com a mesma tarefa.
public class FormatacaoComPrefixo implements Estrategia {
    @Override
    public String executar(String texto) {
        // O prefixo pode ser qualquer texto fixo ou até configurável.
        // Aqui foi usado um prefixo simples para mostrar a flexibilidade do padrão.
        return "[FORMATADO] " + texto;
    }
}
