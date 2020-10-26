CREATE TABLE cardapio
(
  car_codigo integer NOT NULL,
  car_descricao character(30),
  car_grupo integer NOT NULL,
  car_custo numeric,
  car_venda numeric,
  car_foto character(30),
  CONSTRAINT pk_cardapio PRIMARY KEY (car_codigo),
  CONSTRAINT fk_cardapio FOREIGN KEY (car_grupo)
      REFERENCES grupo (gru_codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)