public class Cafe extends BebidaQuente {
    // Implementacao do passo que varia entre as bebidas.
    @Override
    protected void prepararIngredientePrincipal() {
        System.out.println("Passando o cafe pelo filtro");
    }

    // O cafe escolhe sobrescrever o hook para adicionar acucar.
    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando acucar");
    }
}
