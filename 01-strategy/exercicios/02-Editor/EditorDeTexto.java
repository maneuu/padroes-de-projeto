/**
 * Context: utiliza uma estrategia para formatar o texto.
 *
 * O editor delega a formatacao para o objeto recebido. Dessa forma,
 * o editor nao precisa ter um if para cada tipo de formatacao.
 */
public class EditorDeTexto {
    private EstrategiaDeFormatacao estrategia;

    public EditorDeTexto() {
        
    }

    /**
     * Permite trocar o algoritmo em tempo de execucao.
     */
    public void definirEstrategia(EstrategiaDeFormatacao estrategia) {
        this.estrategia = estrategia;
    }

    /**
     * O contexto apenas delega a operacao para a estrategia atual.
     */
    public String formatar(String texto) {
        return estrategia.formatar(texto);
    }
}
