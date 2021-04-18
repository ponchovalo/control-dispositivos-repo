INSERT INTO `impresoras` (nombre, modelo, serie, ip, mac, edificio, ubicacion) VALUES('INFORMATICA', 'C356IF', '2QC07011', '10.222.17.240', '0000.0000.0000', 'EDIFICIO DE GOBIERNO', 'INFORMATICA');

INSERT INTO `usuarios` (username, password, nombre, puesto, enabled) VALUES('admin', '$2a$10$hRBTAZ6wdOo2msxWzkw2G.WGqM2T7FPs1a5QZ20eaiSvsIdYUwOcu', 'Ildefonso Valenzuela', 'Especialista', 1);
INSERT INTO `usuarios` (username, password, nombre, puesto, enabled) VALUES('Jdiaz', '$2a$10$hRBTAZ6wdOo2msxWzkw2G.WGqM2T7FPs1a5QZ20eaiSvsIdYUwOcu', 'Jesus Diaz', 'Especialista', 1);

INSERT INTO `roles` (name) VALUES('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, roles_id) VALUES(1, 1);
INSERT INTO `usuarios_roles` (usuario_id, roles_id) VALUES(,2 1);

INSERT INTO `controltoner` (contador102, contador109, contador124, fecha, toner, impresora_id, usuario_id) VALUES(100, 50, 50, '2021-04-14', 'negro', 1, 1);

