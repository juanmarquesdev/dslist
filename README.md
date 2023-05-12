
# dslist

Esse projeto foi realizado seguindo um instensivão Java Spring lecionado por Nélio Alves da [DevSuperior](https://github.com/devsuperior). Se trata de uma aplicação backend criada em Java com o Framework Spring. Essa aplicação é uma API que retorna dados sobre alguns jogos, classificando eles em uma lista.

# Acessar API
[API](https://dslist-production-30f8.up.railway.app/games)



## Demonstração

![](https://github.com/juanmarquesdev/dslist/blob/main/gif/gif-postman-dslist.gif?raw=true)

## Documentação da API

#### Retorna todos os jogos

```http
  GET /games
```

#### Retorna um jogo pelo id

```http
  GET /games/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `int` | **Obrigatório**. O ID do jogo que você quer |


#### Retorna todas as listas

```http
  GET /lists
```

#### Retorna todos os jogos de uma lista
```http
  GET /lists/${id}/games
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `int` | **Obrigatório**. O ID da lista que você quer |
## Aprendizados

- Conceitos
    - Sistemas web e recursos
    - Cliente/servidor, HTTP, JSON
    - Padrão Rest para API web
- Estruturação de projeto Spring Rest
- Entidades e ORM
- Database seeding
- Padrão camadas
- Controller, service, repository
- Padrão DTO
- Relacionamentos N-N
- Classe de associação, embedded id
- Consultas SQL no Spring Data JPA
- Projections
- Perfis de projeto
- Ambiente local com Docker Compose
- Processo de homologação local
- Processo de deploy com CI/CD
- Configuração de CORS

