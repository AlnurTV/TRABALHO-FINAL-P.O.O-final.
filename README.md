
# 🎮 Steam Roxa - API de Gerenciamento de Jogos

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos, utilizando **Spring Boot** para criar um microserviço RESTful com persistência em banco de dados, documentação automática e testes unitários.

---

## 📌 Objetivo

Criar um microserviço para gerenciar uma biblioteca de jogos, com funcionalidades para cadastrar, buscar, atualizar e excluir jogos.

---

## 🚀 Tecnologias Utilizadas

- Java 23
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (Desenvolvimento)
- PostgreSQL ou MySQL (Produção - opcional)
- Swagger / Springdoc OpenAPI
- JUnit 5
- Mockito
- Maven

---

## 📁 Estrutura de Pacotes

```
steamRoxa/
├── controller/
├── model/
├── repository/
└── config/
```

---

## 📚 Funcionalidades da API

| Método | Endpoint            | Descrição                            |
|--------|---------------------|--------------------------------------|
| POST   | `/games`            | Cadastrar um novo jogo               |
| GET    | `/games`            | Listar todos os jogos                |
| GET    | `/games/{id}`       | Buscar jogo por ID                   |
| PUT    | `/games/{id}`       | Atualizar dados de um jogo           |
| DELETE | `/games/{id}`       | Remover jogo do sistema              |
| GET    | `/games/filter?name={nome}` | Filtrar jogos por nome (exemplo)   |

---

## ✅ Validações

- Campos obrigatórios validados com anotações como `@NotNull`, `@Size`, `@Min`, etc.
- Tratamento de exceções personalizado (opcional).

---

## 🧪 Testes

- Testes de unidade usando **JUnit 5** e **Mockito**
- Cobertura mínima de 90% nas camadas de serviço e controller
- Relatórios gerados com **JaCoCo** (copertura de testes)

---

## 📝 Documentação da API

A documentação Swagger está disponível em:

```
http://localhost:8080/swagger-ui.html
```

Ou, se estiver usando Springdoc:

```
http://localhost:8080/swagger-ui/index.html
```

---

## ▶️ Como Executar

### Pré-requisitos

- Java 17+
- Maven 3.8+
- Git

### Rodando localmente

```bash
git clone https://github.com/SEU_USUARIO/steamRoxa.git
cd steamRoxa
./mvnw spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

---

## 🗃️ Banco de Dados

Utiliza H2 para testes locais. A interface do console H2 pode ser acessada via:

```
http://localhost:8080/h2-console
```

- JDBC URL: `jdbc:h2:mem:testdb`
- Usuário: `usuario`
- Senha: 'Senha@123'

---

## 👥 Equipe

- Matheus Antunes RA: 208239
- Bruno Sutil RA: 078224
- Nicolas Magalhães RA: 212907
- João Vitor Macedo Ra: 208701

---

## 🔀 Git e Versionamento

- Uso de branches para features e correções
- Pull Requests para integração

---

## 📄 Licença

Este projeto é acadêmico e não possui fins comerciais.
