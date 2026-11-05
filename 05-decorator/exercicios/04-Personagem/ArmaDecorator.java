public class ArmaDecorator extends PersonagemDecorator {
    public ArmaDecorator(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao() + ", arma";
    }

    @Override
    public int getAtaque() {
        return personagem.getAtaque() + 15;
    }

    @Override
    public String getHabilidades() {
        return adicionarHabilidade(personagem.getHabilidades(), "Golpe poderoso");
    }

    private String adicionarHabilidade(String habilidades, String habilidade) {
        if ("Nenhuma".equals(habilidades)) {
            return habilidade;
        }
        return habilidades + ", " + habilidade;
    }
}
