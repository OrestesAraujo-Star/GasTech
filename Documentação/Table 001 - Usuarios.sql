CREATE TABLE usuario
(
  usu_codigo integer NOT NULL,
  usu_nome character(50) NOT NULL,
  usu_senha character(15) NOT NULL,
  usu_nivelacesso character(1) NOT NULL,
  CONSTRAINT pk_usuarios PRIMARY KEY (usu_codigo)
)