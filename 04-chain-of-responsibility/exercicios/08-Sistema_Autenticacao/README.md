# Exercicio 08 - Chain of Responsibility: sistema de autenticacao

Este exemplo usa o padrao **Chain of Responsibility** para validar uma
solicitacao de acesso em etapas. O cliente envia a autenticacao apenas para o
primeiro verificador, que valida o usuario, a senha e, por fim, as permissoes
de acesso.

## Regras

- `VerificadorUsuario`: aceita os usuarios cadastrados `ana` e `bruno`.
- `VerificadorSenha`: valida `ana` com `senha123` e `bruno` com `senha456`.
- `VerificadorPermissao`: permite que `ana` acesse qualquer recurso e que
  `bruno` acesse apenas `relatorios`.
- Uma falha interrompe a cadeia e nega o acesso.

## Estrutura

- `Autenticacao`: representa usuario, senha e permissao solicitada.
- `Verificador`: handler abstrato que guarda o proximo verificador e
  encaminha a autenticacao.
- `VerificadorUsuario`, `VerificadorSenha` e `VerificadorPermissao`: handlers
  concretos de cada etapa da validacao.
- `Main`: monta a cadeia e envia as solicitacoes.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Autenticacao concluida para o usuario ana
Autenticacao concluida para o usuario bruno
Acesso negado: senha invalida
Acesso negado: usuario nao encontrado
Acesso negado: usuario sem permissao para admin
```
