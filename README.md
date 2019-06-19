# Locadora de Veículos

Projeto do curso Linguagens Comerciais de Programação.  
UNESP Campus de Rio Claro - 5° Semestre - 2019.

## Instalação

Baixe e instale o [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html?ssSourceSiteId=otnpt).  
Baixe e instale o [NetBeans](https://netbeans.org/downloads/8.2/) versão Java EE.  
Baixe e instale o [Docker Compose](https://docs.docker.com/toolbox/overview/).  

## Configuração

### JDK

Painel de Controle > Sistema > Configurações avançadas do sistema > Variáveis de Ambiente  
Adicione as seguintes variáveis de sistema:  

Nome | Valor
--- | ---
_JAVA_HOME_ | Local de instalção do JDK (ex: C:\Program Files\Java\jdk1.8.0_152)
_CLASSPATH_ | .;

### Docker

Abra um terminal e navegue até o diretório do projeto.  
Digite a seguinte sequência de comandos:

```
docker-machine start default
docker-compose up
```

### NetBeans

Arquivo > Abrir Projeto  
Selecione o diretório do projeto.

### Conjunto de Dados de Teste

No pacote _br.unesp.locadora.demo_, abra o arquivo _DadosDemo.java_ e pressione __Shift+F6__.

## Ferramentas

### Portainer

O Portainer é um utilitário visual para o gerenciamento dos containers do Docker.  
No primeiro acesso é preciso configurar a senha do usuário administrador.  
Acesse [192.168.99.100:81](http://192.168.99.100:81).  
Home > PRIMARY > Containers

### phpMyAdmin

O phpMyAdmin é um utilitário visual para o gerenciamento do banco de dados.  
Acesse [192.168.99.100:80](http://192.168.99.100:80).

> Server: mysql  
> Username: root  

## Observações

### Antes de Desligar o Computador

Certifique-se de desligar o Docker com o comando:  

```
docker-machine stop default
```

### Ao Retomar as Atividades

Certifique-se de ligar o Docker com o comando: 

```
docker-machine start default
```

Os conteiners do Portainer, MySQL e phpMyAdmin serão automaticamente ligados.  
Para saber se o Docker está rodando, digite o comando:

```
docker ps
```

Este comando irá listar os containers em funcionamento.  

### Problemas com Endereço IP

Se não conseguir acessar o Portainer e o phpMyAdmin, verifique o endereço do Docker com o comando:

```
docker-machine ip default
```

Caso o número IP seja diferente, não esqueça de alterar a URL do banco de dados no arquivo _persistence.xml_. 