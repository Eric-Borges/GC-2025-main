

CREATE SCHEMA IF NOT EXISTS programacao_java;
CREATE SCHEMA IF NOT EXISTS ia_dados;

-- Apaga as tabelas se elas já existirem para evitar erros ao rodar o script de novo.
DROP TABLE IF EXISTS programacao_java.filmes_favoritos CASCADE;
DROP TABLE IF EXISTS programacao_java.autores CASCADE;

-- Cria a tabela de autores.
CREATE TABLE programacao_java.autores (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    nacionalidade VARCHAR(100)
);

-- Cria a tabela de filmes com a chave estrangeira.
CREATE TABLE programacao_java.filmes_favoritos (
    id SERIAL PRIMARY KEY,
    nome_integrante VARCHAR(255) NOT NULL,
    titulo_filme VARCHAR(255) NOT NULL,
    genero_filme VARCHAR(100),
    autor_id INTEGER,
    CONSTRAINT fk_autor FOREIGN KEY (autor_id) REFERENCES programacao_java.autores(id)
);

INSERT INTO programacao_java.autores (nome, nacionalidade) VALUES
('Francis Ford Coppola', 'Americano'),
('Christopher Nolan', 'Britanico'),
('Quentin Tarantino', 'Americano'),
('Peter Jackson', 'Neozelandes'),
('Lana Wachowski', 'Americana'),
('Lilly Wachowski', 'Americana'),
('Jonathan Demme', 'Americano'),
('Alfred Hitchcock', 'Britanico'),
('Denis Villeneuve', 'Canadense'),
('Fernando Meirelles', 'Brasileiro'),
('Jose Padilha', 'Brasileiro');

INSERT INTO programacao_java.filmes_favoritos (nome_integrante, titulo_filme, genero_filme) VALUES
('Ana', 'O Poderoso Chefao', 'Drama'),
('Ana', 'A Origem', 'Ficcao Cientifica'),
('Ana', 'Pulp Fiction', 'Crime'),
('Eric', 'O Senhor dos Aneis: A Sociedade do Anel', 'Fantasia'),
('Eric', 'Interestelar', 'Ficcao Cientifica'),
('Eric', 'Matrix', 'Acao'),
('Borges', 'O Silencio dos Inocentes', 'Terror'),
('Borges', 'Psicose', 'Terror'),
('Borges', 'Duna', 'Ficcao Cientifica');

-- Atualiza os filmes para associar cada um a um autor.
UPDATE programacao_java.filmes_favoritos SET autor_id = (SELECT id FROM programacao_java.autores WHERE nome = 'Francis Ford Coppola') WHERE titulo_filme = 'O Poderoso Chefao';
UPDATE programacao_java.filmes_favoritos SET autor_id = (SELECT id FROM programacao_java.autores WHERE nome = 'Christopher Nolan') WHERE titulo_filme = 'A Origem';
UPDATE programacao_java.filmes_favoritos SET autor_id = (SELECT id FROM programacao_java.autores WHERE nome = 'Quentin Tarantino') WHERE titulo_filme = 'Pulp Fiction';
UPDATE programacao_java.filmes_favoritos SET autor_id = (SELECT id FROM programacao_java.autores WHERE nome = 'Peter Jackson') WHERE titulo_filme = 'O Senhor dos Aneis: A Sociedade do Anel';
UPDATE programacao_java.filmes_favoritos SET autor_id = (SELECT id FROM programacao_java.autores WHERE nome = 'Christopher Nolan') WHERE titulo_filme = 'Interestelar';
UPDATE programacao_java.filmes_favoritos SET autor_id = (SELECT id FROM programacao_java.autores WHERE nome = 'Lana Wachowski') WHERE titulo_filme = 'Matrix';
UPDATE programacao_java.filmes_favoritos SET autor_id = (SELECT id FROM programacao_java.autores WHERE nome = 'Jonathan Demme') WHERE titulo_filme = 'O Silencio dos Inocentes';
UPDATE programacao_java.filmes_favoritos SET autor_id = (SELECT id FROM programacao_java.autores WHERE nome = 'Alfred Hitchcock') WHERE titulo_filme = 'Psicose';
UPDATE programacao_java.filmes_favoritos SET autor_id = (SELECT id FROM programacao_java.autores WHERE nome = 'Denis Villeneuve') WHERE titulo_filme = 'Duna';

SELECT titulo_filme FROM programacao_java.filmes_favoritos;

SELECT titulo_filme FROM programacao_java.filmes_favoritos WHERE titulo_filme LIKE 'A%' OR titulo_filme LIKE 'D%';

SELECT titulo_filme FROM programacao_java.filmes_favoritos WHERE genero_filme = 'Terror';

SELECT titulo_filme FROM programacao_java.filmes_favoritos WHERE titulo_filme LIKE '%e';

SELECT ff.titulo_filme, a.nome AS nome_do_autor FROM programacao_java.filmes_favoritos AS ff INNER JOIN programacao_java.autores AS a ON ff.autor_id = a.id;

SELECT ff.titulo_filme, a.nome AS nome_do_autor FROM programacao_java.filmes_favoritos AS ff INNER JOIN programacao_java.autores AS a ON ff.autor_id = a.id WHERE a.nacionalidade = 'Brasileiro';

SELECT a.nome AS nome_do_autor, COUNT(ff.id) AS quantidade_de_filmes FROM programacao_java.autores AS a JOIN programacao_java.filmes_favoritos AS ff ON a.id = ff.autor_id GROUP BY a.nome ORDER BY quantidade_de_filmes DESC;