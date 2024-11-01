public class Main {

    /* SQL commands
    CREATE TABLE BachelorProgrammer (
    programNavn String primary key
);


CREATE TABLE Moduler (
    modulNavn String primary key
);

CREATE TABLE Kurser (
    kursusNavn String primary key,
    modulNavn String,
    programNavn String,
    ects int,
    FOREIGN KEY (programNavn) references BachelorProgrammer (programNavn),
    FOREIGN KEY (modulNavn) references Moduler(modulNavn)
);

CREATE TABLE Projekter (
    projektNavn String primary key,
    modulNavn String,
    programNavn String,
    ects int,
    FOREIGN KEY (modulNavn) references Moduler(modulNavn),
    FOREIGN KEY (programNavn) references BachelorProgrammer (programNavn)
);

insert into BachelorProgrammer values ('Bach1');

insert into Moduler values ('Mod1');
insert into Moduler values ('Mod2');

insert into Kurser values ('Kurs1', 'Mod1', 'Bach1', 5);
insert into Kurser values ('Kurs2', 'Mod1', 'Bach1', 10);

insert into Kurser values ('Kurs3', 'Mod2', 'Bach1', 5);
insert into Kurser values ('Kurs4', 'Mod2', 'Bach1', 10);

insert into Kurser values ('Kurs5', Null, 'Bach1', 10);
insert into Kurser values ('Kurs6', Null, 'Bach1', 10);

insert into Projekter values ('Proj1', 'Mod1', 'Bach1', 15);
insert into Projekter values ('Proj2', 'Mod2', 'Bach1', 15);

insert into Projekter values ('Proj3', NULL, 'Bach1', 15);
insert into Projekter values ('Proj4', 'BachelorProjekt', 'Bach1', 15);


select * from Kurser;
select * from Projekter;

select kursusNavn from Kurser where programNavn='Bach1';

select kursusNavn from Kurser where modulNavn='Mod2';
select kursusNavn from Kurser where modulNavn is NULL;

select projektNavn from Projekter where modulNavn='Mod2';
select projektNavn from Projekter where modulNavn='Mod1';
select projektNavn from Projekter where modulNavn='BachelorProjekt';
select projektNavn from Projekter where modulNavn is null ;

select SUM(Kurser.kursusEcts)
as 'ECTS'
from Kurser
I
;

select SUM(Projekter.ects)
as 'ECTS'
from Projekter
INNER JOIN Kurser K on Projekter.ects = K.ects
where K.programNavn='Bach1' AND
      Projekter.programNavn='Bach1'
;

SELECT SUM(ects)
as 'ECTS'
from (select SUM(Kurser.ects) ects
      from Kurser
        where programNavn='Bach1'
      UNION ALL
      select SUM(Projekter.ects) ects
      from Projekter
        where programNavn='Bach1'
      );


DROP TABLE BachelorProgrammer;
DROP TABLE Moduler;
DROP TABLE Kurser;
DROP TABLE Projekter;

     */
    public static void main(String[] args) {



    }
}