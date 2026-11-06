# Estrutura base - Decorator

Este exemplo apresenta somente a estrutura do padrao **Decorator**, sem usar
um tema de negocio.

## Arquivos

- `Componente`: interface comum para o objeto original e os decorators.
- `ComponenteConcreto`: implementacao original do componente.
- `Decorator`: classe abstrata que recebe e guarda um `Componente`.
- `DecoratorConcreto`: adiciona um comportamento ao componente interno.
- `Main`: mostra como empilhar um decorator.

## Como funciona

O decorator implementa a mesma interface do componente. Por isso, o cliente
pode tratar o objeto original e o objeto decorado da mesma maneira.

```text
Componente
    ^
    |
ComponenteConcreto

Componente
    ^
    |
Decorator -> guarda um Componente
    ^
    |
DecoratorConcreto -> adiciona comportamento
```

O fluxo do exemplo e:

1. Criar um `ComponenteConcreto`.
2. Passar o componente para um `DecoratorConcreto`.
3. Chamar a mesma operacao pelo tipo `Componente`.
4. O decorator delega a chamada para o objeto interno e acrescenta seu
   comportamento.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Operacao do componente concreto + comportamento do decorator
```
