# ☕ CRUD de Clientes — Java

<p align="center">
  Um projeto desenvolvido para praticar Java, Programação Orientada a Objetos (POO) e Collections.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/POO-Programação%20Orientada%20a%20Objetos-blue?style=for-the-badge" alt="POO">
  <img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge" alt="Status do projeto">
</p>

---

## 📌 Sobre o projeto

O **CRUD de Clientes** é um projeto desenvolvido em Java puro com o objetivo de colocar em prática conceitos fundamentais da linguagem e da Programação Orientada a Objetos.

O sistema permite gerenciar clientes em memória, utilizando estruturas de dados do Java Collections Framework para armazenar, consultar, atualizar e remover registros.

O projeto também implementa a geração automática de IDs e a validação de e-mails duplicados durante o cadastro.

## ⚙️ Funcionalidades

- ✅ **Cadastrar clientes:** gera IDs automaticamente e impede o cadastro de e-mails duplicados.
- ✅ **Listar clientes:** retorna uma nova lista de clientes na ordem de cadastro.
- ✅ **Buscar por ID:** localiza um cliente específico.
- ✅ **Atualizar e-mail:** modifica o e-mail de um cliente cadastrado.
- ✅ **Remover clientes:** exclui registros utilizando o ID.
- ✅ **Controle de IDs:** não reutiliza identificadores de clientes removidos.

## 🛠️ Tecnologias e conceitos

| Tecnologia / conceito | Aplicação no projeto |
|---|---|
| Java | Linguagem de programação utilizada |
| Programação Orientada a Objetos (POO) | Organização em classes e encapsulamento |
| Collections Framework | Manipulação e organização dos dados |
| `Map` | Associação entre IDs e clientes |
| `LinkedHashMap` | Armazenamento dos clientes preservando a ordem de cadastro |
| `ArrayList` | Criação de listas para exibição dos clientes |
| Encapsulamento | Proteção dos atributos da classe `Cliente` |
| Métodos e construtores | Criação e manipulação dos objetos |

## 🧱 Estrutura do projeto

```text
CRUD_Cliente/
├── Cliente.java
└── ClienteService.java
```

### `Cliente.java`

Representa um cliente e contém seus atributos:

- `id`
- `nome`
- `email`

A classe utiliza atributos privados, construtor, getters, setter para o e-mail e sobrescrita do método `toString()`.

### `ClienteService.java`

Responsável pelas operações do CRUD e pelo gerenciamento dos clientes armazenados em um `LinkedHashMap`.

Centraliza as regras de cadastro, consulta, atualização e remoção dos registros.

## 🚀 Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/ArthurCorreia-DevBR/CRUD_Cliente.git
   ```

2. Abra os arquivos em uma IDE compatível com Java, como o IntelliJ IDEA.

3. Configure o projeto e crie uma classe `Main` para instanciar `ClienteService` e testar as operações disponíveis.

> **Observação:** os dados são armazenados em memória e não são persistidos após o encerramento do programa.

## 🎯 Objetivo de aprendizagem

Este projeto faz parte da minha jornada de estudos em Java e tem como objetivo consolidar conhecimentos por meio da prática, desenvolvendo a capacidade de estruturar classes, manipular coleções e implementar regras de negócio.

## 👨‍💻 Autor

**Arthur Correia**

- 💻 **GitHub:** [ArthurCorreia-DevBR](https://github.com/ArthurCorreia-DevBR)
- 🔗 **LinkedIn:** [Arthur Correia de Oliveira](https://www.linkedin.com/in/arthur-correia-de-oliveira-890146274/)

---

<p align="center">
  Desenvolvido com ☕ e dedicação aos estudos de Java.
</p>
