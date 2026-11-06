public class Gerente extends Suporte {
    @Override
    public void atender(int nivel) {
        if (nivel == 3) {
            System.out.println("Resolvido pelo gerente");
        } else {
            encaminhar(nivel);
        }
    }
}
