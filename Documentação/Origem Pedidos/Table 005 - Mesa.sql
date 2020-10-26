CREATE TABLE mesa
(
  mes_codigo integer NOT NULL,
  mes_descricao character(3),
  mes_localizacao character(20),
  CONSTRAINT pk_mesa PRIMARY KEY (mes_codigo)
)