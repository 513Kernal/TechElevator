--create database database_name

BEGIN TRANSACTION


CREATE DATABASE artgallery


--to drop a table
--DROP TABLE table_name
--DROP TABLE IF EXISTS table_name
DROP TABLE IF EXISTS something;


--create tables
/*
create table table_name
(
        column_name1 data_type(size),
        column_name2 data_type(size), NOT NULL,
        CONSTRAINT pk_column1 PRIMARY KEY (column_name1),
        CONSTRAINT fk_column2 FOREIGN KEY (column_name2) REFERENCES table_name2(columnD)
        
);
       
*/

CREATE TABLE customers
(
  customerID SERIAL,
  name varchar(64) NOT NULL,
  address varchar(100) NOT NULL,
  phone varchar (11) NULL, 

CONSTRAINT pk_customers PRIMARY KEY(customerID)

);

--create a table to hold the artists - this has the artistid, first name and lastname, and id is the pk
DROP TABLE IF EXISTS artists
CREATE TABLE artists
(
  artist_ID SERIAL,
  first_name varchar(64) NOT NULL,
  last_name varchar(64) NULL,
  

CONSTRAINT pk_artists PRIMARY KEY(artist_ID)

);


--create a table for the art that has the artcodeid, a title, and the artist

CREATE TABLE art (
        art_code_id SERIAL,
        title varchar(64) NOT NULL,
        who_did_it int NOT NULL, 
        --if the artist_id is serial, 
        --my fk to it needs to be int. 
        --if the artist_id was a varchar,
        --then this would be varchar
        
        CONSTRAINT pk_art PRIMARY KEY (art_code_id),
        CONSTRAINT fk_art_who_did_it_ref_artist_id FOREIGN KEY (who_did_it) REFERENCES artists(artist_id)
);

--ALTER TABLE
/*
ALTER TABLE table_name
ADD CONSTRAINT pk_constraint_name PRIMARY KEY (column);

ALTER TABLE table_name
ADD CONSTRAINT fk_constraint_name FOREIGN KEY (columnb) REFERENCES other_table_name(column_in_other_table);

ALTER TABLE table_name
ADD CONSTRAINT check_constraint_name CHECK (column = 'value' OR column_name IN (values));

ALTER TABLE table_name
ADD CONSTRAINT check_continents CHECK (continent IN ('North America', 'South America', 'Africa'));