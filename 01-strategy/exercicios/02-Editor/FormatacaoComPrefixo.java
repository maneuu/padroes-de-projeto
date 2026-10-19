/**
 * Concrete Strategy: adiciona um prefixo ao texto.
 *
 * Esta classe tem um algoritmo diferente, mas segue a mesma interface.
 */
public class FormatacaoComPrefixo implements EstrategiaDeFormatacao {
    @Override
    public String formatar(String texto) {
        return "[FORMATADO] " + texto;
    }
}
