public class Main {
    public static void main(String[] args) {
        Personagem personagem = new PersonagemBase();
        personagem = new ArmaduraDecorator(personagem);
        personagem = new ArmaDecorator(personagem);

        System.out.println("Personagem: " + personagem.getDescricao());
        System.out.println("Ataque: " + personagem.getAtaque());
        System.out.println("Defesa: " + personagem.getDefesa());
        System.out.println("Habilidades: " + personagem.getHabilidades());
    }
}
