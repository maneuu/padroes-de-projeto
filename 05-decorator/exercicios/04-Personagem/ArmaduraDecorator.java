public class ArmaduraDecorator extends PersonagemDecorator {
    public ArmaduraDecorator(Personagem personagem) {
        super(personagem);
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao() + ", armadura";
    }

    @Override
    public int getDefesa() {
        return personagem.getDefesa() + 10;
    }

    @Override
    public String getHabilidades() {
        return adicionarHabilidade(personagem.getHabilidades(), "Resistencia");
    }

    private String adicionarHabilidade(String habilidades, String habilidade) {
        if ("Nenhuma".equals(habilidades)) {
            return habilidade;
        }
        return habilidades + ", " + habilidade;
    }
}
