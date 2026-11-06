public class Main {
    public static void main(String[] args) {
        Validador nome = new ValidadorNome();
        Validador cpf = new ValidadorCpf();
        Validador email = new ValidadorEmail();

        // Fluxo: nome -> CPF -> e-mail.
        nome.definirProximo(cpf)
                .definirProximo(email);

        nome.validar(new Formulario(
                "Ana Silva", "12345678901", "ana@exemplo.com"));
        nome.validar(new Formulario(
                "", "12345678901", "ana@exemplo.com"));
        nome.validar(new Formulario(
                "Bruno Souza", "123", "bruno@exemplo.com"));
        nome.validar(new Formulario(
                "Carla Lima", "98765432100", "carla.exemplo.com"));
    }
}
