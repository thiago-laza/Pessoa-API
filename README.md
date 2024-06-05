
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
```

A API estará disponível em `http://localhost:8080`.

## Endpoints da API

### Criar uma nova pessoa

- **URL:** `/pessoas`
- **Método:** `POST`
- **Corpo da Requisição:**
  ```json
  {
    "name": "Thiago",
    "age": 41,
    "weight": 65,
    "height": 1.75
  }
  ```

### Obter todas as pessoas

- **URL:** `/pessoas`
- **Método:** `GET`

### Obter uma pessoa pelo ID

- **URL:** `/pessoas/{id}`
- **Método:** `GET`

### Atualizar uma pessoa pelo ID

- **URL:** `/pessoas/{id}`
- **Método:** `PUT`
- **Corpo da Requisição:**
  ```json
  {
    "name": "Thiago Atualizado",
    "age": 42,
    "weight": 70,
    "height": 1.75
  }
  ```

### Deletar uma pessoa pelo ID

- **URL:** `/pessoas/{id}`
- **Método:** `DELETE`

## Contribuindo

Se você deseja contribuir com este projeto, por favor, siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Comite suas alterações (`git commit -am 'Adiciona nova feature'`).
4. Faça o push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Espero que este projeto sirva como uma boa base para seus estudos e ajude você e seus colegas a entender melhor o desenvolvimento de APIs RESTful com Spring Boot. Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para abrir uma issue ou um pull request.
```

Você pode criar um arquivo chamado `README.md` no seu repositório e colar o conteúdo acima nele. Isso fornecerá uma documentação clara e organizada para você e seus colegas.
