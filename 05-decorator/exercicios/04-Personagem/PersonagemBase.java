public class PersonagemBase implements Personagem {
    @Override
    public String getDescricao() {
        return "Personagem base";
    }

    @Override
    public int getAtaque() {
        return 10;
    }

    @Override
    public int getDefesa() {
        return 5;
    }

    @Override
    public String getHabilidades() {
        return "Nenhuma";
    }
}
