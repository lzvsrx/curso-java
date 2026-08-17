# curso-java

Repositorio com exercicios do curso de Java.

## Arquivos da raiz

- `README.md`
  - README principal com a descricao de todos os projetos.
- `.gitignore`
  - Arquivo com regras de arquivos ignorados pelo Git.
- `.vscode/settings.json`
  - Configuracoes gerais do VS Code para o workspace.

## Projetos do repositorio

### java-anatomia-classes

Projeto com exemplos iniciais de anatomia de classes Java, pacotes, metodos, constantes, impressao no console e estruturas condicionais.

Arquivos:

- `java-anatomia-classes/README.md`
  - README padrao do projeto Java no VS Code.
- `java-anatomia-classes/.vscode/settings.json`
  - Configuracoes locais do projeto no VS Code.
- `java-anatomia-classes/lib/.gitkeep`
  - Arquivo usado para manter a pasta `lib` no Git.
- `java-anatomia-classes/bin/Nome.class`
  - Arquivo compilado.
- `java-anatomia-classes/bin/edu/luizotavio/primeirasemana/BoletimEstudantil.class`
  - Arquivo compilado.
- `java-anatomia-classes/bin/edu/luizotavio/segundasemana/MinhaClasse.class`
  - Arquivo compilado.
- `java-anatomia-classes/bin/edu/luizotavio/segundasemana/MinhaClasses.class`
  - Arquivo compilado.
- `java-anatomia-classes/src/edu/luizotavio/aluno/Nome.java`
  - Classe com exemplo de metodo `nomeCompleto`, uso de `String`, `concat`, constante `ANO_ATUAL` e impressao no console.
- `java-anatomia-classes/src/edu/luizotavio/primeirasemana/BoletimEstudantil.java`
  - Exemplo de `if/else` para mostrar se o estudante foi aprovado ou reprovado.
- `java-anatomia-classes/src/edu/luizotavio/segundasemana/MinhaClasse.java`
  - Exemplo basico de classe Java com mensagem no console.
- `java-anatomia-classes/src/edu/luizotavio/segundasemana/MinhaClasses.java`
  - Exemplo de variavel `String`, constante `ANO` e impressao de valores.

### tipos-variaveis

Projeto com exemplos de tipos de variaveis, conversoes, constantes e operadores em Java.

Arquivos:

- `tipos-variaveis/README.md`
  - README padrao do projeto Java no VS Code.
- `tipos-variaveis/.vscode/settings.json`
  - Configuracoes locais do projeto no VS Code.
- `tipos-variaveis/lib/.gitkeep`
  - Arquivo usado para manter a pasta `lib` no Git.
- `tipos-variaveis/src/TiposVariaveis.java`
  - Exemplo de `double`, `short`, `int`, conversao de tipos, alteracao de valores e constante `final`.
- `tipos-variaveis/src/Operadores.java`
  - Exemplo de concatenacao, operadores unarios, incremento, decremento, operador ternario, operadores relacionais, `if/else` e operador logico `&&`.

### sistema-smart-tv

Projeto com uma simulacao simples de uma Smart TV usando classes, atributos e metodos.

Arquivos:

- `sistema-smart-tv/README.md`
  - README padrao do projeto Java no VS Code.
- `sistema-smart-tv/.vscode/settings.json`
  - Configuracoes locais do projeto no VS Code.
- `sistema-smart-tv/src/SmartTv.java`
  - Classe que representa uma TV com os atributos `ligada`, `canal` e `volume`.
  - Possui metodos para ligar, desligar, aumentar volume, diminuir volume, mudar canal, aumentar canal e diminuir canal.
- `sistema-smart-tv/src/Usuario.java`
  - Classe com `main` que cria uma `SmartTv`, mostra seus estados no console e chama os metodos da TV.

### java-terminal

Projeto com exemplos de comentarios, documentacao e metodos em Java.

Arquivos:

- `java-terminal/README.md`
  - README padrao do projeto Java no VS Code.
- `java-terminal/.vscode/settings.json`
  - Configuracoes locais do projeto no VS Code.
- `java-terminal/lib/.gitkeep`
  - Arquivo usado para manter a pasta `lib` no Git.
- `java-terminal/src/Calculadora.java`
  - Classe com metodo `somar`, exemplo de parametros, retorno, JavaDoc e metodo `main` para testar a soma.
- `java-terminal/src/Comentarios.java`
  - Classe com metodo `somaMultiplica`, usando parametro de texto para decidir entre soma e multiplicacao.
- `java-terminal/src/author.java`
  - Annotation criada para exemplo de documentacao.
- `java-terminal/src/param.java`
  - Annotation criada para exemplo de documentacao.
- `java-terminal/src/version.java`
  - Annotation criada para exemplo de documentacao.
- `java-terminal/src/numeroUm.java`
  - Classe simples criada como exemplo.
- `java-terminal/src/é.java`
  - Classe simples criada com template do NetBeans.

### conta-banco

Projeto de terminal que simula a criacao de uma conta bancaria recebendo dados do usuario.

Arquivos:

- `conta-banco/README.md`
  - README padrao do projeto Java no VS Code.
- `conta-banco/.vscode/settings.json`
  - Configuracoes locais do projeto no VS Code.
- `conta-banco/lib/.gitkeep`
  - Arquivo usado para manter a pasta `lib` no Git.
- `conta-banco/src/ContaTerminal.java`
  - Classe com `main` que usa `Scanner` para ler numero da conta, agencia, nome do cliente e saldo.
  - Usa `try-with-resources` para fechar o `Scanner` automaticamente.
  - Ao final, imprime uma mensagem confirmando os dados da conta criada.

### controle-de-fluxo

Projeto com exemplos de controle de fluxo em Java, usando `if/else`, operador ternario e `switch`.

Arquivos:

- `controle-de-fluxo/README.md`
  - README padrao do projeto Java no VS Code.
- `controle-de-fluxo/.vscode/settings.json`
  - Configuracoes locais do projeto no VS Code.
- `controle-de-fluxo/lib/.gitkeep`
  - Arquivo usado para manter a pasta `lib` no Git.
- `controle-de-fluxo/src/App.java`
  - Classe inicial com mensagem `Hello, World!`.
- `controle-de-fluxo/src/CaixaEletronico.java`
  - Exemplo de saque com verificacao de saldo usando `if/else`.
- `controle-de-fluxo/src/ExemploBreakContinue.java`
  - Exemplo de uso de `break` e `continue` dentro de uma repeticao `for`.
- `controle-de-fluxo/src/ExemploFor.java`
  - Exemplo de repeticao com `for`, contando de 1 ate 20.
- `controle-de-fluxo/src/ExemploForArray.java`
  - Exemplo de repeticao com `for` e `for-each` percorrendo um array de alunos.
- `controle-de-fluxo/src/PlanoOperadora.java`
  - Exemplo de `switch` moderno com planos de operadora `B`, `M` e `T`.
- `controle-de-fluxo/src/ResultadoEscolar.java`
  - Exemplo de resultado escolar com `if`, `else if`, `else` e operador ternario.
- `controle-de-fluxo/src/SistemaMedida.java`
  - Exemplo de `switch` para classificar siglas de tamanho.

### DesafioControleFluxo

Projeto de desafio com leitura de parametros pelo terminal, validacao, excecao personalizada e repeticao com `for`.

Arquivos:

- `DesafioControleFluxo/README.md`
  - README padrao do projeto Java no VS Code.
- `DesafioControleFluxo/.vscode/settings.json`
  - Configuracoes locais do projeto no VS Code.
- `DesafioControleFluxo/lib/.gitkeep`
  - Arquivo usado para manter a pasta `lib` no Git.
- `DesafioControleFluxo/src/Contador.java`
  - Classe com `main` que le dois parametros usando `Scanner`.
  - Usa `try-with-resources` para fechar o `Scanner` automaticamente.
  - Chama o metodo `contar` dentro de um bloco `try/catch`.
  - Valida se o segundo parametro e maior que o primeiro e imprime a contagem com `for`.
- `DesafioControleFluxo/src/ParametrosInvalidosException.java`
  - Excecao personalizada usada quando os parametros informados sao invalidos.

## Estrutura geral

```text
curso-java/
|-- README.md
|-- .gitignore
|-- .vscode/
|-- conta-banco/
|   |-- README.md
|   |-- .vscode/
|   |-- lib/
|   `-- src/
|-- controle-de-fluxo/
|   |-- README.md
|   |-- .vscode/
|   |-- lib/
|   `-- src/
|-- DesafioControleFluxo/
|   |-- README.md
|   |-- .vscode/
|   |-- lib/
|   `-- src/
|-- java-anatomia-classes/
|   |-- README.md
|   |-- .vscode/
|   |-- bin/
|   |-- lib/
|   `-- src/
|-- java-terminal/
|   |-- README.md
|   |-- .vscode/
|   |-- lib/
|   `-- src/
|-- sistema-smart-tv/
|   |-- README.md
|   |-- .vscode/
|   `-- src/
`-- tipos-variaveis/
    |-- README.md
    |-- .vscode/
    |-- lib/
    `-- src/
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
- Controle de fluxo com `switch`
- Criacao de objetos
- Atributos e metodos
- Entrada de dados pelo terminal com `Scanner`
- Comentarios e documentacao de codigo
- JavaDoc
- `try-with-resources`
- Tratamento de excecoes com `try/catch`
- Excecoes personalizadas
- Estrutura de repeticao `for`
- Estrutura de repeticao `for-each`
- Comando `break`
- Comando `continue`
