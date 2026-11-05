public abstract class TransacaoCripto {
    // Template Method: define a ordem fixa de uma transacao de criptomoeda.
    public final void processarTransacao() {
        validarCarteira();
        calcularTaxa();
        assinarTransacao();
        enviarParaBlockchain();
        confirmarTransacao();
        notificarUsuario();
    }

    // Cada rede possui regras proprias para validar a carteira.
    protected abstract void validarCarteira();

    // A taxa depende da tecnologia e do momento da rede.
    protected abstract void calcularTaxa();

    // Cada criptomoeda utiliza seu proprio mecanismo de assinatura.
    protected abstract void assinarTransacao();

    // A transacao e enviada para uma rede blockchain especifica.
    protected abstract void enviarParaBlockchain();

    // A confirmacao varia conforme o protocolo da rede.
    protected abstract void confirmarTransacao();

    // Hook: a notificacao pode ser personalizada ou ignorada.
    protected void notificarUsuario() {}
}
