# Exercicio 01 - Decorator: cafe

Este exemplo usa o padrao **Decorator** para adicionar complementos a um cafe
sem alterar a classe `Cafe`.

## Estrutura

- `Bebida`: componente comum, com descricao e custo.
- `Cafe`: componente concreto que representa a bebida base.
- `ComplementoDecorator`: decorator abstrato que mantem uma bebida.
- `Leite`, `Acucar` e `Chantilly`: decorators concretos que adicionam descricao e
  custo.
- `Main`: combina os decorators em tempo de execucao.
- `diagrama.md`: diagrama UML da estrutura do padrao.

Cada complemento recebe uma `Bebida` e tambem pode ser usado como `Bebida`.
Assim, os complementos podem ser empilhados em qualquer ordem.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Pedido: Cafe, leite, acucar, chantilly
Total: R$ 9,00
```
