------------------------------------------------------------
--        Script Postgre
------------------------------------------------------------

------------------------------------------------------------
-- Table: Article
------------------------------------------------------------
CREATE TABLE public.Article(
	id_article    SERIAL NOT NULL ,
	Title         VARCHAR (50) NOT NULL ,
	Date          DATE  NOT NULL ,
	Description   VARCHAR (50) NOT NULL ,
	Source        VARCHAR (50) NOT NULL ,
	Image         VARCHAR (50) NOT NULL ,
	Lieu          VARCHAR (50) NOT NULL  ,
	CONSTRAINT Article_PK PRIMARY KEY (id_article)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Personne
------------------------------------------------------------
CREATE TABLE public.Personne(
	Id_personne   SERIAL NOT NULL ,
	Nom           VARCHAR (16) NOT NULL ,
	Prenom        VARCHAR (16) NOT NULL ,
	Description   VARCHAR (16) NOT NULL  ,
	CONSTRAINT Personne_PK PRIMARY KEY (Id_personne)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: Bateau
------------------------------------------------------------
CREATE TABLE public.Bateau(
	Id_Bateau     SERIAL NOT NULL ,
	Nom           VARCHAR (16) NOT NULL ,
	Img_bateau    VARCHAR (50) NOT NULL ,
	Description   VARCHAR (50) NOT NULL  ,
	CONSTRAINT Bateau_PK PRIMARY KEY (Id_Bateau)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: rel1
------------------------------------------------------------
CREATE TABLE public.rel1(
	id_article    SERIAL NOT NULL ,
	Id_personne   SERIAL NOT NULL  ,
	CONSTRAINT rel1_PK PRIMARY KEY () ,
	CONSTRAINT rel1_AK UNIQUE (id_article,Id_personne)
)WITHOUT OIDS;


------------------------------------------------------------
-- Table: relation_personne_bateau
------------------------------------------------------------
CREATE TABLE public.relation_personne_bateau(
	Id_Bateau     INT  NOT NULL ,
	Id_personne   INT  NOT NULL  ,
	CONSTRAINT relation_personne_bateau_PK PRIMARY KEY (Id_Bateau,Id_personne)

	,CONSTRAINT relation_personne_bateau_Bateau_FK FOREIGN KEY (Id_Bateau) REFERENCES public.Bateau(Id_Bateau)
	,CONSTRAINT relation_personne_bateau_Personne0_FK FOREIGN KEY (Id_personne) REFERENCES public.Personne(Id_personne)
)WITHOUT OIDS;



