# Estrutura-base do Strategy

Este exemplo apresenta somente a estrutura do padrao **Strategy**, sem usar
um tema de negocio.

## Arquivos

- `Contexto`: guarda a estrategia atual e delega a execucao.
- `Estrategia`: contrato comum para os algoritmos.
- `EstrategiaConcretaA`, `EstrategiaConcretaB` e `EstrategiaConcretaC`:
  implementacoes concretas do contrato.
- `Main`: troca a estrategia e demonstra os comportamentos.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como funciona

O `Contexto` conhece apenas a interface `Estrategia`. Por isso, a estrategia
pode ser trocada sem alterar a classe principal:

```java
Contexto contexto = new Contexto(new EstrategiaConcretaA());
contexto.definirEstrategia(new EstrategiaConcretaB());
contexto.executar();
```

Cada estrategia concreta implementa o mesmo metodo, mas fornece um
comportamento diferente:

```text
Contexto ----> EstrategiaConcretaA
    |
    +---------> EstrategiaConcretaB
    |
    +---------> EstrategiaConcretaC
```

As letras `"A"`, `"B"` e `"C"` nao representam um problema real. Elas existem
somente para mostrar a estrutura e a troca de algoritmos.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Comportamento da estrategia A
Comportamento da estrategia B
Comportamento da estrategia C
```
