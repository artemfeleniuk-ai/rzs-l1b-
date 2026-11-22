# Приклади запитів до vinylstore

## Перелік платівок

```bash
curl http://localhost:8080/api/vinyl-records
```

## Одна платівка з деталями

```bash
curl http://localhost:8080/api/vinyl-records/1
```

## Неіснуюча платівка (очікуваний статус 404)

```bash
curl -i http://localhost:8080/api/vinyl-records/999
```
