# Exercicio 01 - Template Method: bebidas quentes

Este exemplo implementa o padrao **Template Method** usando a preparacao de
cafe e cha, um caso comum para demonstrar o padrao.

## Estrutura

- `BebidaQuente`: classe abstrata que define o algoritmo fixo de preparacao.
- `Cafe` e `Cha`: implementacoes concretas das etapas que variam.
- `Main`: exemplo de uso das duas bebidas.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O metodo `prepararBebida` e o template method. Ele controla a ordem das etapas
e impede que as subclasses alterem o algoritmo. Cada bebida implementa apenas
o preparo do ingrediente principal e pode sobrescrever o hook
`adicionarCondimentos`.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Preparando cafe:
Fervendo a agua
Passando o cafe pelo filtro
Colocando a bebida na xicara
Adicionando acucar

Preparando cha:
Fervendo a agua
Deixando o sache de cha em infusao
Colocando a bebida na xicara
Adicionando limao
```
