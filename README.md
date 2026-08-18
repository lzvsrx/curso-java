# curso-java

Repositorio com exercicios do curso de Java.

## Arquivos da raiz

- `README.md`
  - README principal com a descricao de todos os projetos.
- `.gitignore`
  - Arquivo com regras de arquivos ignorados pelo Git.
- `.vscode/settings.json`
  - Configuracoes gerais do VS Code para o workspace.
- `Ementa-curso.pdf`
  - Ementa do curso em PDF.
- `Ementa-curso.odt`
  - Ementa do curso em formato editavel ODT.

## Projetos do repositorio

### apresentacoes

Pasta com apresentacoes em PowerPoint da trilha Java Basico e Santander Dev Week.

Arquivos principais:

- `apresentacoes/01 - DIO - Trilha - Java Basico - Abertura.pptx`
- `apresentacoes/02 - DIO - Trilha - Java Basico - Fundamentos.pptx`
- `apresentacoes/03 - DIO - Trilha - Java Basico - Sintaxe - Introducao.pptx`
- `apresentacoes/03.03 - DIO - Trilha - Java Basico - Sintaxe - Tipos e Variaveis.pptx`
- `apresentacoes/03.04 - DIO - Trilha - Java Basico - Sintaxe - Operadores.pptx`
- `apresentacoes/03.05 - DIO - Trilha - Java Basico - Sintaxe - Metodos.pptx`
- `apresentacoes/03.06 - DIO - Trilha - Java Basico - Sintaxe - Escopo.pptx`
- `apresentacoes/03.07 - DIO - Trilha - Java Basico - Sintaxe - Palavras reservadas.pptx`
- `apresentacoes/03.08 - DIO - Trilha - Java Basico - Sintaxe - Documentacao.pptx`
- `apresentacoes/03.09 - DIO - Trilha - Java Basico - Sintaxe - Terminal e Argumentos.pptx`
- `apresentacoes/03.10 - DIO - Trilha - Java Basico - Sintaxe - Desafio.pptx`
- `apresentacoes/04 - DIO - Trilha - Java Basico - Controle de Fluxo - Introducao.pptx`
- `apresentacoes/05 - DIO - Trilha - Java Basico - Orientacao a objetos - Introducao.pptx`
- `apresentacoes/Santander Dev Week Setup.pptx`
- `apresentacoes/Santander Dev Week.pptx`
- `apresentacoes/Aula1/`
  - Slides sobre apresentacao, memoria, ambiente, atribuicao e referencia, nos, generics e refatoracao da classe `No`.
- `apresentacoes/Aula2/`
  - Slides sobre pilhas.
- `apresentacoes/Aula3/`
  - Slides sobre filas, nos embutidos e generics.
- `apresentacoes/Aula4/`
  - Slides sobre listas encadeadas.
- `apresentacoes/Aula5/`
  - Slides sobre listas duplamente encadeadas.
- `apresentacoes/Aula6/`
  - Slides sobre listas circulares.
- `apresentacoes/Aula7/`
  - Slides sobre arvores binarias.
- `apresentacoes/Aula8/`
  - Slides sobre `equals`, `hashCode`, `Stack`, `Queue`, `List`, `Set` e `Map`.

### banco-digital

Projeto de banco digital em Java, aplicando Programacao Orientada a Objetos com clientes, contas, heranca, interfaces e operacoes bancarias.

Arquivos:

- `banco-digital/src/banco/Banco.java`
  - Classe que representa o banco, armazena uma lista de contas e lista as contas cadastradas.
- `banco-digital/src/banco/Cliente.java`
  - Classe que representa o cliente com atributo `nome`.
- `banco-digital/src/banco/IConta.java`
  - Interface com operacoes bancarias: `sacar`, `depositar`, `transferir` e `imprimirExtrato`.
- `banco-digital/src/banco/Conta.java`
  - Classe abstrata com agencia, numero, saldo, cliente e implementacao comum das operacoes.
- `banco-digital/src/banco/ContaCorrente.java`
  - Classe de conta corrente que herda de `Conta` e imprime extrato especifico.
- `banco-digital/src/banco/ContaPoupanca.java`
  - Classe de conta poupanca que herda de `Conta` e imprime extrato especifico.
- `banco-digital/src/banco/Main.java`
  - Classe de execucao que cria banco, clientes, contas, deposito, transferencia e extratos.

### lab-banco-digital-oo-master

Projeto de laboratorio de banco digital com Java e Orientacao a Objetos, baseado no desafio de abstracao de um dominio bancario com contas corrente e poupanca.

Arquivos:

- `lab-banco-digital-oo-master/README.md`
  - Documentacao do desafio, conceitos de abstracao, encapsulamento, heranca e polimorfismo.
- `lab-banco-digital-oo-master/.classpath`
  - Configuracao de classpath do Eclipse.
- `lab-banco-digital-oo-master/.project`
  - Configuracao do projeto Eclipse.
- `lab-banco-digital-oo-master/.settings/org.eclipse.jdt.core.prefs`
  - Preferencias do compilador Java no Eclipse.
- `lab-banco-digital-oo-master/src/Banco.java`
  - Classe que representa o banco com nome e lista de contas.
- `lab-banco-digital-oo-master/src/Cliente.java`
  - Classe que representa o cliente com atributo `nome`.
- `lab-banco-digital-oo-master/src/IConta.java`
  - Interface com as operacoes `sacar`, `depositar`, `transferir` e `imprimirExtrato`.
- `lab-banco-digital-oo-master/src/Conta.java`
  - Classe abstrata com agencia, numero, saldo, cliente e implementacao comum das operacoes bancarias.
- `lab-banco-digital-oo-master/src/ContaCorrente.java`
  - Classe de conta corrente que herda de `Conta`.
- `lab-banco-digital-oo-master/src/ContaPoupanca.java`
  - Classe de conta poupanca que herda de `Conta`.
- `lab-banco-digital-oo-master/src/Main.java`
  - Classe de execucao que cria cliente, conta corrente, conta poupanca, deposito, transferencia e extratos.
- `lab-banco-digital-oo-master/bin/`
  - Arquivos `.class` compilados do laboratorio.

### codigo-fonte

Pasta com exemplos de codigo-fonte separados do workspace principal.

Arquivos:

- `codigo-fonte/tipos-variaveis/src/Operadores.java`
  - Classe base para exemplos de operadores.
- `codigo-fonte/tipos-variaveis/src/TiposVariaveis.java`
  - Exemplo de tipos numericos e conversao entre `byte` e `short`.

### desafios

Pasta com enunciados dos desafios da trilha Java Basico.

Arquivos:

- `desafios/sintaxe/README.md`
  - Desafio de sintaxe para criacao do projeto `ContaBanco`.
- `desafios/controle-fluxo/README.md`
  - Desafio de controle de fluxo com parametros, repeticao `for` e excecao personalizada.
- `desafios/poo/README.md`
  - Desafio de POO para modelagem UML e implementacao de um componente iPhone.

### desafio-iphone-poo

Projeto do desafio de Programacao Orientada a Objetos que modela um iPhone usando interfaces, abstracao, encapsulamento e polimorfismo.

Arquivos:

- `desafio-iphone-poo/README.md`
  - Documentacao do desafio, diagrama UML em texto, conceitos aplicados e instrucoes de execucao.
- `desafio-iphone-poo/src/iphone/ReprodutorMusical.java`
  - Interface com os metodos `tocar`, `pausar` e `selecionarMusica`.
- `desafio-iphone-poo/src/iphone/AparelhoTelefonico.java`
  - Interface com os metodos `ligar`, `atender` e `iniciarCorreioVoz`.
- `desafio-iphone-poo/src/iphone/NavegadorInternet.java`
  - Interface com os metodos `exibirPagina`, `adicionarNovaAba` e `atualizarPagina`.
- `desafio-iphone-poo/src/iphone/IPhone.java`
  - Classe que implementa as tres interfaces e concentra as funcionalidades do iPhone.
- `desafio-iphone-poo/src/iphone/Main.java`
  - Classe de execucao que instancia um `IPhone` e testa as funcionalidades de musica, telefone e navegador.
- `desafio-iphone-poo/bin/`
  - Arquivos `.class` compilados do projeto.

### exercicios

Pasta com enunciados de exercicios.

Arquivos:

- `exercicios/README.md`
  - README da trilha Java Basico.
- `exercicios/banco-terminal/README.md`
  - Exercicio de saque em terminal usando saldo, valor solicitado e condicional.

### gitbook

Pasta com material de estudo em Markdown no formato GitBook, incluindo textos e imagens de apoio.

Arquivos e pastas principais:

- `gitbook/README.md`
  - Introducao ao Java Basico.
- `gitbook/SUMMARY.md`
  - Sumario do GitBook.
- `gitbook/fundamentos/`
  - Conteudos sobre historia do Java, plataformas, ambiente de desenvolvimento e IDE.
- `gitbook/sintaxe/`
  - Conteudos sobre anatomia das classes, variaveis, operadores, metodos, escopo, palavras reservadas, documentacao e terminal.
- `gitbook/controle-de-fluxo/`
  - Conteudos sobre condicionais, repeticoes e estruturas excepcionais.
- `gitbook/programacao-orientada-a-objetos/`
  - Conteudos sobre POO, classes, getters/setters, construtores, enums, UML e pilares da POO.
- `gitbook/.gitbook/assets/`
  - Imagens e GIFs usados na documentacao.

### projetos

Pasta com projetos de estruturas de dados em Java, organizados por aulas e etapas. Inclui projetos Maven, arquivos de configuracao da IDE, codigo-fonte e arquivos compilados em `target/`.

Conteudos principais:

- `projetos/Aula1/`
  - Apresentacao, memoria, instalacao/configuracao de ambiente, atribuicao e referencia, conceito de no, generics e refatoracao da classe `No`.
- `projetos/Aula2/`
  - Implementacoes de pilha.
- `projetos/Aula3/`
  - Implementacoes de fila, fila com no embutido e fila com generics.
- `projetos/Aula4/`
  - Lista encadeada.
- `projetos/Aula5/`
  - Lista duplamente encadeada.
- `projetos/Aula6/`
  - Lista circular.
- `projetos/Aula7/`
  - Arvore binaria.
- `projetos/Aula8/`
  - Exemplos com `equals`, `hashCode`, `Stack`, `Queue`, `List`, `Set` e `Map`.

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
- `controle-de-fluxo/src/Aboutme.java`
  - Exemplo de leitura de nome, sobrenome, idade e altura com `Scanner`.
  - Usa `Locale.US`, `try-with-resources` e trata `InputMismatchException`.
- `controle-de-fluxo/src/App.java`
  - Classe inicial com mensagem `Hello, World!`.
- `controle-de-fluxo/src/CaixaEletronico.java`
  - Exemplo de saque com verificacao de saldo usando `if/else`.
- `controle-de-fluxo/src/CepInvalidoException.java`
  - Excecao personalizada para validar CEP com 8 caracteres.
- `controle-de-fluxo/src/ExemplDoWhile.java`
  - Exemplo de repeticao com `do-while`, simulando uma ligacao ate o telefone ser atendido.
- `controle-de-fluxo/src/ExemploBreakContinue.java`
  - Exemplo de uso de `break` e `continue` dentro de uma repeticao `for`.
- `controle-de-fluxo/src/ExemploExcecao.java`
  - Exemplo de tratamento de `ParseException` ao tentar converter texto em numero com `NumberFormat`.
- `controle-de-fluxo/src/ExemploFor.java`
  - Exemplo de repeticao com `for`, contando de 1 ate 20.
- `controle-de-fluxo/src/ExemploForArray.java`
  - Exemplo de repeticao com `for` e `for-each` percorrendo um array de alunos.
- `controle-de-fluxo/src/ExemploWhile.java`
  - Exemplo de repeticao com `while`, simulando gastos de uma mesada com valores aleatorios.
- `controle-de-fluxo/src/FormatarCep.java`
  - Exemplo de metodo que valida e formata CEP, lancando `CepInvalidoException` quando necessario.
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
|-- Ementa-curso.odt
|-- Ementa-curso.pdf
|-- apresentacoes/
|-- banco-digital/
|   `-- src/
|-- codigo-fonte/
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
|-- desafio-iphone-poo/
|   |-- README.md
|   |-- bin/
|   `-- src/
|-- desafios/
|-- exercicios/
|-- gitbook/
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
|-- lab-banco-digital-oo-master/
|   |-- README.md
|   |-- .settings/
|   |-- bin/
|   `-- src/
|-- projetos/
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
- Tratamento de erro de entrada com `InputMismatchException`
- Tratamento de conversao com `ParseException`
- Formatacao e validacao de CEP
- Estrutura de repeticao `for`
- Estrutura de repeticao `for-each`
- Estrutura de repeticao `while`
- Estrutura de repeticao `do-while`
- Comando `break`
- Comando `continue`
- Materiais de apoio em PowerPoint
- Documentacao em GitBook
- Enunciados de desafios e exercicios
- Introducao a Programacao Orientada a Objetos
- UML
- Interfaces
- Encapsulamento
- Abstracao
- Polimorfismo
- Classes abstratas
- Heranca
- Listas com `ArrayList`
- Operacoes bancarias com saque, deposito e transferencia
- Projetos Java com configuracao do Eclipse
- Estruturas de dados
- Nos e encadeamento
- Pilhas
- Filas
- Listas encadeadas
- Listas duplamente encadeadas
- Listas circulares
- Arvores binarias
- Generics
- `equals` e `hashCode`
- Collections: `Stack`, `Queue`, `List`, `Set` e `Map`
- Maven
