/**
 * Strategy: define o contrato que todas as formas de formatacao devem seguir.
 *
 * O contexto nao precisa saber como o texto sera formatado.
 * Ele conhece apenas este metodo comum.
 */
public interface EstrategiaDeFormatacao {
    String formatar(String texto);
}
