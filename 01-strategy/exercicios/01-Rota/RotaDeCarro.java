public class RotaDeCarro implements EstrategiaDeRota {
    @Override
    public String calcularRota(String origem, String destino) {
        return origem + " -> " + destino
                + ": seguir pela avenida principal de carro (aproximadamente 25 minutos)";
    }
}
