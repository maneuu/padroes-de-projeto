public class Cafe implements Bebida {
    @Override
    public String getDescricao() {
        return "Cafe";
    }

    @Override
    public double getCusto() {
        return 5.00;
    }
}
