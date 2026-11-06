public class ValidadorCpf extends Validador {
    @Override
    public void validar(Formulario formulario) {
        String cpf = formulario.getCpf();
        if (cpf != null && cpf.matches("\\d{11}")) {
            encaminhar(formulario);
            return;
        }

        rejeitar("CPF deve conter 11 digitos");
    }
}
