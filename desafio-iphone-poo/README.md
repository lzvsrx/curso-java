# 📱 Desafio POO — Modelagem e Diagramação de um iPhone

Este projeto foi desenvolvido como parte do desafio de **Programação Orientada a Objetos (POO)** da **Digital Innovation One (DIO)**.

O objetivo é aplicar conceitos de:

* Programação Orientada a Objetos;
* Interfaces;
* Implementação de interfaces;
* Abstração;
* Polimorfismo;
* Modelagem UML;
* Organização de classes em Java.

O desafio consiste em representar alguns dos principais papéis desempenhados por um **iPhone**:

* 🎵 Reprodutor Musical;
* 📞 Aparelho Telefônico;
* 🌐 Navegador na Internet.

---

## 📋 Descrição do Desafio

Com base na apresentação do iPhone, foi realizada uma análise das funcionalidades do aparelho para criar uma representação utilizando **UML e Java**.

A proposta consiste em criar três interfaces:

```text
ReprodutorMusical
AparelhoTelefonico
NavegadorInternet
```

A classe:

```text
IPhone
```

implementa essas três interfaces, demonstrando como um único dispositivo pode assumir diferentes responsabilidades.

---

# 🧩 Estrutura do Projeto

```text
desafio-iphone-poo/
│
├── README.md
│
└── src/
    └── iphone/
        ├── AparelhoTelefonico.java
        ├── IPhone.java
        ├── Main.java
        ├── NavegadorInternet.java
        └── ReprodutorMusical.java
```

---

# 📐 Diagrama UML

```text
                 +--------------------------+
                 |   ReprodutorMusical      |
                 |      <<interface>>       |
                 +--------------------------+
                 | + tocar()                |
                 | + pausar()               |
                 | + selecionarMusica()     |
                 +------------^-------------+
                              |
                              |
+-----------------------------+-----------------------------+
|                           IPhone                          |
+-----------------------------------------------------------+
| - modelo : String                                         |
| - numero : String                                         |
+-----------------------------------------------------------+
| + tocar()                                                 |
| + pausar()                                                |
| + selecionarMusica(String musica)                         |
| + ligar(String numero)                                    |
| + atender()                                               |
| + iniciarCorreioVoz()                                     |
| + exibirPagina(String url)                                |
| + adicionarNovaAba()                                      |
| + atualizarPagina()                                       |
+-----------------------------------------------------------+
              ^                                ^
              |                                |
+-------------+----------+          +----------+------------+
| AparelhoTelefonico     |          | NavegadorInternet     |
|     <<interface>>      |          |     <<interface>>     |
+------------------------+          +-----------------------+
| + ligar(numero)        |          | + exibirPagina(url)   |
| + atender()            |          | + adicionarNovaAba()  |
| + iniciarCorreioVoz()  |          | + atualizarPagina()   |
+------------------------+          +-----------------------+
```

---

# 🎵 Reprodutor Musical

A interface `ReprodutorMusical` representa as funcionalidades relacionadas à reprodução de músicas.

```java
public interface ReprodutorMusical {

    void tocar();

    void pausar();

    void selecionarMusica(String musica);
}
```

### Funcionalidades

| Método               | Descrição                     |
| -------------------- | ----------------------------- |
| `tocar()`            | Inicia a reprodução da música |
| `pausar()`           | Pausa a reprodução            |
| `selecionarMusica()` | Seleciona uma música          |

---

# 📞 Aparelho Telefônico

A interface `AparelhoTelefonico` representa as funcionalidades relacionadas às chamadas telefônicas.

```java
public interface AparelhoTelefonico {

    void ligar(String numero);

    void atender();

    void iniciarCorreioVoz();
}
```

### Funcionalidades

| Método                | Descrição               |
| --------------------- | ----------------------- |
| `ligar()`             | Realiza uma ligação     |
| `atender()`           | Atende uma ligação      |
| `iniciarCorreioVoz()` | Inicia o correio de voz |

---

# 🌐 Navegador na Internet

A interface `NavegadorInternet` representa as funcionalidades relacionadas à navegação na internet.

```java
public interface NavegadorInternet {

    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();
}
```

### Funcionalidades

| Método               | Descrição                    |
| -------------------- | ---------------------------- |
| `exibirPagina()`     | Exibe uma página da internet |
| `adicionarNovaAba()` | Adiciona uma nova aba        |
| `atualizarPagina()`  | Atualiza a página atual      |

---

# 📱 Classe IPhone

A classe `IPhone` implementa as três interfaces.

```java
public class IPhone implements ReprodutorMusical,
        AparelhoTelefonico,
        NavegadorInternet {
```

Dessa forma, um objeto `IPhone` pode funcionar como:

```text
IPhone
 ├── Reprodutor Musical
 ├── Aparelho Telefônico
 └── Navegador Internet
```

Esse é um exemplo da utilização de **interfaces e polimorfismo em Java**.

---

# 💻 Exemplo de Execução

A classe `Main` pode testar todas as funcionalidades:

```java
public class Main {

    public static void main(String[] args) {

        IPhone iphone = new IPhone(
                "iPhone",
                "(35) 99999-9999"
        );

        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("(35) 98888-8888");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
```

---

# 🖥️ Exemplo de Saída

```text
=== IPHONE ===

Modelo: iPhone

=== REPRODUTOR MUSICAL ===
Música selecionada: Imagine - John Lennon
Tocando música...
Música pausada.

=== APARELHO TELEFÔNICO ===
Ligando...
Ligação atendida.
Iniciando correio de voz...

=== NAVEGADOR INTERNET ===
Exibindo página...
Nova aba adicionada.
Atualizando página...
```

---

# 🧠 Conceitos de POO Aplicados

## Abstração

As interfaces representam apenas as funcionalidades necessárias para cada papel desempenhado pelo dispositivo.

## Encapsulamento

Os atributos da classe `IPhone`, como `modelo` e `numero`, podem ser definidos como privados.

```java
private String modelo;
private String numero;
```

O acesso pode ser realizado através de métodos públicos.

## Interfaces

Cada responsabilidade foi separada em uma interface específica.

```text
ReprodutorMusical
AparelhoTelefonico
NavegadorInternet
```

## Polimorfismo

O objeto `IPhone` pode ser referenciado através de diferentes interfaces.

Exemplo:

```java
ReprodutorMusical musica = iphone;

AparelhoTelefonico telefone = iphone;

NavegadorInternet navegador = iphone;
```

Mesmo sendo o mesmo objeto, ele pode assumir diferentes papéis.

---

# 🛠️ Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos
* UML
* Git
* GitHub
* Visual Studio Code

---

# ▶️ Como Executar

Clone o repositório:

```bash
git clone URL-DO-SEU-REPOSITORIO
```

Entre na pasta:

```bash
cd desafio-iphone-poo
```

Compile os arquivos Java:

```bash
javac -d bin src/iphone/*.java
```

Execute:

```bash
java -cp bin iphone.Main
```

---

# 🎯 Objetivos de Aprendizado

Com este projeto foi possível praticar:

* Criação de classes;
* Criação de interfaces;
* Implementação de interfaces;
* Métodos;
* Atributos;
* Encapsulamento;
* Abstração;
* Polimorfismo;
* Modelagem UML;
* Organização de projetos Java.

---

# 📚 Referências

* Digital Innovation One — DIO
* Trilha Java Básico
* Desafio de Programação Orientada a Objetos
* Documentação oficial da linguagem Java
* Apresentação do iPhone utilizada como referência no desafio

---

# 👨‍💻 Autor

**Luiz Otavio Valenzi Sousa**

Desenvolvido como parte dos estudos de **Java e Programação Orientada a Objetos**.

---

## ⭐ Considerações Finais

Este projeto demonstra de forma simples como a **Programação Orientada a Objetos** pode representar elementos do mundo real através de classes e interfaces.

O `IPhone` concentra diferentes funcionalidades em um único dispositivo enquanto as interfaces mantêm as responsabilidades organizadas e separadas.

Se este projeto foi útil, considere deixar uma ⭐ no repositório.
