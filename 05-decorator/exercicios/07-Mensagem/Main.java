public class Main {
    public static void main(String[] args) {
        Mensagem mensagem = new MensagemSimples("Mensagem secreta");
        mensagem = new CesarDecorator(mensagem);
        mensagem = new Base64Decorator(mensagem);

        System.out.println("Mensagem criptografada: " + mensagem.obterConteudo());
    }
}
