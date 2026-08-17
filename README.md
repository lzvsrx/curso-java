# curso-java

Repositorio com exercicios do curso de Java.

## Projetos

### java-anatomia-classes

Projeto com exemplos iniciais de anatomia de classes Java, pacotes, metodos, constantes, impressao no console e estruturas condicionais.

Arquivos principais:

- `java-anatomia-classes/src/edu/luizotavio/aluno/Nome.java`
  - Classe com exemplo de metodo `nomeCompleto`, uso de `String`, `concat`, constante `ANO_ATUAL` e impressao no console.
- `java-anatomia-classes/src/edu/luizotavio/primeirasemana/BoletimEstudantil.java`
  - Exemplo de estrutura condicional `if/else` para mostrar se o estudante foi aprovado ou reprovado.
- `java-anatomia-classes/src/edu/luizotavio/segundasemana/MinhaClasse.java`
  - Exemplo basico de classe Java com mensagem no console.
- `java-anatomia-classes/src/edu/luizotavio/segundasemana/MinhaClasses.java`
  - Exemplo de variavel `String`, constante `ANO` e impressao de valores.

Outros arquivos e pastas:

- `java-anatomia-classes/README.md`
- `java-anatomia-classes/.vscode/settings.json`
- `java-anatomia-classes/lib/.gitkeep`
- `java-anatomia-classes/bin/`
  - Arquivos `.class` compilados.

### tipos-variaveis

Projeto com exemplos de tipos de variaveis, conversoes, constantes e operadores em Java.

Arquivos principais:

- `tipos-variaveis/src/TiposVariaveis.java`
  - Exemplo de `double`, `short`, `int`, conversao de tipos, alteracao de valores e constante `final`.
- `tipos-variaveis/src/Operadores.java`
  - Exemplo de concatenacao, operadores unarios, incremento, decremento, operador ternario, operadores relacionais, `if/else` e operador logico `&&`.

Outros arquivos e pastas:

- `tipos-variaveis/README.md`
- `tipos-variaveis/.vscode/settings.json`
- `tipos-variaveis/lib/.gitkeep`

### sistema-smart-tv

Projeto com uma simulacao simples de uma Smart TV usando classes, atributos e metodos.

Arquivos principais:

- `sistema-smart-tv/src/SmartTv.java`
  - Classe que representa uma TV com os atributos `ligada`, `canal` e `volume`.
  - Metodos para ligar, desligar, aumentar volume, diminuir volume, mudar canal, aumentar canal e diminuir canal.
- `sistema-smart-tv/src/Usuario.java`
  - Classe com `main` que cria uma `SmartTv`, mostra seus estados no console e chama os metodos da TV.

Outros arquivos:

- `sistema-smart-tv/README.md`
- `sistema-smart-tv/.vscode/settings.json`

## Estrutura geral

```text
curso-java/
|-- README.md
|-- .gitignore
|-- java-anatomia-classes/
|-- tipos-variaveis/
`-- sistema-smart-tv/
```

## Conteudos estudados

- Estrutura basica de classes Java
- Metodo `main`
- Pacotes
- Variaveis
- Constantes
- Tipos primitivos
- Conversao de tipos
- Concatenacao de textos
- Operadores aritmeticos
- Operadores unarios
- Incremento e decremento
- Operador ternario
- Operadores relacionais
- Operadores logicos
- Estruturas condicionais `if/else`
- Criacao de objetos
- Atributos e metodos
