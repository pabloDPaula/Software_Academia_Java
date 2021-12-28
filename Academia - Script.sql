create database academia;
use academia;

create table alunos(
matricula int primary key not null auto_increment,
nome varchar(80)not null,
modalidade varchar (45),
turno varchar(45)not null,
dias varchar(45)not null,
horario varchar (45)not null,
turma varchar(45)not null,
professor varchar(45)not null,
situacao varchar(45)not null,
dataNascimento varchar(45)not null,
dataAdmissao varchar(45)not null)auto_increment = 1;

create table controleFinanceiro(
codMatricula int not null,
foreign key (codMatricula) references alunos(matricula),
planoMensalidade varchar(45),
valorMensalidade float not null,
dataVencimento varchar(45) not null,
avisoPendencia varchar(45) not null,
formaPagamento varchar(45) not null,
situacaoPagamento varchar (45) not null,
dataPagamento varchar(45) not null,
valorPago float not null);

create table controleAcesso(
entrada varchar(80));

insert into alunos (nome,modalidade,turno,dias,horario,turma,professor,situacao,dataNascimento,dataAdmissao) values
('Bruno','Musculação','Noturno','20','20:00','A','Sandro','Ativado','10/03/1999','01/07/2015'),
('Pablo','Luta','Matutino','15','08:00','karatê','Lucas','Desativado','24/07/1998','02/08/2016'),
('Wihalley','Hidroginástica','Vespertino','15','15:30','Idosos','Maria','Ativado','21/08/1989','03/09/2014'),
('André','Ballet','Vespertino','20','15:30','Infantil','Maria','Desativado','22/12/1996','04/10/2017'),
('Isac','Musculação','Matutino','20','08:00','A','Sandro','Ativado','23/09/1997','05/02/2015');

insert into controleFinanceiro (codMatricula,planoMensalidade, valorMensalidade, dataVencimento, avisoPendencia, formaPagamento, situacaoPagamento, dataPagamento, valorPago) values
(1,'Anual',900,'10/08/2015','xxx','Cartão','xxx','05/08/2015',900),
(2,'Trimestral',225,'10/09/2016','xxx','Boleto','xxx','05/09/2016',225),
(3,'Semestral',360,'10/10/2014','xxx','Cheque','xxx','05/10/2014',360),
(4,'Mensal',80,'10/11/2017','xxx','Dinheiro','xxx','05/11/2017',80),
(5,'Trimestral',225,'10/03/2015','xxx','Cartão','xxx','05/03/2015',225);
