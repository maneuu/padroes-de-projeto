/**
 * Concrete Strategy: uma implementacao especifica do algoritmo de formatacao.
 */
public class FormatacaoMaiuscula implements EstrategiaDeFormatacao {
    @Override
    public String formatar(String texto) {
        return texto.toUpperCase();
    }
}
