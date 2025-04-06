Use o seguinte comando no terminal para criar a estrutura de diretórios e o arquivo `README.md` dentro de uma pasta principal, como `IPBDI`:

```bash
mkdir -p IPBDI/{docs,src,exerc,data,notebooks,dashboards} && touch IPBDI/README.md
```

### Explicação:
- `mkdir -p`: cria diretórios de forma recursiva (não dá erro se já existirem).
- `{docs,src,exerc,data,notebooks,dashboards}`: lista os diretórios que serão criados dentro de `IPBDI`.
- `&& touch IPBDI/README.md`: cria um arquivo vazio `README.md` na raiz da pasta `IPBDI`.

Se quiser rodar isso dentro da pasta atual (sem criar `IPBDI`), é só remover `IPBDI/`:

```bash
mkdir -p docs src exerc data notebooks dashboards && touch README.md
```