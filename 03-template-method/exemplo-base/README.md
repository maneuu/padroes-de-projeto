# Estrutura base - Template Method

Este exemplo apresenta somente a estrutura do padrao **Template Method**, sem
usar um tema de negocio.

## Arquivos

- `ProcessoTemplate`: classe abstrata que define o algoritmo fixo.
- `ProcessoConcretoA` e `ProcessoConcretoB`: implementacoes da etapa que varia.
- `Main`: executa as duas variacoes do processo.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como funciona

O metodo `executar` e o **Template Method**. Ele define a ordem das etapas e
nao pode ser sobrescrito pelas subclasses:

```text
preparar()
    |
realizarEtapaPrincipal()
    |
finalizar()
    |
opcional()
```

As subclasses implementam apenas a etapa abstrata
`realizarEtapaPrincipal`. O metodo `opcional` e um **hook**: a subclasse pode
sobrescreve-lo ou manter o comportamento vazio.

O fluxo e o mesmo para os dois processos, mas a etapa principal pode ter
implementacoes diferentes.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Executando o processo A:
Preparando o processo
Executando a etapa principal do processo A
Finalizando o processo
Executando a etapa opcional do processo A

Executando o processo B:
Preparando o processo
Executando a etapa principal do processo B
Finalizando o processo
```
