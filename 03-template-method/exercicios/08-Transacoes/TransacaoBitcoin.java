public class TransacaoBitcoin extends TransacaoCripto {
    @Override
    protected void validarCarteira() {
        System.out.println("Validando endereco da carteira Bitcoin");
    }

    @Override
    protected void calcularTaxa() {
        System.out.println("Calculando taxa da rede Bitcoin");
    }

    @Override
    protected void assinarTransacao() {
        System.out.println("Assinando transacao com chave privada Bitcoin");
    }

    @Override
    protected void enviarParaBlockchain() {
        System.out.println("Enviando transacao para a blockchain Bitcoin");
    }

    @Override
    protected void confirmarTransacao() {
        System.out.println("Aguardando confirmacoes dos blocos Bitcoin");
    }

    @Override
    protected void notificarUsuario() {
        System.out.println("Notificando usuario sobre a transacao Bitcoin");
    }
}
