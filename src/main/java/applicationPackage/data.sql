DROP TABLE IF EXISTS obuwie;

CREATE TABLE obuwie (
                              idObuwia INT AUTO_INCREMENT  PRIMARY KEY,
                              marka VARCHAR(250) NOT NULL,
                              rozmiar int NOT NULL,
                              material VARCHAR(250) NOT NULL,
                              cena double NOT NULL
);

INSERT INTO obuwie (marka, rozmiar, material, cena) VALUES
('Adidas', 42, 'Skóra', 420),
('Nike', 38, 'Zamsz', 300),
('Vans', 40, 'Tworzywo sztuczne', 250);