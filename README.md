# ES_IV_Proxy
Trabalho sobre Eng. de Software IV
O Proxy é um padrão estrutural definido, e o seu objetivo principal é encapsular um objeto através de um outro objeto que possui a mesma interface, de forma que o segundo objeto, conhecido como “Proxy”, controla o acesso ao primeiro, que é o objeto real. A principal vantagem de utilizar o Proxy é que, ao utilizar um substituto, podemos fazer desde operações otimizadas até proteção do acesso ao objeto.

Exemplo: a classe “BancoAlunos” simula o acesso a um banco de dados para recuperar alguns dados, a classe “Proxy” verifica se o acesso pode ser liberado e aciona os métodos da classe real “BancoAlunos”.