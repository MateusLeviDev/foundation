# node-restapi-express
Node é composto por pacotes de módulos. 
Material de estudo Node.js. Trabalhando com seus principais frameworks e banco de dados tanto SQL quanto NoSQL. <br>
Criaçao de aplicações variadas com node.js. <br>
> Entendo que uma das escolhas mais importantes pra definir a arquitetura de um projeto, principalmente no back-end, é se a aplicação é fácil para se testar. Uma aplicação que existe a simplicidade de escrever novos testes automatizados, principalmente testes que estão na base da pirâmide, como o testes unitários. Determinando assim bons padrões de projeto, assim como arquitetura. Primeiramente, o estudo é focado na construção de APIs testáveis, começando por uma das camadas mais importantes da aplicação, que é a camada de domínio. Pensando na aplicação desaclopada de qualquer framework ou lib http, focando em regras de negócio, aplicando testes encima disso, seguido da conexão de frameworks (nest, adonis, express), banco de dados, seja utilizando um orm...

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

- função `.listen` direciona uma porta para ser "escutada", quando executada no host cair aqui dentro do server.js (por exemplo). - doc
- `.writeHead` passando qual status da aplicação. 
- `'Content type': 'application.json'` informando qual tipo de retorno será entregue na req. (formato json)
- `.end` o que de fato envia
