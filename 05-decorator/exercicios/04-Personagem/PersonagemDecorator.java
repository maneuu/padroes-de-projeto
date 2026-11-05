public abstract class PersonagemDecorator implements Personagem {
    protected final Personagem personagem;

    protected PersonagemDecorator(Personagem personagem) {
        this.personagem = personagem;
    }

    @Override
    public String getDescricao() {
        return personagem.getDescricao();
    }

    @Override
    public int getAtaque() {
        return personagem.getAtaque();
    }

    @Override
    public int getDefesa() {
        return personagem.getDefesa();
    }

    @Override
    public String getHabilidades() {
        return personagem.getHabilidades();
    }
}
