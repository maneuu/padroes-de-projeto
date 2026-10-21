// Classe principal para demonstrar a estrutura teórica do padrão Strategy.
// A ideia aqui é mostrar que o mesmo Contexto pode funcionar de formas
// diferentes apenas trocando a estratégia.
public class Main {
    public static void main(String[] args) {
        // Cria o Contexto com uma estratégia inicial.
        // Neste caso, começa com a formatação em maiúsculas.
        EditorTexto editor = new EditorTexto(new FormatacaoMaiuscula());

        // Primeira execução com estratégia em maiúsculas.
        System.out.println("Maiúsculas: " + editor.formatar("estratégia"));

        // Troca para outra estratégia sem alterar a lógica do editor.
        editor.definirEstrategia(new FormatacaoMinuscula());
        System.out.println("Minúsculas: " + editor.formatar("ESTRATÉGIA"));

        // Troca para outra regra: adicionar prefixo.
        editor.definirEstrategia(new FormatacaoComPrefixo());
        System.out.println("Com prefixo: " + editor.formatar("estratégia"));

        // Isso mostra a flexibilidade do padrão:
        // o mesmo objeto pode ter comportamentos diferentes dependendo da
        // estratégia atribuída no momento.
    }
}
