# Academia API — Spring Data JPA

Projeto do desafio de ORM com Spring Data JPA no domínio de uma academia.

## Tecnologias
Java 17, Spring Boot, Spring Web, Spring Data JPA, Bean Validation, H2 e PostgreSQL.

## Executar
1. Instale JDK 17+ e Maven.
2. Abra um terminal na pasta do projeto.
3. Execute `mvn spring-boot:run`.
4. API: `http://localhost:8080`.
5. H2 Console: `http://localhost:8080/h2-console` (JDBC URL `jdbc:h2:mem:academia`, usuário `sa`, senha vazia).

## Endpoints
- `GET /alunos`
- `GET /alunos/{id}`
- `POST /alunos`
- `PUT /alunos/{id}`
- `DELETE /alunos/{id}`
- `GET /avaliacoes`
- `GET /avaliacoes/aluno/{alunoId}`
- `POST /avaliacoes/aluno/{alunoId}`
- `GET /matriculas`
- `POST /matriculas/aluno/{alunoId}`

### Exemplo de aluno
```json
{"nome":"Luiz Otavio","email":"luiz@example.com","telefone":"35999999999","dataNascimento":"2003-01-01"}
```

### Exemplo de avaliação
```json
{"peso":75.5,"altura":1.78}
```

## PostgreSQL
O driver já está no `pom.xml`. Edite `application.properties` conforme as instruções comentadas. Crie o banco `academia` dentro do PostgreSQL/pgAdmin — não execute `CREATE DATABASE` diretamente no PowerShell.
