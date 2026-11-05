public class Almoco extends Refeicao {
    @Override
    protected void separarIngredientes() {
        System.out.println("Separando arroz, feijao e legumes");
    }

    @Override
    protected void prepararIngredientePrincipal() {
        System.out.println("Temperando o frango");
    }

    @Override
    protected void cozinhar() {
        System.out.println("Cozinhando arroz, feijao e frango");
    }

    @Override
    protected void adicionarAcompanhamento() {
        System.out.println("Adicionando salada");
    }
}
