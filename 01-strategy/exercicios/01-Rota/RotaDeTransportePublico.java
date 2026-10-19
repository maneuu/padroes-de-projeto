public class RotaDeTransportePublico implements EstrategiaDeRota {
    @Override
    public String calcularRota(String origem, String destino) {
        return origem + " -> " + destino
                + ": pegar o onibus 101 e fazer uma conexao no terminal central"
                + " (aproximadamente 40 minutos)";
    }
}
