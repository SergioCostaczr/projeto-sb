# Web Services com Spring Boot e JPA/Hibernate

Projeto de web services RESTful desenvolvido durante o curso **Java COMPLETO** do [DevSuperior](https://devsuperior.com.br) (Prof. Nelio Alves).

## Sobre o Projeto

Sistema de gerenciamento de pedidos com usuários, produtos, categorias e pagamentos. Implementa operações CRUD completas, tratamento de exceções e relacionamentos entre entidades.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 4
- JPA / Hibernate
- Banco de Dados H2 (teste)
- Maven
- Postman (testes de API)


### Entidades

| Entidade | Descrição |
|----------|-----------|
| User | Usuários do sistema |
| Order | Pedidos realizados |
| OrderItem | Itens de cada pedido |
| Product | Produtos disponíveis |
| Category | Categorias dos produtos |
| Payment | Pagamento do pedido |

## Funcionalidades

- CRUD completo de usuários
- Consulta de pedidos, produtos e categorias
- Relacionamentos JPA (OneToMany, ManyToOne, ManyToMany, OneToOne)
- Chave primária composta (OrderItem)
- Tratamento de exceções personalizado

## Como Executar

1. Clone o repositório
```bash
git clone https://github.com/SergioCostaczr/projeto-sb.git
```

2. Importe o projeto na sua IDE.

3. Execute a classe `ProjetosbApplication.java`

4. Acesse o H2 Console: http://localhost:8080/h2-console
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa`
   - Password: (vazio)

## Endpoints da API

### Users
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/users` | Lista todos os usuários |
| GET | `/users/{id}` | Busca usuário por ID |
| POST | `/users` | Cria novo usuário |
| PUT | `/users/{id}` | Atualiza usuário |
| DELETE | `/users/{id}` | Remove usuário |

### Orders
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/orders` | Lista todos os pedidos |
| GET | `/orders/{id}` | Busca pedido por ID |

### Products
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/products` | Lista todos os produtos |
| GET | `/products/{id}` | Busca produto por ID |

### Categories
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/categories` | Lista todas as categorias |
| GET | `/categories/{id}` | Busca categoria por ID |
