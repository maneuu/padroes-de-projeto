# Exercicio 04 - Strategy: cálculo de frete

Este exemplo aplica o padrão **Strategy** para representar diferentes transportadoras
que calculam o frete de um pedido.

## Participantes

- `Pedido`: **Context**. Mantém o valor dos produtos, o peso e a distância,
  além de delegar o cálculo do frete para a estratégia definida.
- `FreteStrategy`: **Strategy**. Define o contrato que todas as transportadoras
  devem seguir.
- `Jadlog`: **Concrete Strategy**. Simula o cálculo do frete da Jadlog.
- `Correios`: **Concrete Strategy**. Simula o cálculo do frete dos Correios.
- `Loggi`: **Concrete Strategy**. Simula o cálculo do frete da Loggi.
- `JTExpress`: **Concrete Strategy**. Simula o cálculo do frete da J&T Express.
- `Main`: cria um pedido e troca a estratégia para demonstrar como cada
  transportadora influencia o valor final.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura está representada em [diagrama.md](./diagrama.md).
