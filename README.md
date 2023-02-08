# node-restapi-express
Node é composto por pacotes de módulos. 
Material de estudo Node.js. Trabalhando com seus principais frameworks e banco de dados tanto SQL quanto NoSQL. <br>
Criaçao de aplicações variadas com node.js

# `trabalhando com módulos`
Divisão da aplicação em partes. 
> Sempre que um módulo é chamado, utiliza-se a função `require` (função específica do node)

# `Iniciando aplicação`
Sempre que for instalada uma dependência. 
```
npm init // yarn
```

- `package.json` será o arquivo que contém todas as dependências da aplicação. Arquivo de gerenciamento. Existindo as `dev dependencies`, as dep utilizadas no ambiente de desenvolvimento, além das dep `dependências normais` uma dep para a produção. 
- além das alterações do `scripts`

## `MÓDULO HTTP`
Será criado um servidor para a aplicação onde seja possível fazer requisições utilizando `get`, `post, ``push` & `delete`. Toda req feita vai bater no servidor.  <br>
Dentro da pasta `server.js`
```
http.createServer([options][, requestListener])
```
