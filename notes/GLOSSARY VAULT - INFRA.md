##### Terraform
you can use terraform to create cloud storage buckets e pubsub topics on gcp 

#### IAAS e PASS
- use only infra from cloud provider
- voce é responsavel por uma serie de responsablidades.

```
application
application runtime
OS
Virtulization
Physical Hardware
Networking
```

- uma alternativa para isso foi `PAAS`. ou seja, usar uma plataforma provided pelo cloud
- cloud provider is responsible for: OS, app runtime, auto scaling & load balacing
- voce é responsavel por config (app and service) e app code
- examples: google app engine, elastic beanstalk AWS e appservice Azure


#### MS
conseguimos buildar varios serviços em diversas langs. uma baita problema é que os deploy vao ficando mais complexos
- garantimos isso 100% usando containers
- containers: criar docker images que possui tudo que precisa pra rodar o app.
- podemos criar a image em varias langs.
- applciation code and dependencies
- runs the same way on any infra: local machine, corporate dc, cloud
- docker provides isolation for containers

- ![image](https://github.com/user-attachments/assets/314f1e58-9890-44ce-a19a-012a72b02965)

app engine foi um dos primeiros serviços de nuvem. de 2008.
app engine
- simples way to deploy and acle your app in GCP. provides end to end app management
- supports go, java, .net, node.js...
- no usage charges

- compute engine the fornece um controle maior sobre a app. ja o app engine é uma amenira mais facil de deploy porem oferece menos flexibilidade
- quando estamos impl o app engine no segundo plano: a deployment package is created. é informado a um serviço de armazenamento  de objetos que é o google cloud storage
