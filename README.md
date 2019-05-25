# Locadora de Veículos

Projeto do curso Linguagens Comerciais de Programação.  
UNESP Campus de Rio Claro - 5° Semestre - 2019.

## Instalação

Baixe e instale o [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html?ssSourceSiteId=otnpt).  
Baixe e instale o [NetBeans](https://netbeans.org/downloads/8.2/) versão Java EE.  
Baixe e instale o [WampServer 3.17](http://www.wampserver.com/en/).  

### Configuração do JDK

Painel de Controle > Sistema > Configurações avançadas do sistema > Variáveis de Ambiente  
Adicione as seguintes variáveis do sistema:  

Nome | Valor
--- | ---
_JAVA_HOME_ | Local de instalção do JDK (ex: C:\Program Files\Java\jdk1.8.0_152)
_CLASSPATH_ | .;

### Configuração do WampServer

Inicie o WampServer e acesse o [phpMyAdmin](http://localhost/phpmyadmin/).  
Em _Base de Dados_, crie uma nova base de dados chamada _locadora_ com collation _utf8_general_ci_.

### Configuração do NetBeans

Arquivo > Abrir Projeto  
Selecione o diretório do projeto.

### Criar Conjunto de Dados de Teste

No pacote _br.unesp.locadora.demo_, abra o arquivo _DadosDemo.java_ e pressione Shift+F6.