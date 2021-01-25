DROP TABLE IF EXISTS obuwie;
DROP TABLE IF EXISTS klient;
DROP TABLE IF EXISTS zamowienie;

CREATE TABLE obuwie (
                              idObuwia INT AUTO_INCREMENT  PRIMARY KEY,
                              marka VARCHAR(250) NOT NULL,
                              rozmiar VARCHAR (250) NOT NULL,
                              material VARCHAR(250) NOT NULL,
                              cena double NOT NULL
);

CREATE TABLE klient (
                        idKlienta INT AUTO_INCREMENT  PRIMARY KEY,
                        imie VARCHAR(250) NOT NULL,
                        nazwisko VARCHAR(250) NOT NULL,
                        email VARCHAR (250) NOT NULL,
                        haslo VARCHAR(30) NOT NULL,
                        nrTelefonu VARCHAR (9),
                        ulica VARCHAR(250),
                        miasto VARCHAR(250),
                        kodPocztowy VARCHAR(6)
);

CREATE TABLE zamowienie (
                        idZamowienia INT AUTO_INCREMENT  PRIMARY KEY,
                        nrZamowienia INT NOT NULL,
                        data DATE,
                        suma INT
);

--stworzyć tabele dla klient i zamowienie

INSERT INTO obuwie (marka, rozmiar, material, cena) VALUES
('Adidas', '38-42', 'Skóra', 420),
('Nike', '36-48', 'Zamsz', 300),
('Vans', '40-50', 'Tworzywo sztuczne', 250);

INSERT INTO klient (imie, nazwisko, email, haslo) VALUES
('Adam', 'Kowalski', 'adam.kowalski@gmail.com', 'password'),
('Anna', 'Nowak', 'anna.nowak@gmail.com', 'passsssss'),
('Magdalena', 'Kudr', 'magdalena.kudr@gmail.com', 'pswrd');

INSERT INTO zamowienie (nrZamowienia) VALUES
(12345),
(12346),
(12347);