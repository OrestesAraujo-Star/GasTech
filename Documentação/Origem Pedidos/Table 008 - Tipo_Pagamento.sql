CREATE TABLE tipo_pagamento
(
  tpg_codigo integer NOT NULL,
  tpg_descricao character(30),
  CONSTRAINT pk_tipo_pagamento PRIMARY KEY (tpg_codigo)
)