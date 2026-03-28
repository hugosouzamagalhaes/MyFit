# MyFit - Gerenciador de Treinos em Java 🏋️‍♂️

Uma aplicação de terminal (CLI) desenvolvida em Java puro para gerenciamento de fichas de academia. 

Este projeto foi construído com foco em aplicar os pilares da Orientação a Objetos e boas práticas de engenharia de software, garantindo a integridade dos dados e a persistência em disco.

## 🚀 Funcionalidades

* **Cadastro Dinâmico:** Criação de rotinas de treino personalizadas (ex: Peito e Tríceps, Quadríceps e Glúteos) com múltiplos exercícios.
* **Validação de Entrada (Sanitização):** O sistema impede o cadastro de dados fisicamente impossíveis (como séries nulas ou cargas negativas), garantindo a robustez da aplicação.
* **Persistência de Dados (I/O):** Os treinos não são perdidos ao fechar o programa. O sistema gera automaticamente arquivos `.txt` com os dados estruturados no formato CSV (separados por `;`).
* **Engenharia Reversa (Leitura):** O sistema é capaz de ler os arquivos locais, fatiar os dados e reconstruir os objetos `Exercicio` diretamente para a memória RAM.

## 🛠️ Tecnologias e Conceitos Aplicados

* **Java (JDK):** Linguagem base.
* **Programação Orientada a Objetos (POO):** Classes, Objetos, Construtores, Encapsulamento (Getters/Setters).
* **Estruturas de Controle:** Laços de repetição (`while`, `for-each`) e menus interativos com `switch-case`.
* **Manipulação de Arquivos:** `FileWriter`, `PrintWriter`, `Scanner` e tratamento de exceções (`try-catch`, `IOException`).

## ⚙️ Como executar

1. Clone este repositório.
2. Compile as classes Java: `javac Main.java Exercicio.java Treino.java`
3. Execute o sistema: `java Main`
