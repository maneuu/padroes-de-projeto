# Exercicio 10 - Strategy: autenticação com estratégias diferentes

Este exemplo aplica o padrão **Strategy** para representar diferentes formas de
autenticação em um sistema. Cada estratégia concreta possui atributos próprios,
mostrando que cada implementação pode depender de dados diferentes para realizar
o login.

## Participantes

- `SistemaLogin`: **Context**. Mantém a estratégia atual e delega a autenticação.
- `AutenticacaoStrategy`: **Strategy**. Define o contrato comum de autenticação.
- `AutenticacaoEmailSenha`: **Concrete Strategy**. Possui `email` e `senha`.
- `AutenticacaoGoogle`: **Concrete Strategy**. Possui `clientId` e `clientSecret`.
- `AutenticacaoGitHub`: **Concrete Strategy**. Possui `tokenAcesso` e `nomeUsuarioGitHub`.
- `Main`: troca a estratégia para demonstrar cada tipo de autenticação.

## Como executar

Dentro desta pasta, execute:

```powershell
javac *.java
java Main
```

## Diagrama UML

A estrutura está representada em [diagrama.md](./diagrama.md).
