# Padrões de Projeto

Resumo rápido dos padrões estudados neste repositório.

## Strategy

**Use quando:** existem vários algoritmos para a mesma tarefa e você quer
trocar o comportamento sem alterar o contexto.

**Confusão comum:** Strategy é escolhido para variar um algoritmo; State muda
conforme o estado interno do objeto.

**Pegadinha:** criar estratégias demais para comportamentos que quase não
variam.

## State

**Use quando:** o comportamento de um objeto muda de acordo com seu estado
atual.

**Confusão comum:** não é apenas um `enum` com `if`; cada estado deve
concentrar seu próprio comportamento.

**Pegadinha:** esquecer de mudar o estado ou permitir transições inválidas.

## Template Method

**Use quando:** várias classes seguem o mesmo processo, mas algumas etapas
variam.

**Confusão comum:** a classe base define a ordem; as subclasses implementam
as etapas variáveis.

**Pegadinha:** deixar o método template sobrescritível e permitir que a ordem
seja quebrada.

## Chain of Responsibility

**Use quando:** vários objetos podem tratar uma solicitação em sequência.

**Confusão comum:** a cadeia tenta encontrar quem resolve; ela não é uma
execução obrigatória de todos os objetos.

**Pegadinha:** esquecer de encaminhar ou não tratar o fim da cadeia.

## Decorator

**Use quando:** você quer adicionar responsabilidades a um objeto sem alterar
sua classe.

**Confusão comum:** Decorator adiciona comportamentos; Strategy troca o
algoritmo principal.

**Pegadinha:** criar muitos decorators, deixando a ordem e o resultado final
difíceis de entender.

## Resumo para escolher

```text
Vários algoritmos         -> Strategy
Comportamento por estado  -> State
Mesmo processo, etapas diferentes -> Template Method
Solicitação em sequência  -> Chain of Responsibility
Adicionar responsabilidades -> Decorator
```