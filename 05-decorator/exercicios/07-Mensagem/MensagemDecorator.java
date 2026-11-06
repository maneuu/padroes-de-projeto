public abstract class MensagemDecorator implements Mensagem {
    protected final Mensagem mensagem;

    protected MensagemDecorator(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
}
