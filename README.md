# Magalu Desafio

### Documento do desafio: https://drive.google.com/file/d/1GkY5ZNsxDoiVcdDNCNDxYVd4nrvK_U0x/view

## ENDPOINTS

### `POST /agendamento` - Criar Agendamento

#### Exemplo:
```json
{
  "date": "2026-04-14T20:22:00Z",
  "receiver": "joao.silva@example.com",
  "message": "Reunião marcada para discutir o projeto.",
  "status": "PENDING"
}
```

Os campos no JSON acima significam o seguinte:

| Campo      | Significado                                                   | Obrigatório? |
|------------|---------------------------------------------------------------|--------------|
| `date`    | **Data/Hora no padrão ISO 8601 (`OffsetDateTime`)** em que a transação aconteceu | Sim          |
| `receiver` | Destinatário (Email / Numero)| Sim          |
| `message` | Mensagem a ser entregue ao Destinatário | Sim          |
| `status` | Status do Envio: PENDING, SENT, CANCELED | Sim          |

- `201 Created`
  - Agendamento validado e criado.
  
- `422 Unprocessable Entity` 
  - Agendamento não foi aceito, formatação da data errada, um dos campos do `JSON Null` ou em `Branco(Blank)`, status diferente dos aceitos.

### `GET /agendamento/{id}` (UUID) - Checkar status de Agendamentos por ID

### `GET /agendamento/?receiver={receiver}` - Retorna todos agendamentos para tal "receiver"

#### Retorno:
```json
{
  "date": "2026-04-14T20:22:00Z",
  "receiver": "joao.silva@example.com",
  "message": "Reunião marcada para discutir o projeto.",
  "status": "PENDING"
}
```

- `200 OK`
  - Agendamento encontrado e retornado.
  
- `404 NOT FOUND` 
  - Agendamento não encontrado, possivel ID errado.

### `DELETE /agendamento/{id}` (UUID) - Deletar Agendamentos

#### Retorno:

- `200 OK`
  - Agendamento encontrado e deletado.
  
- `404 NOT FOUND` 
  - Agendamento não encontrado, possivel ID errado.

### `PATCH /agendamento/{id}` (UUID) - Atualizar status de um Agendamento

#### Envio:

```json
{
  "status": "CANCELED"
}
```

#### Retorno:
```json
{
  "date": "2026-04-14T20:22:00Z",
  "receiver": "joao.silva@example.com",
  "message": "Reunião marcada para discutir o projeto.",
  "status": "CANCELED"
}
```

- `200 OK`
  - Agendamento encontrado e status atualizado.
  
- `404 NOT FOUND` 
  - Agendamento não encontrado, possivel ID errado.
