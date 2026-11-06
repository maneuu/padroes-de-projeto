# Exercicio 06 - Chain of Responsibility: encaminhamento de chamados

Este exemplo usa o padrao **Chain of Responsibility** para encaminhar um
chamado ao setor responsavel conforme a sua categoria. O cliente envia o
chamado apenas para o primeiro encaminhador, e cada setor decide se pode
atende-lo ou se deve passa-lo adiante.

## Regras

- `SuporteTecnico`: atende chamados da categoria `tecnico`.
- `SetorFinanceiro`: atende chamados da categoria `financeiro`.
- `SetorComercial`: atende chamados da categoria `comercial`.
- `Ouvidoria`: atende chamados da categoria `ouvidoria`.
- Categorias desconhecidas nao sao encaminhadas quando chegam ao fim da
  cadeia.

## Estrutura

- `Chamado`: representa o protocolo, o assunto e a categoria da solicitacao.
- `Encaminhador`: handler abstrato que guarda o proximo setor e encaminha o
  chamado.
- `SuporteTecnico`, `SetorFinanceiro`, `SetorComercial` e `Ouvidoria`:
  handlers concretos que verificam as categorias sob sua responsabilidade.
- `Main`: monta a cadeia e envia os chamados.
- `diagrama.md`: diagrama UML da estrutura do padrao.

## Como executar

No PowerShell, dentro desta pasta:

```powershell
javac (Get-ChildItem -Filter *.java)
java Main
```

## Saida esperada

```text
Chamado CH-001 encaminhado para Suporte tecnico: Aplicativo nao inicia
Chamado CH-002 encaminhado para Setor financeiro: Boleto com valor incorreto
Chamado CH-003 encaminhado para Setor comercial: Duvida sobre plano empresarial
Chamado CH-004 encaminhado para Ouvidoria: Reclamacao sobre atendimento
Nenhum setor disponivel para o chamado CH-005
```
