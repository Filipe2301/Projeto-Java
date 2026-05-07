# Calculadora Java

Projeto acadêmico desenvolvido em Java com o objetivo de aplicar conceitos de programação orientada a objetos, estruturação de classes, organização de código, interação com o usuário e divisão de responsabilidades entre os integrantes.

## Objetivo do Projeto

O projeto tem como objetivo desenvolver uma calculadora em Java capaz de realizar operações matemáticas básicas, permitindo que o usuário interaja com o sistema por meio de um menu simples no terminal.

A aplicação deverá permitir:

- Somar dois números;
- Subtrair dois números;
- Multiplicar dois números;
- Dividir dois números;
- Validar entradas inválidas;
- Tratar erros, como divisão por zero;
- Exibir o resultado da operação escolhida;
- Permitir que o usuário realize novas operações até decidir sair.

## Tecnologias Utilizadas

- Java
- JDK
- IDE de desenvolvimento, como IntelliJ IDEA, Eclipse ou VS Code
- Git e GitHub para versionamento
- Postgresql para Banco de Dados

## Estrutura Prevista do Projeto

```text
Calculadora-Java/
├── src/
│   ├── Calculadora.java
│   ├── Operacoes.java
│   └── Main.java
├── README.md
└── .gitignore

Organização das Classes
Main.java

Classe principal do projeto.

Responsável por:

Iniciar a aplicação;
Exibir o menu de opções;
Receber os dados digitados pelo usuário;
Chamar os métodos responsáveis pelas operações;
Controlar o encerramento do programa.
Calculadora.java

Classe responsável pela lógica principal da calculadora.

Responsável por:

Receber os números informados;
Encaminhar a operação escolhida;
Retornar o resultado;
Organizar o fluxo de cálculo.
Operacoes.java

Classe responsável por armazenar os métodos matemáticos.

Responsável por:

Método de soma;
Método de subtração;
Método de multiplicação;
Método de divisão;
Validação de divisão por zero.
