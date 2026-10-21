# Diagrama conceitual do Strategy

```mermaid
classDiagram
    class EditorTexto {
        -Estrategia estrategia
        +EditorTexto(Estrategia estrategia)
        +definirEstrategia(Estrategia estrategia) void
        +formatar(String texto) String
    }

    class Estrategia {
        <<interface>>
        +executar(String texto) String
    }

    class FormatacaoMaiuscula {
        +executar(String texto) String
    }

    class FormatacaoMinuscula {
        +executar(String texto) String
    }

    class FormatacaoComPrefixo {
        +executar(String texto) String
    }

    EditorTexto o--> Estrategia
    Estrategia <|.. FormatacaoMaiuscula
    Estrategia <|.. FormatacaoMinuscula
    Estrategia <|.. FormatacaoComPrefixo
```

O `EditorTexto` é o Contexto.
O `Estrategia` representa a interface comum.
As classes `FormatacaoMaiuscula`, `FormatacaoMinuscula` e
`FormatacaoComPrefixo` são as Concrete Strategies.

Cada uma implementa o mesmo contrato, mas com regras diferentes.
