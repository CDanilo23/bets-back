INSERT INTO `test`.`hipodromo` (`idhipodromo`,`name`) VALUES (1, 'hipodromo1' );
INSERT INTO `test`.`hipodromo` (`idhipodromo`,`name`) VALUES (2, 'hipodromo2' );
INSERT INTO `test`.`hipodromo` (`idhipodromo`,`name`) VALUES (3, 'hipodromo3' );

INSERT INTO `test`.`bet`(`idbet`,`name`) VALUES (1, 'bet1' );
INSERT INTO `test`.`bet`(`idbet`,`name`) VALUES (2, 'bet2' );
INSERT INTO `test`.`bet`(`idbet`,`name`) VALUES (3, 'bet3' );

INSERT INTO `test`.`tipoapuesta`(`idtipoapuesta`,`name`) VALUES (1, 'Pick-2' );
INSERT INTO `test`.`tipoapuesta`(`idtipoapuesta`,`name`) VALUES (2, 'Pick-3' );
INSERT INTO `test`.`tipoapuesta`(`idtipoapuesta`,`name`) VALUES (3, 'Exacta' );

INSERT INTO `test`.`moneda`(`idmoneda`,`name`,`valor`,`valordolar`) VALUES (1,'$100', 300000,100);
INSERT INTO `test`.`moneda`(`idmoneda`,`name`,`valor`,`valordolar`) VALUES (2,'$50', 150000,50);
INSERT INTO `test`.`moneda`(`idmoneda`,`name`,`valor`,`valordolar`) VALUES (3,'$25', 75000,25);

INSERT INTO `test`.`monto`(`idmontoparrilla`,`name`,`valor`) VALUES (1,'$0.10',0.10);
INSERT INTO `test`.`monto`(`idmonto`,`name`,`valor`) VALUES (2,'$0.20',0.20);
INSERT INTO `test`.`monto`(`idmonto`,`name`,`valor`) VALUES (3,'$0.30',0.30);

INSERT INTO `test`.`race`(`idrace`,`numrace`) VALUES (1, 1);
INSERT INTO `test`.`hourse`
(`idhourse`,
`hourse1`,
`hourse2`,
`hourse3`,
`hourse4`,
`hourse5`,
`hourse6`,
`hourse7`,
`hourse8`,
`hourse9`,
`hourse10`,
`hourse11`,
`hourse12`,
`hourse13`,
`hourse14`,
`hourse15`,
`hourse16`,
`idrace`)
VALUES (1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);




