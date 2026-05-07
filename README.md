# Agenda Telefônica em Java com PostgreSQL

Projeto acadêmico desenvolvido para o **Projeto Integrador II-A**, com o objetivo de criar uma aplicação em Java para armazenar e gerenciar contatos telefônicos utilizando operações CRUD e persistência em banco de dados PostgreSQL.

A aplicação será executada via terminal, com um menu simples para interação do usuário, permitindo cadastrar, consultar, atualizar, listar e excluir contatos.

---

## Objetivo do Projeto

O objetivo do projeto é desenvolver uma aplicação de **Agenda Telefônica em Java** capaz de armazenar e gerenciar contatos telefônicos.

Cada contato deverá conter:

- Nome;
- Telefone;
- E-mail.

A aplicação deverá implementar as operações básicas de CRUD:

- **Create**: criar/adicionar contatos;
- **Read**: consultar/listar contatos;
- **Update**: atualizar dados de contatos;
- **Delete**: excluir contatos.

Os dados deverão ser persistidos em um banco de dados relacional, utilizando **PostgreSQL**.

---

## Tecnologias Utilizadas

- Java
- JDK 17 ou superior
- PostgreSQL
- JDBC
- Git
- GitHub
- IDE de desenvolvimento:
  - IntelliJ IDEA;
  - Eclipse;
  - VS Code;
  - ou outra IDE compatível com Java.

---

## Escopo do Projeto

O sistema será uma aplicação Java com execução no terminal.

O projeto deverá conter:

- Classe `Contato`;
- Classe `AgendaTelefonica`;
- Classe principal `AgendaTeste`;
- Conexão com banco de dados PostgreSQL;
- Operações CRUD completas;
- Tratamento de exceções;
- Interface simples via menu no console;
- Dump `.sql` do banco de dados populado;
- Vídeo explicativo demonstrando o funcionamento da aplicação.

---

## Funcionalidades do Sistema

A aplicação deverá permitir ao usuário:

1. Adicionar um novo contato;
2. Buscar um contato pelo nome;
3. Listar todos os contatos cadastrados;
4. Atualizar dados de um contato;
5. Remover um contato existente;
6. Sair do programa.

---

## Estrutura Prevista do Projeto

```text
agenda-telefonica-java/
├── src/
│   ├── model/
│   │   └── Contato.java
│   ├── dao/
│   │   └── ContatoDAO.java
│   ├── database/
│   │   └── Conexao.java
│   ├── service/
│   │   └── AgendaTelefonica.java
│   └── AgendaTeste.java
│
├── database/
│   └── agenda_telefonica.sql
│
├── README.md
└── .gitignore

Organização das Classes
Contato.java

Classe responsável por representar o contato telefônico.

Atributos previstos:

private String nome;
private String telefone;
private String email;

Responsabilidades:

Armazenar os dados de um contato;
Possuir construtores;
Possuir métodos getters e setters;
Representar o objeto principal do sistema.
Conexao.java

Classe responsável por realizar a conexão com o banco de dados PostgreSQL.

Responsabilidades:

Definir URL de conexão;
Definir usuário e senha do banco;
Criar o método de conexão via JDBC;
Tratar possíveis erros de conexão.
ContatoDAO.java

Classe responsável pela comunicação direta com o banco de dados.

Responsabilidades:

Inserir contatos no banco;
Buscar contato pelo nome;
Listar todos os contatos;
Atualizar dados de um contato;
Remover contato;
Executar comandos SQL;
Utilizar PreparedStatement para evitar erros e melhorar a segurança da aplicação.
AgendaTelefonica.java

Classe responsável pela regra de negócio da agenda.

Responsabilidades:

Gerenciar as operações da agenda;
Chamar os métodos da classe ContatoDAO;
Validar informações antes de enviar ao banco;
Organizar os métodos principais solicitados na proposta:
adicionarContato(Contato contato)
removerContato(String nome)
buscarContato(String nome)
listarContatos()

Além desses métodos, o projeto também poderá conter:

atualizarContato(String nome, Contato contatoAtualizado)

Esse método é importante porque a proposta exige CRUD completo, e o CRUD inclui atualização de dados.

AgendaTeste.java

Classe principal do projeto.

Responsabilidades:

Conter o método main;
Exibir o menu de opções;
Receber dados digitados pelo usuário;
Chamar os métodos da classe AgendaTelefonica;
Controlar o fluxo da aplicação;
Permitir que o usuário continue usando o sistema até escolher sair.
Banco de Dados

O banco escolhido para o projeto será o PostgreSQL.

Nome sugerido do banco
agenda_telefonica
Tabela principal
CREATE TABLE contatos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL
);
Exemplo de dados populados
INSERT INTO contatos (nome, telefone, email) VALUES
('Ana Souza', '(62) 99999-1111', 'ana@email.com'),
('Carlos Lima', '(62) 98888-2222', 'carlos@email.com'),
('Mariana Alves', '(62) 97777-3333', 'mariana@email.com');

O arquivo final do banco deverá ser exportado no formato .sql e incluído na entrega do projeto.

Exemplo de Menu da Aplicação
========== AGENDA TELEFÔNICA ==========

1 - Adicionar contato
2 - Buscar contato
3 - Listar contatos
4 - Atualizar contato
5 - Remover contato
6 - Sair

Escolha uma opção:
Regras de Funcionamento
O usuário deverá escolher uma opção no menu;
O sistema deverá solicitar os dados necessários conforme a operação escolhida;
O sistema deverá salvar, consultar, atualizar ou excluir os dados no PostgreSQL;
O sistema deverá exibir mensagens claras de sucesso ou erro;
O sistema deverá impedir operações inválidas;
O sistema deverá tratar casos como:
contato não encontrado;
campos vazios;
erro de conexão com o banco;
opção inválida no menu;
falha ao executar comando SQL.
Tratamento de Exceções

O projeto deverá implementar tratamento de exceções para melhorar a estabilidade da aplicação.

Exemplos de situações que deverão ser tratadas:

Erro ao conectar no banco de dados;
Erro ao inserir contato;
Erro ao buscar contato inexistente;
Erro ao remover contato inexistente;
Erro ao atualizar contato inexistente;
Entrada inválida no menu;
Campos obrigatórios não preenchidos.
