CREATE TABLE produto_pedido
(
  ppe_codigo integer NOT NULL,
  ppe_pedido integer NOT NULL,
  ppe_garcom integer NOT NULL,
  ppe_cardapio integer NOT NULL,
  ppe_quantidade numeric,  
  ppe_valor_venda numeric, 
  ppe_valor_total_item numeric, 
  CONSTRAINT pk_produto_pedido PRIMARY KEY (ppe_codigo),
  CONSTRAINT fk_pedido FOREIGN KEY (ppe_pedido)
      REFERENCES pedido (ped_codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_garcom FOREIGN KEY (ppe_garcom)
      REFERENCES garcom (gar_codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_cardapio FOREIGN KEY (ppe_cardapio)
      REFERENCES cardapio (car_codigo) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)