# Exercicio 01 - Strategy: rotas

Este exemplo implementa o padrao **Strategy** com um navegador que calcula
rotas usando diferentes estrategias.

## Estrutura

- `Navegador`: contexto que utiliza uma estrategia de rota.
- `EstrategiaDeRota`: interface comum para todas as estrategias.
- `RotaDeCarro`, `RotaDeTransportePublico` e `RotaAPe`: estrategias concretas.
- `Main`: exemplo de uso e troca de estrategia em tempo de execucao.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O `Navegador` nao conhece os detalhes de como cada rota e calculada. Ele
apenas delega o calculo para a estrategia atual, que retorna uma descricao
simples da rota. Assim, novas formas de calcular rotas podem ser adicionadas
sem alterar o navegador.

## Diagrama UML

O diagrama da relacao entre o contexto, a interface e as estrategias concretas
esta em [diagrama.md](./diagrama.md).

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Relacao com o exemplo do Refactoring Guru

Neste exemplo:

- o `Navegador` corresponde ao **Context**;
- `EstrategiaDeRota` corresponde a **Strategy**;
- cada classe `Rota...` corresponde a uma **Concrete Strategy**;
- `definirEstrategia` permite trocar o algoritmo sem modificar o contexto.
