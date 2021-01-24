package main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Obuwie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idObuwia;
    private String marka;
    private String rozmiar;
    private String material;
    private double cena;

    public Obuwie() {
        this.marka = "";
        this.rozmiar = "";
        this.material = "";
        this.cena = 0;
    }

    public Obuwie(String marka, String rozmiar, String material, double cena) {
        this.marka = marka;
        this.rozmiar = rozmiar;
        this.material = material;
        this.cena = cena;
    }

    public Long getIdObuwia() {
        return idObuwia;
    }

    public void setIdObuwia(Long idObuwia) {
        this.idObuwia = idObuwia;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(String rozmiar) {
        this.rozmiar = rozmiar;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "main.Obuwie{" +
                "id=" + idObuwia +
                ", marka='" + marka + '\'' +
                ", rozmiar=" + rozmiar +
                ", material='" + material + '\'' +
                ", cena=" + cena +
                '}';
    }
}
