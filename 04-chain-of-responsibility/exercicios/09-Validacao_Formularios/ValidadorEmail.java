public class ValidadorEmail extends Validador {
    @Override
    public void validar(Formulario formulario) {
        String email = formulario.getEmail();
        if (email != null && email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            encaminhar(formulario);
            return;
        }

        rejeitar("e-mail invalido");
    }
}
