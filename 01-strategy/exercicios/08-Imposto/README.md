# Exercicio 08 - Strategy: cálculo de impostos

Este exemplo aplica o padrão **Strategy** para representar diferentes regras de
cálculo de impostos sobre um pedido.

## Participantes

- `Pedido`: **Context**. Mantém o valor base e delega o cálculo do imposto para
  a estratégia escolhida.
- `ImpostoStrategy`: **Strategy**. Define o contrato comum dos impostos.
- `ICMS`: **Concrete Strategy**. Aplica 18% sobre o valor base.
- `ISS`: **Concrete Strategy**. Aplica 5% sobre o valor base.
- `PIS`: **Concrete Strategy**. Aplica 6,5% sobre o valor base.
- `Main`: cria um pedido e troca a estratégia para demonstrar cada imposto.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura está representada em [diagrama.md](./diagrama.md).
