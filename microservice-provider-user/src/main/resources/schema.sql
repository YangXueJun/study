DROP TABLE user if EXISTS;
CREATE TABLE user(
  id bigint generated BY  DEFAULT  as IDENTITY ,
  username VARCHAR (40),
  name VARCHAR (20),
  age INT (3),
  balance DECIMAL (10,2) ,
  PRIMARY KEY (id)
);