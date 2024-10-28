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

DROP TABLE BachelorProgrammer;
DROP TABLE Moduler;
DROP TABLE Kurser;
DROP TABLE Projekter;

     */
    public static void main(String[] args) {



    }
}