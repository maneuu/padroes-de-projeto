public class Main {
    public static void main(String[] args) {
        Suporte nivel1 = new SuporteNivel1(); // suporte de nível 1
        Suporte nivel2 = new SuporteNivel2(); // suporte de nível 2
        Suporte gerente = new Gerente(); // suporte de nível 3 


        // FLUXO SERÁ SEGUINTE: nivel1 -> nivel2 -> gerente
        nivel1.setProximo(nivel2);
        nivel2.setProximo(gerente);

        // Chamando o atendimento de um problema de nível 3
        nivel1.atender(3);
        
        nivel1.atender(1); // Chamando o atendimento de um problema de nível 1

        nivel1.atender(2); // Chamando o atendimento de um problema de nível 2

        nivel1.atender(4); // Chamando o atendimento de um problema de nível 4 (não suportado) 
        // NIVEL 4 NÃO É SUPORTADO, ENTÃO O FLUXO PASSA PARA O PRÓXIMO NÍVEL, QUE É O GERENTE. O GERENTE TAMBÉM NÃO SUPORTA, ENTÃO A MENSAGEM "NENHUM SUPORTE DISPONÍVEL PARA ESTE NÍVEL" SERÁ EXIBIDA.
    }
}
