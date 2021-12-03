------------------------------------------------------------
-- Table: Article
------------------------------------------------------------
CREATE TABLE Article(
	id_article    SERIAL NOT NULL ,
	Title         VARCHAR (50) NOT NULL ,
	Date          DATE  NOT NULL ,
	Description   VARCHAR (10000) NOT NULL ,
	Source        VARCHAR (50) NOT NULL ,
	Image         VARCHAR (50) NOT NULL ,
	Lieu          VARCHAR (50) NOT NULL  ,
	CONSTRAINT Article_PK PRIMARY KEY (id_article)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Personne
------------------------------------------------------------
CREATE TABLE Personne(
	Id_personne   SERIAL NOT NULL ,
	Nom           VARCHAR (32) NOT NULL ,
	Prenom        VARCHAR (32) NOT NULL ,
	Description   TEXT NOT NULL,
	CONSTRAINT Personne_PK PRIMARY KEY (Id_personne)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Bateau
------------------------------------------------------------
CREATE TABLE Bateau(
	Id_Bateau     SERIAL NOT NULL ,
	Nom           VARCHAR (32) NOT NULL ,
	Img_bateau    VARCHAR (50) NOT NULL ,
	Description   VARCHAR(500) NOT NULL  ,
	CONSTRAINT Bateau_PK PRIMARY KEY (Id_Bateau)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: rel1
------------------------------------------------------------
CREATE TABLE rel1(
	id_article    SERIAL NOT NULL ,
	Id_personne   SERIAL NOT NULL  ,
	CONSTRAINT rel1_AK UNIQUE (id_article,Id_personne)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: relation_personne_bateau
------------------------------------------------------------
CREATE TABLE relation_personne_bateau(
	Id_Bateau     INT  NOT NULL ,
	Id_personne   INT  NOT NULL  ,
	CONSTRAINT relation_Personne_bateau_PK PRIMARY KEY (Id_Bateau,Id_personne)

	,CONSTRAINT relation_Personne_bateau_Bateau_FK FOREIGN KEY (Id_Bateau) REFERENCES Bateau(Id_Bateau)
	,CONSTRAINT relation_Personne_bateau_Personne_FK FOREIGN KEY (Id_personne) REFERENCES Personne(Id_personne)
)WITHOUT OIDS;

alter table Personne alter column description TYPE text;

delete from Personne where Id_personne='1';
delete from Personne where Id_personne='2';
delete from Personne where Id_personne='3';

insert into Personne values ('1','ALEXIS','JOFFROY','');
insert into Personne values ('3','ALEXIS','JOFFROY','tedddddd' );
