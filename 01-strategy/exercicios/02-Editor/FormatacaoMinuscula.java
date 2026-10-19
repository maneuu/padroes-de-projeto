/**
 * Concrete Strategy: outra forma de formatar o mesmo texto.
 */
public class FormatacaoMinuscula implements EstrategiaDeFormatacao {
    @Override
    public String formatar(String texto) {
        return texto.toLowerCase();
    }
}
