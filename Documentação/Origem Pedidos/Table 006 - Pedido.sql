CREATE TABLE pedido
(
  ped_codigo integer NOT NULL,
  ped_mesa integer NOT NULL,
  ped_data date,
  ped_hora character(8),
  ped_data_fechamento date,
  ped_valor_total numeric,
  ped_aberto character(1),
  ped_atualizado character(1),
  ped_tipo_pagamento integer NOT NULL,
  CONSTRAINT pk_pedido PRIMARY KEY (ped_codigo),
  CONSTRAINT fk_mesa FOREIGN KEY (ped_mesa)
      REFERENCES mesa (mes_codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_tipo_pagamento FOREIGN KEY (ped_tipo_pagamento)
      REFERENCES tipo_pagamento (tpg_codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION      
)