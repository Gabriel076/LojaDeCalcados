-- criar banco de dados
create database LojaDeCalcados;

-- deletar banco de dados
drop database LojaDeCalcados;

-- criar Tabelas
use LojaDeCalcados;
create table Produto(
	idProduto int AUTO_INCREMENT primary key,
    tipo varchar(15),
    nomeProduto varchar(40),
    preco double,
    numeracao varchar(3)
);

use LojaDeCalcados;
create table Cliente(
	cpfClient varchar(15) primary key,
    nome varchar(50),
    email varchar(50)
);

use LojaDeCalcados;
create table Funcionario(
	cpfFunc varchar(15) primary key,
    nome varchar(50),
    adm boolean,
    idade int,
    login varchar(10),
    senha varchar(10)
);


use LojaDeCalcados;
create table Compra(
	idCompra int AUTO_INCREMENT primary key,
    cpfClient varchar(15),
    cpfFunc varchar(15),
    hora varchar(5),
    valorTotal double,
    desconto double,
    foreign key(cpfClient) references Cliente(cpfClient),
    foreign key(cpfFunc) references Funcionario(cpfFunc)
);

use LojaDeCalcados;
create table ProdutosComprados(
	idProdutos int AUTO_INCREMENT primary key,
    quantidade int,
    idProduto int,
    idCompra int,
    foreign key(idProduto) references Produto(idProduto),
    foreign key(idCompra) references Compra(idCompra)
);

use LojaDeCalcados;
create table NotaFiscal(
	idNotaFiscal int AUTO_INCREMENT primary key,
	idCompra int,
    cpfClient varchar(15),
    cpfFunc varchar(15),
    foreign key(idCompra) references Compra(idCompra),
    foreign key(cpfClient) references Cliente(cpfClient),
    foreign key(cpfFunc) references Funcionario(cpfFunc)
);

use LojaDeCalcados;
create table CargaHoraria(
	idCargahor int auto_increment primary key,
    cpfFunc varchar(10),
    horaEntrada time,
    horaSaida time,
    foreign key(cpfFunc) references Funcionario(cpfFunc)
);




-- cmds
use LojaDeCalcados;
insert into Funcionario(cpfFunc,nome,adm,idade,login,senha) values ("32132321","jorge",true,25,"333","333");

use LojaDeCalcados;
insert into Cliente(cpfClient,nome,email) values ("213.212.222-09","teste1","teste1@gmail.com");

use LojaDeCalcados;
insert into Produto(tipo,nomeProduto,preco,numeracao) values("sapato","pegada",150.0,40);


-- selects 
use LojaDeCalcados;
select* from Produto;

use LojaDeCalcados;
select* from Cliente;

use LojaDeCalcados;
select* from Funcionario;

use LojaDeCalcados;
SELECT * FROM Funcionario WHERE login = '111' and senha = '222' and adm=false;