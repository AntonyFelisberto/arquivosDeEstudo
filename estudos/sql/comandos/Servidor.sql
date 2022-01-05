create database Servidor;

create table Alunos(
   nome varchar(50) not null,
   idade int not null,
   telefone varchar(20),
   email varchar(50),
   matricula int AUTO_INCREMENT,
   id int increment akways as indentity(start with 1,increment by 1)
);

create table Faculdade(
  professores varchar(50) not null,
  idade int not null,
  telefone varchar(20),
  email varchar(50),
  id int increment akways as indentity(start with 1,increment by 1)
);

/*
  SELECT-seleciona os itens da tabela que serão exibidos
  o asterisco seleciona todos os itens da tabela 
  já o from é que seleciona a tabela que possui os dados]
*/

/*vai mostrar na tela o caractere que escrever */
SELECT "hello world";
/*vai mostrar na tela o numero que digitou */
SELECT 10;
/*vai mostrar na tela o numero que digitou */
SELECT 1.0;

select * from Alunos;
select nome,idade,telefone,email,matricula,id from Alunos;

select * from Alunos where nome like '%santos' or nome like '%obtuso';
select nome,idade,telefone,email,matricula,id from Alunos where email='acertividade@gmail.com' and nome like '%arthur%';

select * from Alunos where nome like '%santos' or nome like '%obtuso' order by id desc;
select nome,idade,telefone,email,matricula,id from Alunos where email='acertividade@gmail.com' and nome like '%arthur%' order by nome asc;

select count(nome),idade,telefone,email,matricula,id from Alunos where email='acertividade@gmail.com' and nome like '%arthur%' order by nome asc;
/*count faz a contagem do numero de iten que tem inserido
  avg traz a média de tudo
  max traz o numero maximo
  min traz o menor numero
  sum soma todos os numeros
*/
select * from Alunos from Alunos join Faculdade on Alunos.id=Faculdade.id;
select Alunos.nome,Faculdade.professores from Alunos join Faculdade on Alunos.id=Faculdade.id;

insert into Alunos(nome,idade,telefone,email) values("morgan",18,"4899-4590","filmagens@gmail.com");
/*
  nunca faça um update e delete sem where (pelo amor de deus não esqueça do where)
*/
update Alunos set nome="carlos",telefone="4002-8922" where id=15;

delete from Alunos where nome like '%morgan' and id=10;
