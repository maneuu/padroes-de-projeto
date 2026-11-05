# Exercicio 08 - Template Method: transacoes de criptomoedas

Este exemplo aplica o padrao **Template Method** ao processamento de
transacoes em redes de criptomoedas. Bitcoin e Ethereum seguem o mesmo fluxo
geral, mas possuem regras e mecanismos especificos em cada etapa.

## Estrutura

- `TransacaoCripto`: classe abstrata que define o algoritmo fixo.
- `TransacaoBitcoin` e `TransacaoEthereum`: implementacoes concretas.
- `Main`: executa as duas transacoes.
- `diagrama.md`: diagrama UML da estrutura do padrao.

O metodo `processarTransacao` e o **template method**. Ele e `final` para
impedir que as subclasses alterem a ordem das etapas. `notificarUsuario` e um
**hook** opcional para personalizar a notificacao ao final do processamento.

O exemplo e didatico: ele apenas simula as etapas com mensagens no console e
nao acessa carteiras, chaves privadas ou redes reais.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac *.java
java Main
```

## Saida esperada

```text
Processando transacao Bitcoin:
Validando endereco da carteira Bitcoin
Calculando taxa da rede Bitcoin
Assinando transacao com chave privada Bitcoin
Enviando transacao para a blockchain Bitcoin
Aguardando confirmacoes dos blocos Bitcoin
Notificando usuario sobre a transacao Bitcoin

Processando transacao Ethereum:
Validando endereco da carteira Ethereum
Calculando taxa de gas da rede Ethereum
Assinando transacao com chave privada Ethereum
Enviando transacao para a blockchain Ethereum
Aguardando confirmacao da rede Ethereum
Notificando usuario sobre a transacao Ethereum
```
