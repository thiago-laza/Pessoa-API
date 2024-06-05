# Pessoa-API
# Pessoa API

Este projeto é uma API RESTful desenvolvida em Java com o framework Spring Boot. O objetivo é servir como base de estudo para Java Web, Spring Boot e construção de APIs RESTful.

## Índice

- [Introdução](#introdução)
- [Requisitos](#requisitos)
- [Instalação](#instalação)
- [Execução](#execução)
- [Endpoints da API](#endpoints-da-api)
  - [Criar uma nova pessoa](#criar-uma-nova-pessoa)
  - [Obter todas as pessoas](#obter-todas-as-pessoas)
  - [Obter uma pessoa pelo ID](#obter-uma-pessoa-pelo-id)
  - [Atualizar uma pessoa pelo ID](#atualizar-uma-pessoa-pelo-id)
  - [Deletar uma pessoa pelo ID](#deletar-uma-pessoa-pelo-id)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Introdução

A Pessoa API permite a criação, leitura, atualização e deleção (CRUD) de registros de pessoas. Este projeto foi desenvolvido para ajudar no aprendizado de conceitos e práticas de desenvolvimento de APIs com Spring Boot.

## Requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/installer/)
- [Git](https://git-scm.com/downloads)

## Instalação

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/pessoa-api.git
    cd pessoa-api
    ```

2. Configure o banco de dados MySQL:

    - Crie um banco de dados chamado `pessoas`.
    - Atualize as informações de configuração do banco de dados no arquivo `application.properties`:

      ```properties
      spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/pessoas
      spring.datasource.username=root
      spring.datasource.password=sua_senha
      spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
      spring.jpa.hibernate.ddl-auto=update
      ```

3. Instale as dependências e compile o projeto com Maven:

    ```bash
    mvn clean install
    ```

## Execução

Para executar a aplicação, utilize o comando:

```bash
mvn spring-boot:run
