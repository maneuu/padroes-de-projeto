public class SuporteNivel1 extends Suporte {
    @Override
    public void atender(int nivel) {
        if (nivel == 1) {
            System.out.println("Resolvido pelo suporte nivel 1");
        } else {
            encaminhar(nivel);
        }
    }
}
