public class TransacaoEthereum extends TransacaoCripto {
    @Override
    protected void validarCarteira() {
        System.out.println("Validando endereco da carteira Ethereum");
    }

    @Override
    protected void calcularTaxa() {
        System.out.println("Calculando taxa de gas da rede Ethereum");
    }

    @Override
    protected void assinarTransacao() {
        System.out.println("Assinando transacao com chave privada Ethereum");
    }

    @Override
    protected void enviarParaBlockchain() {
        System.out.println("Enviando transacao para a blockchain Ethereum");
    }

    @Override
    protected void confirmarTransacao() {
        System.out.println("Aguardando confirmacao da rede Ethereum");
    }

    @Override
    protected void notificarUsuario() {
        System.out.println("Notificando usuario sobre a transacao Ethereum");
    }
}
