DROP TABLE IF EXISTS MEDECINS;
CREATE TABLE medecins(ID BigInt auto_increment PRIMARY KEY,  version int not null, titre VARCHAR(5) not null, nom VARCHAR(30) not null, prenom VARCHAR(30) not null);


DROP TABLE IF EXISTS clients;
CREATE TABLE clients(ID BigInt auto_increment PRIMARY KEY,  version int not null, titre VARCHAR(5) not null, nom VARCHAR(30) not null, prenom VARCHAR(30) not null);


DROP TABLE IF EXISTS creneaux;
DROP TABLE IF EXISTS crenaux;

CREATE TABLE creneaux(ID BigInt auto_increment PRIMARY KEY,  version int not null, hdebut int not null, mdebut int not null, hfin int not null, mfin int not null, id_medecin int not null);
ALTER TABLE creneaux  ADD FOREIGN KEY (id_medecin) REFERENCES medecins (id);


DROP TABLE IF EXISTS RV;
CREATE TABLE RV(ID BigInt auto_increment PRIMARY KEY,  jour date not null, id_client bigint not null, id_crenau bigint not null);
ALTER TABLE RV ADD FOREIGN KEY (id_crenau) REFERENCES creneaux(id);
ALTER TABLE RV ADD FOREIGN KEY (id_client) REFERENCES clients (id);





insert into medecins ( nom, prenom , titre , version ) values ( 'BenAhlmoud', 'Momoahmed','M',1);
insert into medecins ( nom, prenom , titre , version ) values ( 'Git', 'Pierre','M',1);

insert into clients ( nom, prenom , titre , version ) values ( 'Dupont', 'Lajoie','Melle',1);
insert into clients( nom, prenom , titre , version ) values ( 'GitHub', 'Pierre','M',1);
insert into clients( nom, prenom , titre , version ) values ( 'Lapu', 'Pierre','Mme',1);

insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values ( 1, 1 , 8 , 0 , 8 , 20);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values ( 1, 1 , 8 , 20 , 8 , 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 8 , 40 , 9 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 9 , 20 , 9 , 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 9 , 40 , 10 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 10 , 20 , 10, 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 10 , 40 , 11 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 11 , 20 , 11 , 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 11 , 40 , 12 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 15 , 20 , 15 , 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 15 , 40 , 16 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 16 , 0 , 16 , 20);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 16 , 20 , 16 , 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 16 , 40 , 17 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 17 , 0 , 16 , 20);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 17 , 20 , 17 , 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 17 , 40 , 18 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 18 , 20 , 18 , 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 1 , 18 , 40 , 19 , 0);

insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 2 , 8 , 0 , 8 , 20);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 2 , 8 , 20 , 8 , 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 2 , 8 , 40 , 9 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 2 , 9 , 40 , 10 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 2 , 11 , 20 , 11 , 40);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 2 , 15 , 40 , 16 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 2 , 16 , 40 , 17 , 0);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 2 , 17 , 0 , 16 , 20);
insert into creneaux(version, id_medecin, hdebut , mdebut , hfin , mfin) values( 1, 2 , 17 , 40 , 18 , 0);

insert into  rv( jour , id_client ,id_crenau ) values (today(),1,2);
insert into  rv( jour , id_client ,id_crenau ) values (today(),1,10);
insert into  rv( jour , id_client ,id_crenau ) values (today(),2,4);
insert into  rv( jour , id_client ,id_crenau ) values (today(),2,5);
