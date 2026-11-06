public class ValidadorNome extends Validador {
    @Override
    public void validar(Formulario formulario) {
        if (formulario.getNome() != null
                && !formulario.getNome().trim().isEmpty()) {
            encaminhar(formulario);
            return;
        }

        rejeitar("nome obrigatorio");
    }
}
