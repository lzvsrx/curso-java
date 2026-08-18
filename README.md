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

### desafio-poo-java

Projeto de desafio de Programacao Orientada a Objetos que simula um bootcamp com cursos, mentorias, devs inscritos, progresso de conteudos e calculo de XP.

Arquivos:

- `desafio-poo-java/src/Main.java`
  - Classe de execucao que cria cursos, mentoria, bootcamp, dev inscrito, progresso e exibicao do XP total.
- `desafio-poo-java/src/br/com/dio/desafio/dominio/Bootcamp.java`
  - Classe que representa um bootcamp com nome, descricao, data inicial, data final, devs inscritos e conteudos.
- `desafio-poo-java/src/br/com/dio/desafio/dominio/Conteudo.java`
  - Classe abstrata base para conteudos, com titulo, descricao e metodo abstrato `calcularXp`.
- `desafio-poo-java/src/br/com/dio/desafio/dominio/Curso.java`
  - Classe de curso que herda de `Conteudo`, possui carga horaria e calcula XP com base nas horas.
- `desafio-poo-java/src/br/com/dio/desafio/dominio/Dev.java`
  - Classe que representa um dev com conteudos inscritos, conteudos concluidos, inscricao em bootcamp, progresso e soma de XP.
- `desafio-poo-java/src/br/com/dio/desafio/dominio/Mentoria.java`
  - Classe de mentoria que herda de `Conteudo`, possui data e calcula XP proprio.

### debugging-java-master

Projeto de estudo sobre debugging em Java, pilha de execucao, stack trace, execucao passo a passo e acompanhamento de fluxo de metodos.

Arquivos:

- `debugging-java-master/README.md`
  - Material explicando conceitos introdutorios de debugging, erros de sintaxe, erros de semantica, depuracao e stack trace.
- `debugging-java-master/.classpath`
  - Configuracao de classpath do Eclipse.
- `debugging-java-master/.project`
  - Configuracao do projeto Eclipse.
- `debugging-java-master/debugging-java.iml`
  - Arquivo de modulo do IntelliJ IDEA.
- `debugging-java-master/.idea/`
  - Configuracoes do projeto no IntelliJ IDEA.
- `debugging-java-master/src/br/com/dio/debbuging/Main.java`
  - Classe com metodos encadeados `a`, `b` e `c`, usada para observar pilha de execucao e fluxo do programa.
- `debugging-java-master/src/br/com/dio/debbuging/CalculadoraDeMedias.java`
  - Classe que usa `Scanner` para receber notas de alunos e calcular a media da turma.
- `debugging-java-master/out/`
  - Arquivos `.class` compilados do projeto.

### exceptions-java-master

Projeto de estudo sobre tratamento de excecoes em Java, incluindo checked exceptions, unchecked exceptions, blocos `try/catch/finally`, `throw`, `throws` e excecoes personalizadas.

Arquivos:

- `exceptions-java-master/README.md`
  - Material explicando conceitos de excecoes, hierarquia de erros, palavras reservadas e boas praticas de tratamento.
- `exceptions-java-master/exceptions-java.iml`
  - Arquivo de modulo do IntelliJ IDEA.
- `exceptions-java-master/.idea/`
  - Configuracoes do projeto no IntelliJ IDEA.
- `exceptions-java-master/romances-blake-crouch.txt`
  - Arquivo de texto usado nos exemplos de leitura de arquivo.
- `exceptions-java-master/src/br/com/dio/exceptions/CheckedException.java`
  - Exemplo de excecao verificada com leitura de arquivo, `FileNotFoundException`, `IOException` e bloco `finally`.
- `exceptions-java-master/src/br/com/dio/exceptions/UncheckedException.java`
  - Exemplo de excecoes nao verificadas com entrada via `JOptionPane`, conversao numerica e divisao por zero.
- `exceptions-java-master/src/br/com/dio/exceptions/DivisaoNaoExataException.java`
  - Classe de excecao personalizada para divisao nao exata.
- `exceptions-java-master/src/br/com/dio/exceptions/ExceptionCustomizada_1.java`
  - Exemplo de excecao personalizada para falha ao abrir arquivo.
- `exceptions-java-master/src/br/com/dio/exceptions/ExceptionCustomizada_2.java`
  - Exemplo de lancamento e captura de excecao personalizada junto com outras excecoes.
- `exceptions-java-master/out/`
  - Arquivos `.class` compilados do projeto.

### curso-dio-intro-java-i-o-master

Projeto de estudo sobre Java I/O, leitura e escrita de arquivos, streams de caracteres, streams de bytes, serializacao de objetos, `DataInputStream`, `DataOutputStream` e tratamento de excecoes em operacoes de arquivo.

Arquivos e pastas principais:

- `curso-dio-intro-java-i-o-master/curso-dio-intro-java-io.iml`
  - Arquivo de modulo do IntelliJ IDEA.
- `curso-dio-intro-java-i-o-master/.idea/`
  - Configuracoes do projeto no IntelliJ IDEA.
- `curso-dio-intro-java-i-o-master/file-input-output.pdf`
  - Material de apoio em PDF sobre entrada e saida de arquivos.
- `curso-dio-intro-java-i-o-master/java.io.IOException-um-breve-resumo.pdf`
  - Material de apoio em PDF sobre `IOException`.
- `curso-dio-intro-java-i-o-master/dica-para-ler-e-escrever-arquivo-java-IO.txt`
  - Arquivo de texto usado nos exemplos de leitura e escrita.
- `curso-dio-intro-java-i-o-master/recomendacoes.txt`
  - Arquivo de texto usado nos exercicios de copia e manipulacao de conteudo.
- `curso-dio-intro-java-i-o-master/recomendacoes-copy.txt`
  - Arquivo de copia usado nos exemplos de I/O.
- `curso-dio-intro-java-i-o-master/recomendacoes-copy2.txt`
  - Arquivo gerado como copia em exemplos com bytes.
- `curso-dio-intro-java-i-o-master/gato`
  - Arquivo usado nos exemplos de serializacao de objeto.
- `curso-dio-intro-java-i-o-master/src/br/com/dio/java/io/IOCharacter/`
  - Exemplos com `File`, leitura e escrita por caracteres, `Reader`, `Writer`, exercicios e versoes comentadas.
- `curso-dio-intro-java-i-o-master/src/br/com/dio/java/io/IOBytes/`
  - Exemplos com `InputStream`, `OutputStream`, `BufferedInputStream` e `BufferedOutputStream`.
- `curso-dio-intro-java-i-o-master/src/br/com/dio/java/io/IOBytes/IOData/`
  - Exemplos com leitura e escrita de dados primitivos usando streams de dados.
- `curso-dio-intro-java-i-o-master/src/br/com/dio/java/io/IOBytes/IOObject/`
  - Exemplos de serializacao e desserializacao de objetos, incluindo as classes `Gato` e `GatoComentado`.
- `curso-dio-intro-java-i-o-master/src/br/com/dio/java/io/IOExceptions/`
  - Exemplos de `try/catch/finally`, `throw`, `throws` e excecoes em abertura de streams.
- `curso-dio-intro-java-i-o-master/out/`
  - Arquivos `.class` compilados do projeto.

### junit5-exemplos-master

Projeto Maven com exemplos de testes unitarios usando JUnit 5, incluindo assertions, assumptions, testes condicionais, ordem de execucao, excecoes e metodos de preparacao/finalizacao.

Arquivos e pastas principais:

- `junit5-exemplos-master/README.md`
  - Documentacao do repositorio de exemplos com JUnit.
- `junit5-exemplos-master/CONFIGURACAO.md`
  - Roteiro de configuracao do JUnit.
- `junit5-exemplos-master/LICENSE`
  - Licenca MIT do projeto.
- `junit5-exemplos-master/pom.xml`
  - Configuracao Maven com Java 11, JUnit Jupiter e plugins de compilacao, jar e Surefire.
- `junit5-exemplos-master/src/main/java/module-info.java`
  - Declaracao de modulo Java.
- `junit5-exemplos-master/src/main/java/com/github/willyancaetano/junit/Conta.java`
  - Classe de conta com numero, saldo, credito e debito.
- `junit5-exemplos-master/src/main/java/com/github/willyancaetano/junit/Pessoa.java`
  - Classe usada nos exemplos de testes com dados de pessoa.
- `junit5-exemplos-master/src/main/java/com/github/willyancaetano/junit/GerenciadorDeConexaoComBancoDeDados.java`
  - Classe usada nos exemplos de ciclo de vida dos testes.
- `junit5-exemplos-master/src/main/java/com/github/willyancaetano/junit/TransferenciaEntreContas.java`
  - Classe que realiza transferencia entre contas e valida valores invalidos.
- `junit5-exemplos-master/src/test/java/com/github/willyancaetano/junit/`
  - Testes com JUnit 5 para assertions, assumptions, condicionais, excecoes, ordem de execucao, conta, pessoa e hooks `before/after`.

### mockito-exemplos-master

Projeto Maven com exemplos de testes usando Mockito em Java, incluindo criacao de mocks, injecao de dependencias, simulacao de retornos, simulacao de erros e verificacao de interacoes.

Arquivos e pastas principais:

- `mockito-exemplos-master/README.md`
  - Documentacao do repositorio de exemplos com Mockito.
- `mockito-exemplos-master/LICENSE`
  - Licenca MIT do projeto.
- `mockito-exemplos-master/pom.xml`
  - Configuracao Maven com Java 11, JUnit Jupiter, Mockito Inline, Mockito JUnit Jupiter, PowerMock e Surefire.
- `mockito-exemplos-master/src/main/java/module-info.java`
  - Declaracao de modulo Java.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/ApiDosCorreios.java`
  - Classe usada como dependencia externa simulada nos testes.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/CadastrarPessoa.java`
  - Classe que cadastra pessoa usando dados de localizacao vindos da API dos Correios.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/Pessoa.java`
  - Classe de dominio com dados pessoais e endereco.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/DadosLocalizacao.java`
  - Classe com dados de endereco usados no cadastro.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/Conta.java`
  - Classe usada nos exemplos de teste com conta.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/EnviarMensagem.java`
  - Classe que guarda mensagens em uma lista imutavel para consulta.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/ServicoEnvioEmail.java`
  - Classe de servico usada nos exemplos de envio de email.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/PlataformaDeEnvio.java`
  - Classe usada nos testes de plataforma de envio.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/GeradorDeNumeros.java`
  - Classe usada nos testes com valores gerados.
- `mockito-exemplos-master/src/main/java/me/dio/mockito/exemplos/Email.java`, `Mensagem.java` e `Formato.java`
  - Classes de apoio para os exemplos de mensagens e emails.
- `mockito-exemplos-master/src/test/java/me/dio/mockito/exemplos/`
  - Testes com Mockito e JUnit para mocks, stubs, excecoes, envio de mensagens, pessoa, conta e servicos.

### dio-springboot-main

Conjunto de projetos de estudo sobre Spring Boot para a Digital Innovation One, cobrindo primeiros passos, IoC/DI, beans, properties, scopes, Spring Data JPA, Hibernate, repositories, APIs web, Swagger, Spring Security, seguranca com banco de dados e JWT.

Arquivos e pastas principais:

- `dio-springboot-main/README.md`
  - README do curso de Spring Boot.
- `dio-springboot-main/.gitignore`
  - Regras de arquivos ignorados do conjunto de projetos.
- `dio-springboot-main/perfil.jpeg`
  - Imagem incluida no material do curso.
- `dio-springboot-main/java-interfaces/`
  - Exemplos de Java com interfaces, enums, cadastro de cliente, locacao de veiculo e arrays.
- `dio-springboot-main/spring-primeiros-passos/`
  - Projeto Spring Boot inicial com aplicacao, calculadora e execucao basica.
- `dio-springboot-main/spring-ioc-di-beans-autowired/`
  - Exemplos de inversao de controle, injecao de dependencias, beans, `Autowired` e conversao JSON.
- `dio-springboot-main/spring-properties-value/`
  - Exemplo de uso de propriedades e injecao de valores com Spring.
- `dio-springboot-main/spring-configuration-properties/`
  - Exemplo de configuracoes agrupadas com `ConfigurationProperties`.
- `dio-springboot-main/spring-scopes-singleton-prototype/`
  - Exemplos de escopos de beans, singleton e prototype.
- `dio-springboot-main/spring-data-jpa-hibernate/`
  - Projeto com Spring Data JPA, Hibernate, entidade `Usuario` e configuracoes de Eclipse.
- `dio-springboot-main/spring-data-jpa-repository/`
  - Projeto com repository, entidade `Usuario` e acesso a dados.
- `dio-springboot-main/dio-spring-data-jpa/`
  - Projeto Spring Data JPA com `User`, `UserRepository` e classe de inicializacao.
- `dio-springboot-main/dio-spring-data-jpa-exception-handler/`
  - Projeto com Spring Data JPA, controller de codigo postal, service e tratamento global de excecoes.
- `dio-springboot-main/springboot-web/`
  - API web com controller, model, repository e Maven Wrapper.
- `dio-springboot-main/springboot-web-swagger/`
  - API web com Swagger, controller de usuario, repository e Maven Wrapper.
- `dio-springboot-main/spring-web-security-configure-adapter/`
  - Exemplo de Spring Security com configuracao baseada em `WebSecurityConfig`.
- `dio-springboot-main/dio-spring-security/`
  - Projeto Spring Security com controller, usuario, repository e carga inicial.
- `dio-springboot-main/spring-web-security-database/`
  - Projeto Spring Security com autenticacao baseada em banco de dados e Maven Wrapper.
- `dio-springboot-main/dio-spring-security-jwt/`
  - Projeto com Spring Security, login, usuarios, DTOs de sessao e componentes JWT.

### design-patterns-java

Projeto de desafio com exemplos de padroes de projeto em Java, usando Singleton, Strategy e Facade em um fluxo simples de compras e pagamentos.

Arquivos:

- `design-patterns-java/src/main/java/br/com/dio/patterns/Main.java`
  - Classe de execucao que demonstra Singleton, Facade e Strategy com compras por PIX, cartao e boleto.
- `design-patterns-java/src/main/java/br/com/dio/patterns/singleton/Configuracao.java`
  - Implementacao de Singleton para manter uma instancia unica de configuracao do sistema.
- `design-patterns-java/src/main/java/br/com/dio/patterns/facade/LojaFacade.java`
  - Facade que simplifica o fluxo de realizacao de compra e processamento de pagamento.
- `design-patterns-java/src/main/java/br/com/dio/patterns/strategy/Pagamento.java`
  - Interface Strategy para formas de pagamento.
- `design-patterns-java/src/main/java/br/com/dio/patterns/strategy/ProcessadorPagamento.java`
  - Classe que recebe e executa a estrategia de pagamento selecionada.
- `design-patterns-java/src/main/java/br/com/dio/patterns/strategy/PagamentoPix.java`
  - Estrategia de pagamento via PIX.
- `design-patterns-java/src/main/java/br/com/dio/patterns/strategy/PagamentoCartao.java`
  - Estrategia de pagamento via cartao.
- `design-patterns-java/src/main/java/br/com/dio/patterns/strategy/PagamentoBoleto.java`
  - Estrategia de pagamento via boleto.

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
|-- desafio-poo-java/
|   `-- src/
|-- debugging-java-master/
|   |-- README.md
|   |-- .idea/
|   |-- out/
|   `-- src/
|-- dio-springboot-main/
|   |-- java-interfaces/
|   |-- spring-primeiros-passos/
|   |-- springboot-web/
|   `-- dio-spring-security-jwt/
|-- design-patterns-java/
|   `-- src/
|-- curso-dio-intro-java-i-o-master/
|   |-- .idea/
|   |-- out/
|   `-- src/
|-- exceptions-java-master/
|   |-- README.md
|   |-- .idea/
|   |-- out/
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
|-- junit5-exemplos-master/
|   |-- pom.xml
|   `-- src/
|-- lab-banco-digital-oo-master/
|   |-- README.md
|   |-- .settings/
|   |-- bin/
|   `-- src/
|-- mockito-exemplos-master/
|   |-- pom.xml
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
- Modelagem de bootcamp com cursos, mentorias e devs
- Calculo de XP com sobrescrita de metodos
- `Set`, `HashSet`, `LinkedHashSet` e `Optional`
- Debugging em Java
- Pilha de execucao e stack trace
- Calculo de media com entrada pelo terminal
- Configuracoes de projeto no IntelliJ IDEA
- Tratamento de excecoes em Java
- Checked exceptions e unchecked exceptions
- Blocos `try`, `catch` e `finally`
- Lancamento de excecoes com `throw` e declaracao com `throws`
- Excecoes personalizadas
- Leitura de arquivos com `FileReader`, `BufferedReader` e `BufferedWriter`
- Java I/O
- Streams de caracteres
- Streams de bytes
- Serializacao e desserializacao de objetos
- `InputStream`, `OutputStream`, `Reader` e `Writer`
- `DataInputStream` e `DataOutputStream`
- Manipulacao de arquivos com `File`
- Testes unitarios com JUnit 5
- Assertions, assumptions e testes condicionais
- Testes de excecoes e ordem de execucao
- Maven Surefire
- Testes com Mockito
- Mocks, stubs e verificacao de interacoes
- Injecao de mocks em testes
- Simulacao de dependencias externas
- Spring Boot
- IoC, DI, beans, `Autowired`, scopes e properties
- Spring Data JPA, Hibernate e repositories
- APIs REST com controllers, models e repositories
- Swagger
- Spring Security
- Autenticacao com banco de dados
- JWT
- Maven Wrapper
- Padroes de projeto
- Singleton
- Strategy
- Facade
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
