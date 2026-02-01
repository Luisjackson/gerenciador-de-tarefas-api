
CREATE TABLE usuario (
    id_usuario BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    senha VARCHAR(255),
    telefone VARCHAR(255)
);

CREATE TABLE tarefa (
    id_tarefa BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    descricao VARCHAR(255),
    status VARCHAR(50),
    data_inicio DATE,
    data_final DATE,
    usuario_id_usuario BIGINT,
    CONSTRAINT fk_tarefa_usuario FOREIGN KEY (usuario_id_usuario) REFERENCES usuario(id_usuario)
);