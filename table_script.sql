CREATE TABLE person (
  id int noT NULL,
  first_name VARCHAR(120) NOT NULL,  
  last_name VARCHAR(120) NOT NULL, 
  age int,
  PRIMARY KEY(id)
);

select * from person 

drop table person;
delete from person

CREATE SEQUENCE person_id_seq;