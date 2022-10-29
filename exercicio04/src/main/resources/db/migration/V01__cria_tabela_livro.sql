CREATE TABLE categoria (
id_categoria serial PRIMARY KEY, 
nome varchar(30)NOT NULL, 
descricao varchar(200));


CREATE TABLE livro (
id_livro serial PRIMARY KEY, 
titulo varchar (40) NOT null,
id_categoria int,
FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria), 
isbn varchar(20) NOT NULL UNIQUE, 
data_publicacao date);


CREATE TABLE associado (
id_associado serial PRIMARY KEY, 
nome varchar (50) NOT NULL, 
telefone varchar(15) NOT NULL, 
cpf varchar (11) NOT NULL, 
logradouro varchar (80) NOT NULL, 
numero varchar (10) NOT NULL, 
complemento varchar (30) NOT NULL,
bairro varchar (50) NOT NULL, 
cidade varchar (50) NOT NULL, 
estado varchar (2) NOT NULL);


CREATE TABLE autor (
id_autor serial PRIMARY KEY, 
nome varchar (50)NOT NULL);


CREATE TABLE categoria (
id_categoria serial PRIMARY KEY, 
nome varchar(30)NOT NULL, 
descricao varchar(200));

CREATE TABLE livro (
id_livro serial PRIMARY KEY, 
titulo varchar (40) NOT null,
id_categoria int,
FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria),
isbn varchar(20) NOT NULL UNIQUE, 
data_publicacao date);

CREATE TABLE associado (
id_associado serial PRIMARY KEY, 
nome varchar (50) NOT NULL, 
telefone varchar(15) NOT NULL, 
cpf varchar (11) NOT NULL, 
logradouro varchar (80) NOT NULL, 
numero varchar (10) NOT NULL, 
complemento varchar (30) NOT NULL,
bairro varchar (50) NOT NULL, 
cidade varchar (50) NOT NULL, 
estado varchar (2) NOT NULL);

CREATE TABLE autor (
id_autor serial PRIMARY KEY, 
nome varchar (50)NOT NULL );

create table livro_autor (
  id_livro int,
   id_autor int,
   foreign key (id_livro) references livro(id_livro),
   foreign key (id_autor) references autor(id_autor),
   primary key (id_livro,id_autor)
);

CREATE TABLE emprestimo (
id_emprestimo serial PRIMARY KEY, 
id_associado int not null,
FOREIGN KEY(id_associado) references associado(id_associado), 
data_emprestimo date NOT null);


CREATE TABLE emprestimo_livro (
id_emprestimo_livro serial PRIMARY KEY, 
id_emprestimo int,
id_livro int,
 FOREIGN KEY (id_emprestimo) references emprestimo(id_emprestimo), 
 FOREIGN KEY (id_livro) references livro(id_livro), 
observacoes_ato_emprestimo varchar (200));

