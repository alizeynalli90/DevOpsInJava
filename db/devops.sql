CREATE DATABASE IF NOT EXISTS devops_schema;
 
USE devops_schema;

DROP TABLE IF EXISTS books;

CREATE TABLE books (
  id int(12) NOT NULL AUTO_INCREMENT,
  title varchar(120) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO books VALUES (
1, 'Kafka'
);