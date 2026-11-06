public class SuporteNivel2 extends Suporte {
    @Override
    public void atender(int nivel) {
        if (nivel == 2) {
            System.out.println("Resolvido pelo suporte nivel 2");
        } else {
            encaminhar(nivel);
        }
    }
}
