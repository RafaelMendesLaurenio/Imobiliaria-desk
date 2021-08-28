# Imobiliaria
Projeto da escola que consiste em fazer um sistema de aluguel de imóveis.
banco de dados:
create table locador(
i_locador_locador int primary key auto_increment,
s_nome_locador varchar(100) not null,
s_estado_civil_locador varchar(100) not null,
s_profissao_locador varchar(100) not null,
s_endereco_locador varchar(100) not null,
i_CPF_locador int not null
);

create table locatario(
i_locatario_locatario int primary key auto_increment,
s_nome_locatario varchar(100) not null,
s_estado_civil_locatario varchar(100) not null,
s_profissao_locatario varchar(100) not null,
s_endereco_locatario varchar(100) not null,
i_CPF_locatario int not null
);

create table imovel(
i_imovel_imovel int primary key auto_increment,
s_endereco_imovel varchar(100) not null,
s_estado_conservacao_imovel varchar(100) not null,
s_descricao_imovel varchar(500) not null,
);

create table contrato(
i_contrato_contrato int primary key auto_increment,
i_valor_contrato int not null,
s_duracao_locacao varchar(100) not null,
s_forma_pagamento varchar(100) not null,
i_id_locador int not null,
i_id_locatario int not null,
i_id_imovel int not null
);
