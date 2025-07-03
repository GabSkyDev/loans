# Empréstimos — Solução

Este projeto implementa um serviço que determina quais modalidades de empréstimo uma pessoa tem acesso, com base em critérios definidos de renda, idade e localização.

---

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Maven
- Postman (para testes)

---

## Objetivo

Implementar uma API REST que receba os dados do cliente e retorne as modalidades de empréstimo disponíveis, com seus respectivos tipos e taxas de juros.

---

## Exemplo de chamada

### [POST] `/customer-loans`

#### Corpo da requisição

```json
{
    "age": 26,
    "cpf": "275.484.389-23",
    "name": "Vuxaywua Zukiagou",
    "income": 7000.00,
    "location": "SP"
}
```

## Link do desafio:
https://github.com/backend-br/desafios/blob/master/loans/PROBLEM.md
