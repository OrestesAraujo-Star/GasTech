CREATE TABLE grupo
(
  gru_codigo integer NOT NULL,
  gru_nome character(5),
  gru_descricao character(30),
  CONSTRAINT pk_grupo PRIMARY KEY (gru_codigo)
)