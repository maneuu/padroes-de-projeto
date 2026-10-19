public class RotaAPe implements EstrategiaDeRota {
    @Override
    public String calcularRota(String origem, String destino) {
        return origem + " -> " + destino
                + ": caminhar pela rua das Flores (aproximadamente 1 hora e 15 minutos)";
    }
}
