# Decorator

## Resumo para prova

O **Decorator** e um padrao estrutural que permite adicionar responsabilidades
a um objeto **sem modificar sua classe original**.

Em vez de criar muitas subclasses, colocamos um objeto dentro de outro objeto.
O objeto de fora adiciona um comportamento e continua sendo tratado como o
mesmo tipo do objeto de dentro.

## Ideia principal

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
DecoratorConcreto -> adiciona um comportamento
```

O decorator implementa a mesma interface do componente. Por isso, ele pode
receber outro componente ou outro decorator.

## Estrutura

- **Componente**: define as operacoes comuns.
- **Componente concreto**: possui o comportamento original.
- **Decorator abstrato**: guarda uma referencia para um componente.
- **Decorator concreto**: adiciona uma responsabilidade.
- **Cliente**: combina os decorators em tempo de execucao.

Exemplo:

```java
Preco preco = new PrecoOriginal("Notebook", 3000.00);
preco = new DescontoNatal(preco);
preco = new DescontoClienteVIP(preco);
```

O objeto final continua sendo um `Preco`, mas agora possui os dois descontos.

## Como funciona

1. Crie o objeto base.
2. Passe o objeto base para um decorator.
3. Passe o resultado para outro decorator.
4. Cada decorator chama o objeto interno e acrescenta seu comportamento.

```java
public double getValor() {
    return preco.getValor() * 0.90;
}
```

Nesse exemplo, o desconto usa o valor do objeto interno e aplica mais uma
regra.

## Exemplo simples

```java
Mensagem mensagem = new MensagemSimples("Ola");
mensagem = new CesarDecorator(mensagem);
mensagem = new Base64Decorator(mensagem);
```

Cada decorator envolve o anterior:

```text
Base64Decorator
    -> CesarDecorator
        -> MensagemSimples
```

## Vantagens

- Adiciona comportamentos sem alterar a classe original.
- Permite combinar funcionalidades em varias ordens.
- Evita criar uma subclasse para cada combinacao.
- Permite adicionar ou remover comportamentos em tempo de execucao.
- Segue o principio aberto/fechado: aberto para extensao e fechado para
  modificacao.
- Cada decorator pode ter uma responsabilidade pequena.

## Desvantagens e cuidados

- Muitos decorators podem deixar o codigo dificil de acompanhar.
- A ordem dos decorators pode mudar o resultado.
- Pode ser dificil descobrir o tipo concreto do objeto final.
- Cada decorator deve implementar a mesma interface do componente.
- O decorator deve delegar ao objeto interno antes ou depois de adicionar sua
  regra, conforme o comportamento desejado.

## Decorator com ou sem metodos na classe abstrata

A classe `Decorator` pode conter apenas o atributo e o construtor:

```java
public abstract class PrecoDecorator implements Preco {
    protected final Preco preco;

    protected PrecoDecorator(Preco preco) {
        this.preco = preco;
    }
}
```

Isso funciona porque a classe e abstrata e os decorators concretos implementam
os metodos da interface.

Tambem e possivel colocar nela os metodos que apenas repassam o comportamento:

```java
public double getValor() {
    return preco.getValor();
}
```

Essa segunda forma reduz repeticao. Nenhuma das duas formas e obrigatoria; a
escolha depende do que sera compartilhado pelos decorators.

## Decorator x heranca

**Heranca** define um comportamento fixo em uma nova classe.

**Decorator** permite montar comportamentos de forma flexivel e combinavel:

```text
Produto + desconto + frete + embalagem
```

Se as combinacoes forem muitas, decorators costumam ser melhores do que criar
uma classe para cada combinacao.

## Decorator x Adapter

- **Decorator** adiciona comportamento e mantem a mesma interface.
- **Adapter** altera ou adapta uma interface para outra.

Pergunta de prova:

> Quero adicionar uma responsabilidade ou tornar uma classe compativel?

- Adicionar responsabilidade: **Decorator**.
- Tornar interfaces compativeis: **Adapter**.

## Decorator x Proxy

- **Decorator** adiciona responsabilidades.
- **Proxy** controla o acesso ao objeto, por exemplo com permissao, cache ou
  carregamento tardio.

Os dois podem ter uma referencia para outro objeto, mas possuem objetivos
 diferentes.

## Como identificar o padrao

Procure estes sinais:

- Existe uma interface ou classe comum.
- Existe uma implementacao base.
- O decorator recebe o mesmo tipo no construtor.
- O decorator guarda esse objeto em um atributo.
- Varios decorators podem ser empilhados.
- O comportamento e adicionado sem alterar a classe base.

## Checklist para implementar

1. Crie a interface do componente.
2. Crie a implementacao original.
3. Crie o decorator abstrato com uma referencia ao componente.
4. Faca os decorators concretos implementarem a mesma interface.
5. Chame o objeto interno.
6. Adicione a nova regra antes ou depois da chamada.
7. Teste uma combinacao com dois ou mais decorators.

## Dicas para a prova

- Decorator e um padrao **estrutural**.
- Ele usa **composicao**, nao apenas heranca.
- O decorator e do mesmo tipo do objeto decorado.
- A referencia interna normalmente tem o tipo da interface.
- A ordem dos decorators pode alterar o resultado.
- O objeto base nao precisa conhecer os decorators.
- Decorators podem ser combinados em tempo de execucao.
- Se a interface nao for a mesma, provavelmente nao e Decorator.
- A frase-chave e: **adicionar responsabilidades dinamicamente sem modificar a
  classe original**.

## Resposta curta para memorizar

> Decorator envolve um objeto com outro objeto da mesma interface para adicionar
> responsabilidades de forma dinamica, flexivel e sem alterar a classe original.