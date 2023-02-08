const http = require("http");

http.createServer((req, res) => {
    res.writeHead(200, { 'Content type': 'application.json' });
    res.end(JSON.stringify({
        data: 'Fala, levs'
    }));
})
.listen(4001, console.log("Porta: 4001"));