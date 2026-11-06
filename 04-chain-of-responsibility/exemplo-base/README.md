# Estrutura base - Chain of Responsibility

Este exemplo apresenta somente a estrutura do padrao **Chain of
Responsibility**, sem usar um tema de negocio.

## Arquivos

- `Handler`: contrato comum para todos os objetos da cadeia.
- `HandlerBase`: guarda o proximo handler e possui a logica de encaminhamento.
- `HandlerConcretoA`: tenta tratar a solicitacao ou passa para o proximo.
- `HandlerConcretoB`: outro handler concreto da cadeia.
- `Main`: monta a cadeia e inicia o fluxo.

## Formas de implementar

As duas formas estão corretas:

- **Interface:** define o contrato que os handlers devem seguir.
- **Classe abstrata:** pode definir o contrato e compartilhar atributos e
  comportamentos, como a referência para o próximo handler.
- **Classes concretas:** implementam a lógica de tratamento.

Neste exemplo, usamos as duas formas juntas:

- `Handler` é uma interface e define as operações da cadeia.
- `HandlerBase` é uma classe abstrata que guarda o próximo handler e possui
  o comportamento comum de encaminhamento.
- `HandlerConcretoA` e `HandlerConcretoB` são classes concretas que decidem
  se tratam ou encaminham a solicitação.

## Como funciona

Cada handler decide entre:

- tratar a solicitacao; ou
- chamar o proximo handler.

```text
Cliente
   |
   v
Handler A ----> Handler B ----> fim da cadeia
   |                |
 trata              trata
```

O fluxo do exemplo e:

1. Criar os handlers concretos.
2. Ligar `Handler A` ao `Handler B`.
3. Chamar o primeiro handler.
4. O handler tenta tratar a solicitacao.
5. Se nao conseguir, encaminha para o proximo.

As letras `"A"` e `"B"` nao representam um problema real. Elas existem
somente para mostrar a estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Handler B tratou a solicitacao.
Nenhum handler tratou a solicitacao.
```
