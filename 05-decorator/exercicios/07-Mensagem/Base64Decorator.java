public class Base64Decorator extends MensagemDecorator {
    public Base64Decorator(Mensagem mensagem) {
        super(mensagem);
    }

    @Override
    public String obterConteudo() {
        return "[Base64] " + mensagem.obterConteudo();
    }
}
