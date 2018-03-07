.open projet_tortue.db
PRAGMA foreign_keys = OFF;

drop table if exists PROFESSEUR;
drop table if exists CLASSE;
drop table if exists ELEVE;
drop table if exists TENTATIVE;
drop table if exists EXERCICE;
drop table if exists MODELE;

PRAGMA foreign_keys = ON;

create table PROFESSEUR (
    loginP varchar(30) primary key not null,
    mdpP varchar(30) not null,
    prenomP varchar(30) not null,
    nomP varchar(30) not null
);

create table ELEVE (
    loginE varchar(30) primary key not null,
    mdpE varchar(30) not null,
    prenomE varchar(30) not null,
    nomE varchar(30) not null
);

create table CLASSE (
    idC integer primary key asc autoincrement not null,
    loginP varchar(30) references PROFESSEUR(loginP) on update cascade on delete cascade not null,
    loginE varchar(30) references ELEVE(loginE) on update cascade on delete cascade not null
);

create table TENTATIVE (
    idT integer primary key not null,
    dateT date not null,
    appreciation varchar(30) not null,
    commentaire varchar(50) not null,
    scriptT varchar(50) not null,
    loginP varchar(30) references PROFESSEUR(loginP) on update cascade on delete cascade not null,
    loginE varchar(30) references ELEVE(loginE) on update cascade on delete cascade not null
);

create table MODELE (
    idM integer primary key not null,
    scriptM varchar(50) not null,
    loginP varchar(30) references PROFESSEUR(loginP) on update cascade on delete cascade not null
);

create table EXERCICE (
    idE integer primary key asc autoincrement not null,
    idM integer references MODELE(idM) on update cascade on delete cascade not null,
    idT integer references TENTATIVE(idT) on update cascade on delete cascade not null
);

insert into PROFESSEUR values ("toto", "toto", "toto", "toto");
insert into ELEVE values ("tata", "tata", "tata", "tata");
insert into CLASSE (loginP, loginE) values ("toto", "tata");

insert into TENTATIVE values (1, "2015-09-15", "pas trop mal", "fait mieux", "first try", "toto", "tata");
insert into MODELE values (1, "premier exo", "toto");
insert into EXERCICE (idM, idT) values (1, 1);
