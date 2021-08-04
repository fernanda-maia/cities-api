# API de Cidades
Projeto feito com os experts da [Digital Innovation One](https://digitalinnovation.one/)


&nbsp;
## Tecnologias
* [PostgreSQL](https://www.postgresql.org/)
* [Java 16](https://docs.oracle.com/en/java/)
* [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
* [Gradle](https://docs.gradle.org/current/userguide/userguide.html)


&nbsp;
## Como Iniciar a Aplicação
1. Inicie o PostgreSQL na porta 5432
2. Crie um Banco de Dados nomeado *cities_api*
3. Altere o arquivo *application.yml* em src/main/resources inserindo os seus dados 
4. Execute as queries disponíveis [aqui](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)
5. Adicione os módulos *cube* e *earthdistance* no banco de dados:
~~~sql
CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
~~~
6. Rode o projeto com o comando:
~~~shell
./gradlew run
~~~
6. Para ver os endpoints disponíveis, acesse:
~~~shell
http://localhost:8080/api/swagger-ui.html
~~~


&nbsp;
## Créditos:
* [Digital Innovation One](https://digitalinnovation.one/)
* [André Gomes](https://github.com/andrelugomes/cities-api) - Código Base disponivel [aqui](https://github.com/andrelugomes/cities-api)
* [Chinnon Santos](https://github.com/chinnonsantos) - SQL disponível [aqui](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)
