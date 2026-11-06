public class CesarDecorator extends MensagemDecorator {
    public CesarDecorator(Mensagem mensagem) {
        super(mensagem);
    }

    @Override
    public String obterConteudo() {
        return "[Cesar] " + mensagem.obterConteudo();
    }
}
