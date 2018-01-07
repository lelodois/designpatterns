# Designpatterns 
É um projeto que combina problemas com soluções que o design patterns propôe.

## Chain of responsibility
* Motivação > Evitar o alto acoplamento entre o chamador e o receptor;
* Solução > Criar uma cadeia de classes;
* Implementação > Classes Arredondadoras com uma implementacão de uma interface;

![alt text](https://github.com/lelodois/sourcecode/blob/master/designpatters/src/main/java/br/lelo/example/designpatters/chainofresponsibility/Chain%20of%20responsibility.png)

## Memento
* Motivação > Controlar histórico de variáveis e seus valores originais;
* Solução > Cria controle que armazena os estados anteriores dos objetos;
* Implementação > Gerenciar status com uma classe que guarda o histórico;
![alt text](https://github.com/lelodois/sourcecode/blob/master/designpatters/src/main/java/br/lelo/example/designpatters/memento/memento.jpg)
	
## Observer
* Motivação > Várias chamadas com alto acoplamento;
* Solução > Desacoplar as chamadas com um padrão de listener;
* Implementação > Interface base com várias implementações que serão disparadas por um publisher;
![alt text](https://github.com/lelodois/sourcecode/blob/master/designpatters/src/main/java/br/lelo/example/designpatters/observer/Observer.png)

## Strategy
* Motivação > Várias estruturas condicionais;
* Solução > Criar uma família de classes que varia o algoritmo 	
* Implementação > Várias implementações de um contrato, cada uma com seu algoritmo
![alt text](https://github.com/lelodois/sourcecode/blob/master/designpatters/src/main/java/br/lelo/example/designpatters/strategy/strategy.jpg)	

## Template method
* Motivação >  Estrutura condicional com código comum, repetindo em diversas implementações;
* Solução > Criar uma classes pai com implementação comum;
* Implementação > Várias implementações que estendem a comum de uma classe pai
![alt text](https://github.com/lelodois/sourcecode/blob/master/designpatters/src/main/java/br/lelo/example/designpatters/templateMethod/Template%20method.png)
  
## Autor
* **Leo Costa** - leoeduar@gmail.com *Initial work* - [lelodois](https://github.com/lelodois)

## Getting Started
  Run Test AppTest.java
