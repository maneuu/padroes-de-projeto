public class CafeDaManha extends Refeicao {
    @Override
    protected void separarIngredientes() {
        System.out.println("Separando pao, ovos e frutas");
    }

    @Override
    protected void prepararIngredientePrincipal() {
        System.out.println("Preparando ovos mexidos");
    }

    @Override
    protected void cozinhar() {
        System.out.println("Tostando o pao e aquecendo o cafe");
    }

    @Override
    protected void adicionarAcompanhamento() {
        System.out.println("Adicionando frutas e suco");
    }
}
