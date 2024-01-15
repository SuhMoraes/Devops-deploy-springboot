# Documentação do Projeto: Deploy API Spring Boot + PostgreSQL no Railway

## Ferramentas Utilizadas
- Java 17
- Spring Boot 3.2.1
- Spring Web
- JPA
- PostgreSQL
- Lombok
- Swagger
- Docker-compose
- Railway
- Postman

## Passo 1: Configuração do Projeto no Spring Initializr
1. Acesse [Spring Initializr](https://start.spring.io/) e configure o projeto com as dependências necessárias.
2. Adicione as dependências do Spring Web, JPA, Lombok e outras necessárias.

## Passo 2: Criação da Entity, Controller, Repository
- Crie as entidades, controladores e repositórios necessários para a aplicação Spring Boot.

## Passo 3: Implementação do Swagger
- Adicione a dependência do Swagger ao seu projeto no arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.0.2</version>
</dependency>
```
- Acesse `localhost:8080/swagger-ui/index.html` para visualizar a documentação.

## Passo 4: Implementação do Banco PostgreSQL no Application Properties
- Configure as propriedades do banco de dados PostgreSQL no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seubanco
spring.datasource.username=postgres
spring.datasource.password=1234
```
## Passo 5: Configuração do Banco de Dados PostgreSQL via Docker-compose

Crie um arquivo `docker-compose.yml` com a seguinte configuração:

```yaml
version: "3.8"
services:
  dcs-postgres:
    image: postgres:15.3-alpine
    container_name: deploy-spring-postgres
    restart: always
    environment:
      POSTGRES_PASSWORD: 1234
      POSTGRES_USER: postgres
    ports:
      - 5432:5432
    volumes:
      - ./data/postgres:/var/lib/postgresql/data

networks:
  default:
    name: local-network
    external: true
```
## Passo 6: Configurar o Railway para Hospedar a Aplicação

1. Acesse o site da [Railway](https://railway.app/) e faça login com sua conta do GitHub.
2. Escolha o repositório da aplicação que você deseja subir na nuvem.

## Passo 7: Criação da Branch Develop

Crie uma branch `develop` para o desenvolvimento contínuo do seu projeto.

## Passo 8: Teste da Aplicação Rodando na Nuvem

Após o deploy no Railway, teste a aplicação acessando a URL fornecida pela plataforma.

## Passo 9: Configuração do Banco de Dados no Railway

Configure as variáveis de ambiente no Railway para a conexão com o banco de dados PostgreSQL.

## Passo 10: Teste a aplicação que está na nuvem no Postman, para ter a certeza de que a comunicação em nuvem esteja funcionando.

### GET
```arduino
https://{nomedasuaaplicacao}.up.railway.app/users
```
### POST
```arduino
https://{nomedasuaaplicacao}.up.railway.app/users
```

