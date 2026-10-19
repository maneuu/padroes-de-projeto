# Diagrama UML - Strategy

```mermaid
classDiagram
    class EditorDeTexto {
        -EstrategiaDeFormatacao estrategia
        +EditorDeTexto()
        +definirEstrategia(EstrategiaDeFormatacao estrategia) void
        +formatar(String texto) String
    }

    class EstrategiaDeFormatacao {
        <<interface>>
        +formatar(String texto) String
    }

    class FormatacaoMaiuscula {
        +formatar(String texto) String
    }

    class FormatacaoMinuscula {
        +formatar(String texto) String
    }

    class FormatacaoComPrefixo {
        +formatar(String texto) String
    }

    EditorDeTexto o--> EstrategiaDeFormatacao : utiliza
    EstrategiaDeFormatacao <|.. FormatacaoMaiuscula
    EstrategiaDeFormatacao <|.. FormatacaoMinuscula
    EstrategiaDeFormatacao <|.. FormatacaoComPrefixo
```

## Participantes do padrão

- **EditorDeTexto**: contexto que delega a formatação para a estratégia selecionada.
- **EstrategiaDeFormatacao**: interface comum das estratégias.
- **FormatacaoMaiuscula**, **FormatacaoMinuscula** e **FormatacaoComPrefixo**:
  estratégias concretas, cada uma com uma forma diferente de formatar o texto.
