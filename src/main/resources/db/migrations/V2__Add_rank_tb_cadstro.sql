-- V2: Migration para adicionar a coluna de RANK na tabela TB_CADASTRO

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);