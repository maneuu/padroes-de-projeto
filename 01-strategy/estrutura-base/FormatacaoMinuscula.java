// Estratégia concreta 2:
// Esta classe representa outra variação do mesmo comportamento.
// Aqui, o texto será convertido para minúsculas.
public class FormatacaoMinuscula implements Estrategia {
    @Override
    public String executar(String texto) {
        // A ideia é manter a lógica da transformação separada do Contexto.
        // Isso permite trocar o comportamento sem alterar a classe principal.
        return texto.toLowerCase();
    }
}
