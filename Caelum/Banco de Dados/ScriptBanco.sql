-- criando banco
create database fj21;

-- Ultilizar o banco de dados
 use fj21;
 
 -- Criar tabela contato

create table contatos (
id BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
email VARCHAR(255),
endereco VARCHAR(255),
dataNascimento DATE,
primary key (id) );

--criar tabela Funcionario
create table funcionario (
id BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
usuario VARCHAR(40),
senha VARCHAR(40),
primary key (id) );
 